
// you need to complete the implementation of the class
public class Solution {
	public Path Goal;//All the nodes that has been
	
	public void print() {
		recursivePrint(Goal);
	}
	
	private void recursivePrint(Path p) {
			System.out.printf("(%d,%d)",p.getI()+1,p.getJ()+1);
			if(p.getParent()==null)
				return;
	}
	
	public Path getGoal() {
		return Goal;
	}

	public void setGoal(Path goal) {
		Goal = goal;
	}

	//TODO: THERE SHOULD BE A SAVE TO FILE METHOD
}
