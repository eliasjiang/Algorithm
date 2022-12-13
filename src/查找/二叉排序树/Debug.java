package 查找.二叉排序树;

import org.junit.Test;

public class Debug {
    int testTime = 1000;
    int maxSize = 100;
    int maxValue = 1000;
    @Test
    public void test1(){
        for (int i = 0; i < testTime; i++) {
            BiTree BT = TestUtil.generateRandomBiTree(maxSize,maxValue);
            BT.printBiTree();
            System.out.println();
        }
        System.out.println("Test finished");
    }
}
