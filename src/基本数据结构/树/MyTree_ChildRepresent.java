package 基本数据结构.树;

public class MyTree_ChildRepresent {

}

class CRTreeNode{
    int child;
    CRTreeNode next;
}

class CRTBox{
    int data;
    CRTreeNode firstChild;
}

class CRTree{
    CRTBox[] nodes = new CRTBox[10];
    int r,n;
}
