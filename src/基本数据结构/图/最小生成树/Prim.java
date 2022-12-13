package 基本数据结构.图.最小生成树;


import 基本数据结构.图.图的实现.邻接矩阵.MyAMGraph;

public class Prim {
    public static void MiniSpanTree_Prim(MyAMGraph G){
        int[] adjvex = new int[G.MAXVEX];
        int[] lowcost = new int[G.MAXVEX];
        lowcost[0] = 0;
        adjvex[0] = 0;
        for (int l = 1; l < G.getNumVertexes(); l++) {
            lowcost[l] = G.arc[0][l];
            adjvex[l] = 0;
        }
        for (int i = 1; i < G.getNumVertexes(); i++) {
            int min = MyAMGraph.INFINITY;
            int j=1;int k = 0;
            while(j<G.getNumVertexes()){
                if(lowcost[j]!=0&&lowcost[j]<min){
                    min = lowcost[j];
                    k = j;
                }
                j++;
            }
            System.out.printf("(%d,%d)",adjvex[k],k);
            lowcost[k] = 0;
            for (int l = 0; l < G.getNumVertexes(); l++) {
                if (lowcost[j]!=0&&G.arc[k][j]<lowcost[j]){
                    lowcost[j] = G.arc[k][j];
                    adjvex[j] = k;
                }
            }
        }
    }
}
