package course.ai.ui;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mohammad_lom on 3/31/17.
 */
public class Node {
    String name;
    Node parent;
    String path = "";
    int dist = 0;

    public Node(String name) {
        this.name = name;
    }

    public Node(String name, Node parent){
        this.name = name;
        this.parent = parent;
    }
}