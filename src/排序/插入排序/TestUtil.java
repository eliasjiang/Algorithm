package 排序.插入排序;

import org.junit.Test;

public class TestUtil {
    int testTime = 100;

    public static int generateRandomNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1)) - (int)(Math.random()*(maxValue+1));
    }

    public static int generateRandomNatureNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1));
    }

    public static int[] generateRandomArray(int maxValue,int maxSize){
        int size = generateRandomNatureNum(maxSize);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomNum(maxValue);
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] %d",i,arr[i]);
        }
        System.out.println();
    }

    @Test
    public void test0(){
        for(int i = 0;i < testTime;i++){
            int arr[] = generateRandomArray(10,10);
            printArray(arr);
            InsertSort.insertSort0(arr);
            printArray(arr);
        }

    }

    @Test
    public void test1(){
        int[] arr = {0,6,9,3,2};
        InsertSort.insertSort0(arr);
        printArray(arr);
    }
}
