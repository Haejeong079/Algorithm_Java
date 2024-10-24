package itc.cse.w6.Search.Bread;

import itc.cse.w6.Search.Depth.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadFirstSearch {

    private Queue<Node> queue;

    public BreadFirstSearch(){
        queue = new LinkedList<Node>();
    }

    public void BFS(Node v){
        v.visited = true;   // v를 방문함으로 표시

        queue.add(v);   // v를 큐에 추가

        while(!queue.isEmpty()){
            Node element = queue.remove();

            System.out.println(element.info + "     ");

            // element에 인접한 정점들의 연결 목록을 끄집어 낸다.
            List<Node> neighbours = element.getNeighbours();

            // element에 인접한 방문하지 않은 모든 정점들에 대해 너비 우선 탐색을 수행
            for (int i = 0; i < neighbours.size(); i++) {

                Node w = neighbours.get(i);

                if(w != null && !w.visited){

                    w.visited = true;
                    queue.add(w);
                }

            }
        }


    }
    public static void main(String[] args) {

        //정저들을 표현
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        //간선들을 표현
        node1.addNeighbours(node2);
        node1.addNeighbours(node3);
        node1.addNeighbours(node5);
        node2.addNeighbours(node1);
        node2.addNeighbours(node3);
        node3.addNeighbours(node1);
        node3.addNeighbours(node2);

        node3.addNeighbours(node4);
        node3.addNeighbours(node5);
        node4.addNeighbours(node3);
        node4.addNeighbours(node6);
        node5.addNeighbours(node1);
        node5.addNeighbours(node3);
        node6.addNeighbours(node3);
        node6.addNeighbours(node4);

        BreadFirstSearch bfsExample = new BreadFirstSearch();

        System.out.println("너비 우선 탐색 실행 결과");
        bfsExample.BFS(node1);
    }
}
