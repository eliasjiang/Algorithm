package 基本数据结构.图.图的实现.十字链表;

import 基本数据结构.图.图的实现.抽象实现.MyVertex;

public class EdgeNode {
    public int tailVex = -1;
    public int headVex = -1;
    public EdgeNode headLink = null;
    public EdgeNode tailLink = null;
}
