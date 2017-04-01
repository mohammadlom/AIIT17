package course.ai.ui;

/**
 * Created by mohammad_lom on 3/31/17.
 */
public class Node {
    String name;
    City neighbours[];
    int huristicToNeighbours [];

    public Node(String name, City[] neighbours, int[] huristicToNeighbours) {
        this.name = name;
        this.neighbours = neighbours;
        this.huristicToNeighbours = huristicToNeighbours;
    }
}
