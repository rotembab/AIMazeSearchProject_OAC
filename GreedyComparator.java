import java.util.Comparator;

public class GreedyComparator implements Comparator<Path> {
	
	@Override
	public int compare(Path p1, Path p2) { //Compare heuristics
		// your implementation...
		//Compare the 2 paths with only the heuristics.
		
		double d1 =  p1.getHeuristicDistance();
		double d2 =  p2.getHeuristicDistance();
		 return Double.compare(d1, d2);
	}
}
