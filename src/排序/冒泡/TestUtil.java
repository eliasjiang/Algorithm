package 排序.冒泡;

import org.junit.Test;

public class TestUtil {

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
        int[] arr = generateRandomArray(100,100);
        BubbleSort.BubbleSort0(arr);
        printArray(arr);
    }

    @Test
    public void test1(){
        int[] arr = generateRandomArray(100,100);
        BubbleSort.BubbleSort1(arr);
        printArray(arr);
    }
}
