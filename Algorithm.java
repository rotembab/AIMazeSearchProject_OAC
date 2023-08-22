import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Algorithm {

	protected Maze maze; //Given a  Maze
	protected Comparator<Path> comparator; //The Comparator that decides which path to take
	//The comparator is different with every search Algorithm But this algorithm stays pretty much the same.
	protected Set<Path> visited = new HashSet<Path>(); //Contains all children
	protected Path Goal;
	protected PriorityQueue<Path> frontier = new PriorityQueue<Path>(comparator); //Set the comparing in the priority queue
	
	public Algorithm(Maze maze) {
		this.maze = maze;
	}
	
	public Solution search() {
		
		while(!frontier.isEmpty()){
			Path currentState = frontier.remove();
			if(!visited.contains(currentState)) {
				visited.add(currentState);
				if(Goal.equals(currentState)) {
					//return currentState; //TODO: EDIT THIS FUNCTION
				}
				for (Path p : currentState.getChildren()) {
					frontier.add(p);
				}	
			}
		}
		return null;
	}
}
