package itc.cse.graph.adjmatrix;

import java.util.ArrayList;

public class GraphMain {
    public static void main(String[] args) {
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.add(new Node("1", 0));
        nodeList.add(new Node("2", 1));
        nodeList.add(new Node("3", 2));
        nodeList.add(new Node("4", 3));
        nodeList.add(new Node("5", 4));


        Graph g = new Graph(nodeList);
        g.unDirectedEdge('1','2');
        g.unDirectedEdge('1','4');
        g.unDirectedEdge('1','5');
        g.unDirectedEdge('2','3');
        g.unDirectedEdge('2','4');
        g.unDirectedEdge('3','4');
        g.unDirectedEdge('4','5');

        System.out.println(g);
    }
}
