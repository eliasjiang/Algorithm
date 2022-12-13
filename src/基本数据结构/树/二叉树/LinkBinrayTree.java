package 基本数据结构.树.二叉树;

public class LinkBinrayTree {
    int data;
    LinkBinrayTree lChild,rChild;

    public LinkBinrayTree(int data){
        this.data = data;
        lChild = null;
        rChild = null;
    }


    public static void addNode(LinkBinrayTree root,LinkBinrayTree addNode){
        if(root.lChild==null) root.lChild = addNode;
        else if(root.rChild==null) root.rChild = addNode;
        else{
            LinkBinrayTree.addNode(root.lChild,addNode);
        }

    }

    public static void preOrderTraverse(LinkBinrayTree root){
        if(root==null) return;
        System.out.printf("%d ",root.data);
        preOrderTraverse(root.lChild);
        preOrderTraverse(root.rChild);
    }

    public static void inOrderTraverse(LinkBinrayTree root){
        if(root==null) return;
        inOrderTraverse(root.lChild);
        System.out.println(root.data);
        inOrderTraverse(root.rChild);
    }

    public static void postOrderTraverse(LinkBinrayTree root){
        if (root==null) return;
        postOrderTraverse(root.lChild);
        postOrderTraverse(root.rChild);
        System.out.println(root.data);
    }

    public static LinkBinrayTree createBiTree(int[] data){
        if(data.length==0) return null;
        LinkBinrayTree root = null;
        for (int i = 0; i < data.length; i++) {
            LinkBinrayTree LB = new LinkBinrayTree(data[i]);
            if(i==0) root = LB;
            else{
                LinkBinrayTree.addNode(root,LB);
            }
        }
        return root;
    }


}
