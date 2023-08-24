import java.util.Stack;


// you need to complete the implementation of the class
public class Solution {
	public Path Goal;//All the nodes that has been
	public int nodeSearched;
	private Stack<Path> toPrint = new Stack<Path>();
	private String Output;
	
	public String getOutput() {
		return Output;
	}

	public void setOutput(String output) {
		Output = output;
	}

	public int getNodeSearched() {
		return nodeSearched;
	}

	public void setNodeSearched(int nodeSearched) {
		this.nodeSearched = nodeSearched;
	}
	
	private String Output() {
		recursiveForStack(Goal);
		String str = "(search %d nodes; path length: %d):";
		str = String.format(str, nodeSearched, toPrint.size());
		while(!toPrint.isEmpty()) {
			str+=(toPrint.pop());
		}
		
		str+="\n";
		Output=str;
		return str;
	}

	public void print() {
		System.out.print(Output());
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
