package itc.cse.w6.Search.sort;

import itc.cse.w6.Search.Depth.Node;

import java.util.List;
import java.util.Stack;

public class TopologicalSort {

    Stack<Node> stack;

    public TopologicalSort() {
        stack = new Stack<>();
    }

    public void toplogicalSort(Node v){
        List<Node> neighbours = v.getNeighbours();

        for (int i = 0; i < neighbours.size(); i++) {
            Node w = neighbours.get(i);

            if(w!=null && !w.visited){
                w.visited = true;
                toplogicalSort(w);
            }
        }

        stack.push(v);
    }

    public static void main(String[] args) {
        TopologicalSort topological = new TopologicalSort();

        Node node0 = new Node(0);

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node0.addNeighbours(node1);

        node0.addNeighbours(node3);

        node1.addNeighbours(node2);
        node1.addNeighbours(node4);
        node2.addNeighbours(node4);
        node2.addNeighbours(node6);
        node3.addNeighbours(node4);
        node3.addNeighbours(node5);
        node4.addNeighbours(node6);
        node5.addNeighbours(node6);
        node5.addNeighbours(node7);
        node6.addNeighbours(node7);

        System.out.println("위상 정렬 순서");

        node0.visited = true;

        topological.toplogicalSort(node0);

        Stack<Node> resultStack = topological.stack;

        while(resultStack.empty() == false)
            System.out.print(resultStack.pop() + "    ");


    }
}
