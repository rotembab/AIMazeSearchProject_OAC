import java.util.HashSet;
import java.util.Set;

public class Path {
    //This is a Path node
    private int x;
	private int y;
    private double heuristicDistance;
    private Set<Path> children = new HashSet<Path>(); //Contains all children
    private int CostSoFar;
    
    public Path(int x,int y) {
    	this.x=x;
    	this.y=y;
    	
    	//TODO: ADD MORE THINGS IN HERE
    }
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getHeuristicDistance() {
		return heuristicDistance;
	}

	public void setHeuristicDistance(double heuristicDistance) {
		this.heuristicDistance = heuristicDistance;
	}
    
    public Set<Path> getChildren(){
    	return children;
    }
    
    public int getCostSoFar(){
    	return CostSoFar;
    }
    
    public boolean equals(Path p) {
    	return (p.x==this.x && p.y==this.y);
    }
    
}
