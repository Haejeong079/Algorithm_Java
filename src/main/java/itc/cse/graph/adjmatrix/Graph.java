package itc.cse.graph.adjmatrix;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node>nodeList;
    int[][]adjmatrix;

    public Graph(ArrayList<Node> nodeList) {
        this.nodeList = nodeList;
        adjmatrix=new int[nodeList.size()][nodeList.size()];
    }
    public void unDirectedEdge(int i,int j){
        i=i-'1';
        j=j-'1';
        adjmatrix[i][j]=1;
        adjmatrix[j][i]=1;

    }
    public void directedEdge(int i, int j){
        i=i-'1';
        j=j-'1';
        adjmatrix[i][j]=1;
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("   ");
        for (int i = 0; i <nodeList.size() ; i++) {
            sb.append(nodeList.get(i).getName()+"  ");
        }
        sb.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).getName()+"  ");
            for (int j : adjmatrix[i]) {
                sb.append(j+"  ");

            }
            sb.append("\n");
        }
        sb.append("\n");

        return sb.toString();
    }


}
