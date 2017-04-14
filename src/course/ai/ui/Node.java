package course.ai.ui;

import java.util.ArrayList;

/**
 * Created by mohammad_lom on 3/31/17.
 */
public class Node {
    String name;
    City neighbours[];
    ArrayList<Integer> huristicToNeighbours;
    Node parent;

    public Node(String name, City[] neighbours, ArrayList<Integer> huristicToNeighbours) {
        this.name = name;
        this.neighbours = neighbours;
        this.huristicToNeighbours = huristicToNeighbours;
    }
}
