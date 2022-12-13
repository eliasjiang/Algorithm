package 基本数据结构.图.图的实现.抽象实现;

import 基本数据结构.图.图的实现.抽象实现.MyVertex;



//图
public abstract class MyGraph{
    public abstract void createGraph();
    public abstract void locateVex();
    public abstract int getVex(MyVertex v);
    public abstract MyVertex firstAdjVex(MyVertex v);
    public abstract MyVertex nextAdjVex(MyVertex v,MyVertex w);
    public abstract void insertVex(MyVertex v);
    public abstract void deleteVex(MyVertex v);
    public abstract void insertArc(MyVertex v,MyVertex u);
    public abstract void DeleteArc(MyVertex v,MyVertex u);
    public abstract void DFSTraverse();
    public abstract void HFSTraverse();
}