import java.util.Stack;

// you need to complete the implementation of the class
public class Solution {
	public Path Goal;//All the nodes that has been
	public int nodeSearched;
	private Stack<Path> toPrint = new Stack<Path>();
	
	public int getNodeSearched() {
		return nodeSearched;
	}

	public void setNodeSearched(int nodeSearched) {
		this.nodeSearched = nodeSearched;
	}

	public void print() {
		recursiveForStack(Goal);
		System.out.printf("(search %d nodes; path length: %d):",nodeSearched,toPrint.size());
		while(!toPrint.isEmpty()) {
			System.out.print(toPrint.pop());
		}
		
		System.out.print("\n");
	}
	
	private void recursiveForStack(Path p) {
			toPrint.add(p);
			if(p.getParent()==null)
				return;
			recursiveForStack(p.getParent());
	}
	
	public Path getGoal() {
		return Goal;
	}

	public void setGoal(Path goal) {
		Goal = goal;
	}

	//TODO: THERE SHOULD BE A SAVE TO FILE METHOD
}
