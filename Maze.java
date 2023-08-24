import java.util.HashSet;
import java.util.Set;

public class Maze {

	private boolean[][] maze;
	private static int d;
	private Path Start;
	public static int GoalI;
	public static  int GoalJ;
	
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
	
	public static Set<Path> createPathChildren(Path p) { 
		Set<Path> children = new HashSet<Path>();
		if(p.getI()>0) {//Up Child
			Path addP = new Path(p.getI()-1,p.getJ(),p);
			children.add(addP);
		}
		if(p.getI()<d) {//Down Child
			Path addP = new Path(p.getI()+1,p.getJ(),p);
			children.add(addP);
		}
		if(p.getJ()>0){//Left Child
			Path addP = new Path(p.getI(),p.getJ()-1,p);
			children.add(addP);
		}if(p.getJ()<d) {//Right Child
			Path addP = new Path(p.getI(),p.getJ()+1,p);
			children.add(addP);
		}
		return children;
	}
	
	
	public static double calculateHeurisitc(Path p) {
		
	      double dx = p.getI() - GoalI;
	       double dy = p.getJ()- GoalJ;
	       return Math.sqrt(dx * dx + dy * dy);
	}
}
