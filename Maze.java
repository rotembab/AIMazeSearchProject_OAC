
public class Maze {

	private boolean[][] maze;
	private int d;
	
	public Maze(int d) {
		this.d = d;
		maze = new boolean[d][d];
	}

	//boolean b is for BLOCKED Path
	public void set(int i, int j, boolean b) {
		maze[i][j] = b;
	}


	//We need a method for get Path's childs
}
