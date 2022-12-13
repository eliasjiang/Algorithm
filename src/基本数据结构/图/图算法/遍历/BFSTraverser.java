package 基本数据结构.图.图算法.遍历;

import 基本数据结构.图.图的实现.邻接矩阵.MyAMGraph;

import java.util.*;

public class BFSTraverser {
    public LinkedList<Integer> queue = new LinkedList<>();
    public boolean[] visited;
    public BFSTraverser(MyAMGraph graph) {
            visited = new boolean[graph.getNumVertexes()];
            Arrays.fill(visited, false);
        }
        public void BFSTraverse (MyAMGraph graph){
            for (int i = 0; i < graph.getNumVertexes(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    System.out.printf("%d ", graph.vexes[i].data);
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        queue.poll();
                        for (int j = 0; j < graph.getNumVertexes(); j++) {
                            if (graph.arc[i][j] < MyAMGraph.INFINITY && !visited[j]) {
                                visited[j] = true;
                                System.out.printf("%d ", graph.vexes[j].data);
                                queue.add(j);
                            }
                        }
                    }
                }
            }
        }
    }

