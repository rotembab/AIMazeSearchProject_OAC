import java.util.Comparator;

public class AStarComparator implements Comparator<Path> {
	
	@Override
	public int compare(Path p1, Path p2) {

		//Compare the 2 paths with the cost and heuristics of each.
		double d1 =  p1.getHeuristicDistance();
		double d2 =  p2.getHeuristicDistance();
		int c1 = p1.getCostSoFar();
		int c2 = p2.getCostSoFar();
		
		double total1 = d1+c1;
		double total2= d2+c2;
		 return Double.compare(total1, total2);
	}
	
}
