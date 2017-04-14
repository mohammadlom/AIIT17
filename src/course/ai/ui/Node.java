package course.ai.ui;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mohammad_lom on 3/31/17.
 */
public class Node {
    String name;
    City neighbours[];
    ArrayList<Integer> huristicToNeighbours;
    Node parent;

    public Node(String name, City neighbours[], ArrayList<Integer> huristicToNeighbours) {
        this.name = name;
        this.neighbours = neighbours;
        this.huristicToNeighbours = huristicToNeighbours;
    }

    public Node(String name, Node parent, City neighbours[], ArrayList<Integer> huristicToNeighbours){
        this.name = name;
        this.neighbours = neighbours;
        this.huristicToNeighbours = huristicToNeighbours;
        this.parent = parent;
    }
}
