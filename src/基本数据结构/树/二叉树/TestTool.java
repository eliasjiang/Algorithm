package 基本数据结构.树.二叉树;


import org.junit.Test;

public class TestTool {


    public static LinkBinrayTree generateRandomBinaryTree(int maxSize,int maxValue){
        int size = generateRandomNatureNum(maxSize);
        LinkBinrayTree root = null;
        for (int i = 0; i < size; i++) {
            int data = generateRandomNum(maxValue);
            LinkBinrayTree LB = new LinkBinrayTree(data);
            if(i==0) root = LB;
            else {LinkBinrayTree.addNode(root,LB);}
        }
        return root;
    }

    public static int[] generateRandomArray(int maxSize,int maxValue){
        int size = generateRandomNatureNum(maxSize);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomNum(maxValue);
        }
        return arr;
    }

    public static void printArray(int[] arr){
        if(arr.length==0) System.out.println("The array is empty");
        else{
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%d ",arr[i]);
            }
            System.out.println();
        }
    }

    public static int generateRandomNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1)) - (int)(Math.random()*(maxValue+1));
    }

    public static int generateRandomNatureNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1));
    }
}

