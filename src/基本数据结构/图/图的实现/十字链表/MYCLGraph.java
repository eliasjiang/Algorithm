package 基本数据结构.图.图的实现.十字链表;

import 基本数据结构.图.图的实现.抽象实现.MyGraph;
import 基本数据结构.图.图的实现.抽象实现.MyVertex;

import java.util.Scanner;

public class MYCLGraph extends MyGraph {
    public final int MAXVEX;
    private VertexNode[] clList;
    private int numVertex;
    private int numEdge;

    public MYCLGraph(int maxvex) {
        MAXVEX = maxvex;
        clList = new VertexNode[MAXVEX];
    }

    @Override
    public void createGraph() {
//        System.out.println("请输入顶点数和边数");
//        Scanner scan = new Scanner(System.in);
//        numVertex = scan.nextInt();
//        numEdge = scan.nextInt();
//        for (int i = 0; i < numVertex; i++) {
//            int data = scan.nextInt();
//            clList[i].data = new MyVertex(data);
//            clList[i].firstIn = null;
//            clList[i].firstOut = null;
//        }
//        for (int k = 0; k < numEdge; k++) {
//            System.out.println("请输入边(vi,vj)上的顶点序号");
//            int index1 = scan.nextInt();
//            int index2 = scan.nextInt();
//            EdgeNode e1 = new EdgeNode();
//            if (clList[index1].firstOut == null) {
//                clList[index1].firstOut = e1;
//            } else {
//                clList[index1].firstOut.
//            }
//
//
//        }
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
