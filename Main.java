import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Parser parser = new Parser(); //Parse the input to a maze
		Maze maze = parser.parse(args[0]); //this is the maze to go through
		
		System.out.print("Astar ");
		AStarSearch astar = new AStarSearch(maze);
		Solution solution1 = astar.search();
		solution1.print();
		
		System.out.print("UCS ");
		UCSSearch ucs = new UCSSearch(maze);
		Solution solution2 = ucs.search();
		solution2.print();
		
		System.out.print("Greedy ");
		GreedySearch greedy = new GreedySearch(maze);
		Solution solution3 = greedy.search();
		solution3.print();
		
		//TODO: MAKE A FILE OF HOW TO USE THIS WITH OUTPUT EXAMPLES.
		
	}
}
