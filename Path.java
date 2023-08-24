import java.util.HashSet;
import java.util.Set;

public class Path {
    //This is a Path node
    private int i;
	private int j;
    private double heuristicDistance;
    private Set<Path> children = new HashSet<Path>(); //Contains all children
    private int CostSoFar;
    private Path parent;
    
    public Path getParent() {
		return parent;
	}

	public Path(int i,int j,Path parent) {
    	this.i=i;
    	this.j=j;
    	this.parent=parent;
    	if(parent!=null)
    		this.CostSoFar = parent.getCostSoFar()+1;
    	else {
    		this.CostSoFar=0; //Root of the tree
    	}
    }
    
    public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}


	public double getHeuristicDistance() {//Calculates the heuristic and returns it
		this.heuristicDistance=Maze.calculateHeurisitc(this);
		return heuristicDistance;
	}
    
    public Set<Path> getChildren(){ //Get the children nodes from Maze and returns them
    	children = Maze.createPathChildren(this);
    	return children;
    }
    
    public int getCostSoFar(){
    	return CostSoFar;
    }
    
    public boolean equals(Path p) {
    	return p.getI()==this.i&&p.getJ()==this.j;
    }
    
    public String toString() {
    	return "("+(this.i+1)+","+(this.j+1)+")";
    }
    
    
}
