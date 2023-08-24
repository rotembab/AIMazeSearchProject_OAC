import java.util.HashSet;
import java.util.Set;

public class Maze {

	private static boolean[][] maze;
	private static int d;
	private Path Start;
	public static int GoalI;
	public static  int GoalJ;
	private static int[][] directions = {
		    {-1, 0},  // Up
		    {1, 0},   // Down
		    {0, -1},  // Left
		    {0, 1}    // Right
	};
	
	
	public Maze(int d) {
		this.d = d;
		maze = new boolean[d][d];
		Start = new Path(0,0,null);
		GoalI =d-1;
		GoalJ =d-1;
	}

	//boolean b is for BLOCKED Path
	
	public void set(int i, int j, boolean b) {
		maze[i][j] = b;
	}
	public Path getStart() {
		return Start;
	}
	
	
	
	
	public static Set<Path> createPathChildren(Path p) { 
		
		Set<Path> children = new HashSet<Path>();
		for (int[] direction : directions) {
		    int newI = p.getI() + direction[0];
		    int newJ = p.getJ() + direction[1];
		    
		    if (isValid(newI, newJ, d-1)) {
		    	Path addP = new Path(newI, newJ, p);
		    	if(p.getParent()!=null && p.getParent().equals(addP))
		    		children.add(p.getParent());
		    	else
		    		children.add(addP);
		    }
		}
		return children;
	}
	private static boolean isValid(int i, int j, int bound) {
	    return ((i >= 0) && (i <= bound)&& (j >= 0) && (j <= bound)&&(maze[i][j]!=true));
	}
	
	public static double calculateHeurisitc(Path p) {
		
	      double dx = p.getI() - GoalI;
	       double dy = p.getJ()- GoalJ;
	       return Math.sqrt(dx * dx + dy * dy);
	}
}
