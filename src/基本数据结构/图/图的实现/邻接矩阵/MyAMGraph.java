package 基本数据结构.图.图的实现.邻接矩阵;


import 基本数据结构.图.图的实现.抽象实现.MyGraph;
import 基本数据结构.图.图的实现.抽象实现.MyVertex;

import java.util.Arrays;
import java.util.Scanner;

public class MyAMGraph extends MyGraph {
    public final int MAXVEX;
    public static final int INFINITY = Integer.MAX_VALUE;

    public MyVertex[] vexes;
    public int[][] arc;

    public int getNumVertexes() {
        return numVertexes;
    }

    public int getNumEdges() {
        return numEdges;
    }

    private int numVertexes;
    private int numEdges;



    public MyAMGraph(int maxVex) {
        MAXVEX = maxVex;
        vexes = new MyVertex[maxVex];
        arc = new int[maxVex][maxVex];
        numVertexes = 0;
        numEdges = 0;

        for (int i = 0; i < maxVex; i++) {
            for (int j = 0; j < maxVex; j++) {
                if(i!=j){
                    arc[i][j] = INFINITY;
                }
            }
        }

        Arrays.fill(vexes, null);
    }



    @Override
    public void createGraph() {
        System.out.println("请输入顶点数与边数");
        Scanner scan = new Scanner(System.in);
        this.numVertexes = scan.nextInt();
        this.numEdges = scan.nextInt();
        int i,j,k,w;
        for (i= 0; i < numVertexes; i++) {
            System.out.println("请输入顶点的值");
            int data = scan.nextInt();
            MyVertex v = new MyVertex(data);
            vexes[i] = v;
        }
        for (k=0;k<numVertexes;k++){
            System.out.println("请输入(vi,vj)上的下标i,下标j和权w：");
            i = scan.nextInt();
            j = scan.nextInt();
            w = scan.nextInt();
            arc[i][j] = w;
            arc[j][i] = arc[i][j];
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
        if(numVertexes==MAXVEX) return;

        for (int i = 0; i < numVertexes; i++) {
            if(vexes[i]==null){
                vexes[i] = v;
                return;
            }
        }
        vexes[numVertexes] = v;
        numVertexes++;
    }

    @Override
    public void deleteVex(MyVertex v) {
        for (int i = 0; i < numVertexes; i++) {
            if(vexes[i].data == v.data){
                vexes[i] = null;
                return;
            }
        }
        numVertexes--;
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

