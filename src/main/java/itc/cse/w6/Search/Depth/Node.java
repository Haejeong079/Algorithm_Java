package itc.cse.w6.Search.Depth;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int info;
    public boolean visited;
    public List<Node> neighbours;


    // 노드 객체 생성
    public Node(int info) {
        this.info = info;
        this.visited = false;
        this.neighbours = new ArrayList<>();
    }

    // 정점에 인접한 정덤들의 연결 목록에 새 정점을 추가
    public void addNeighbours(Node neighboursNode){
        this.neighbours.add(neighboursNode);
    }

    // 정점에 인접한 정점들의 연결 목록을 반환
    public List<Node> getNeighbours(){
        return neighbours;
    }

    // 정점에 인접한 정점들의 연결 목록을 주어진 연결 목록으로 변경
    public void setNeighbours(List<Node> neighbours){
        this.neighbours = neighbours;
    }

    //  정점에 대응된 데이터를 반환
    public String toString(){

        return "" + info;
    }


}
