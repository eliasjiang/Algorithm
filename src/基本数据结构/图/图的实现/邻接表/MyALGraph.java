package 基本数据结构.图.图的实现.邻接表;


import 基本数据结构.图.图的实现.抽象实现.MyGraph;
import 基本数据结构.图.图的实现.抽象实现.MyVertex;

import java.util.Scanner;

public class MyALGraph extends MyGraph {
    public final int MAXVEX;
    public VertexNode[] adjList;
    private int numVertexes;
    private int numEdges;

    public MyALGraph(int maxvex) {
        MAXVEX = maxvex;
        adjList = new VertexNode[MAXVEX];
    }

    @Override
    public void createGraph() {
        int i,j,k;

        System.out.println("请输入顶点数和边数：");
        Scanner scan = new Scanner(System.in);
        numVertexes = scan.nextInt();
        numEdges = scan.nextInt();
        for (i = 0; i < numVertexes; i++) {
            int data = scan.nextInt();
            adjList[i].data = new MyVertex(data);
            adjList[i].firstEdge = null;
        }

        for (k = 0; k < numEdges; k++) {
            System.out.println("输入边(vi,vj)上的顶点序号");
            i = scan.nextInt();
            j = scan.nextInt();
            EdgeNode e = new EdgeNode();
            e.adjvex = j;
            e.next = adjList[i].firstEdge;
            EdgeNode f = new EdgeNode();
            e.adjvex = i;
            e.next = adjList[i].firstEdge;
            adjList[j].firstEdge = e;
        }
    }

    @Override
    public void locateVex() {

    }

    @Override
    public int getVex(MyVertex v) {
        return 0;
    }

    @Override
    public MyVertex firstAdjVex(MyVertex v) {
        return null;
    }

    @Override
    public MyVertex nextAdjVex(MyVertex v, MyVertex w) {
        return null;
    }

    @Override
    public void insertVex(MyVertex v) {

    }

    @Override
    public void deleteVex(MyVertex v) {

    }

    @Override
    public void insertArc(MyVertex v, MyVertex u) {

    }

    @Override
    public void DeleteArc(MyVertex v, MyVertex u) {

    }

    @Override
    public void DFSTraverse() {

    }

    @Override
    public void HFSTraverse() {

    }


}
