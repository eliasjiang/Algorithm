package 基本数据结构.树.二叉树;

import org.junit.Test;

public class Debug {
    int testTime = 300;
    int maxSize = 200;
    int maxVlue = 200;


    @Test
    public void test_generateRandomBinaryTree(){
        for (int i = 0; i < testTime; i++) {
            LinkBinrayTree root = TestTool.generateRandomBinaryTree(maxSize,maxVlue);
            LinkBinrayTree.preOrderTraverse(root);
            System.out.println();
        }
    }

    @Test
    public void test_CreateBinaryTree(){
        for (int i = 0; i < testTime; i++) {
            int[] data = TestTool.generateRandomArray(maxSize,maxVlue);
            LinkBinrayTree root =LinkBinrayTree.createBiTree(data);
            System.out.println("The array is");
            TestTool.printArray(data);
            System.out.println("The BinarayTree is");
            LinkBinrayTree.preOrderTraverse(root);
        }
    }
}

