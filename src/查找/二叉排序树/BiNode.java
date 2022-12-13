package 查找.二叉排序树;

public class BiNode {
    int data;
    BiNode lChild = null;
    BiNode rChild = null;

    public BiNode(int data) {
        this.data = data;
    }

    public BiNode Search(int key) {
        if (key == this.data) return this;
        else if (key < this.data) {
            if (this.lChild == null) {
                this.lChild = new BiNode(key);
                return null;
            } else return this.lChild.Search(key);
        } else {
            if (this.rChild == null) {
                this.rChild = new BiNode(key);
                return null;
            }
            return this.rChild.Search(key);
        }
    }

    public void addNode(int data) {
        if (data > this.data) {
            if (this.rChild == null) rChild = new BiNode(data);
            this.rChild.addNode(data);
        } else if (data < this.data) {
            if(this.lChild==null) lChild = new BiNode(data);
            this.lChild.addNode(data);
        }
    }

    public void printNode() {
        System.out.printf("[%d] ", this.data);
        if (this.lChild != null) lChild.printNode();
        if (this.rChild != null) rChild.printNode();
    }
}
