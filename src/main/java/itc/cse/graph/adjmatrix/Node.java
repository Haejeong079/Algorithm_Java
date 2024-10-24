package itc.cse.graph.adjmatrix;

import lombok.Data;

@Data
public class Node {
    private String name;
    private int index;
    private boolean visited;

    public Node(String name, int index) {
        this.name = name;
        this.index = index;
    }

}
