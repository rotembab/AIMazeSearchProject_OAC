
public class Path {
    //This is a Path node
    private int x;
    private int y;
    private double costToTarget;
    private double heuristicDistance;
    private Set<Path> children = new HashSet<>(); //Contains all children

}
