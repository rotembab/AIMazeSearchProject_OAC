import java.util.Comparator;
import java.util.PriorityQueue;

public class Algorithm {

	protected Maze maze; //Given a  Maze
	protected Comparator<Path> comparator; //The Comparator that decided which path to take
	//The comparator is differect with every search Algorithm But this algorithm stays pretty much the same.
	protected PriorityQueue<Path> fringe = new PriorityQueue<Path>();
	
	public Algorithm(Maze maze) {
		this.maze = maze;
	}
	
	public Solution search() {
		PriorityQueue<Path> frontier = new PriorityQueue<Path>(comparator);
		
		// algorithm...
		//I only need to write this here and the algorithm will execute on all searches
		while(){

		}

		return null;
	}
}
