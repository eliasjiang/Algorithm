package 查找.二叉排序树;

public class BiTree{
    BiNode root = null;

    public boolean isEmpty(){
        return root == null;
    }

    public BiNode BiTreeSearch(int key){
        if(this.root==null) {
            this.root = new BiNode(key);return null;
        }
        return this.root.Search(key);
    }

    public void addNode(int data){
        if(this.root==null){
            this.root = new BiNode(data);
            return;
        }
        root.addNode(data);
    }

    public void printBiTree(){
        if (isEmpty()) {System.out.println("This BiTree is empty");return;}
        root.printNode();
    }
}



