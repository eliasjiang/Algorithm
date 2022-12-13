package 基本数据结构.图.图算法.遍历;

import 基本数据结构.图.图的实现.邻接矩阵.MyAMGraph;

import java.util.Arrays;

public class DFSTraverser {
    public boolean[] visited;

    public DFSTraverser(MyAMGraph graph){
        visited = new boolean[graph.getNumVertexes()];
        Arrays.fill(visited, false);
    }
    //邻接矩阵递归算法
    public void DFS(MyAMGraph graph,int i){
        visited[i] = true;
        System.out.printf("%d ",graph.vexes[i].data);
        for (int j = 0; j < graph.getNumVertexes(); j++) {
            if(graph.arc[i][j]<MyAMGraph.INFINITY&&!visited[j]){
                DFS(graph,j);
            }
        }
    }

    public void DFSTraverse(MyAMGraph graph){
        for (int i = 0; i < graph.getNumVertexes(); i++) {
            if(!visited[i]) DFS(graph,i);
        }
    }
}
