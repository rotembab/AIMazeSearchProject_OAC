import java.util.Comparator;
import java.util.PriorityQueue;

public class Algorithm {

	protected Maze maze;
	protected Comparator<Path> comparator;
	
	public Algorithm(Maze maze) {
		this.maze = maze;
	}
	
	public Solution search() {
		PriorityQueue<Path> frontier = new PriorityQueue<Path>(comparator);
		
		// algorithm...
		//I only need to write this here and the algorithm will execute on all searches

		return null;
	}
}
