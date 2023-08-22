import java.util.Comparator;

public class UCSComparator implements Comparator<Path> {
	//This file is about Comparing objects as a cost
	@Override
	public int compare(Path p1, Path p2) {
		// your implementation...
		//Compare the 2 paths with only the cost of each.
		
		int c1 = p1.getCostSoFar();
		int c2 = p2.getCostSoFar();
		
		return c1-c2;
	}
}