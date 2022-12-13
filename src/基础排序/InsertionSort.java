package 基础排序;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*测试方法*/
    public static void comparator(int[] arr){
        Arrays.sort(arr);
    }

    public static int[] generateRandomArray(int maxSize,int maxValue){
        int[] arr = new int[generateRandomPositiveInt(maxSize)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomInt(maxValue);
        }
        return arr;
    }

    public static int generateRandomPositiveInt(int maxValue){
        return (int)((maxValue+1)*Math.random());
    }

    public static int generateRandomInt(int maxValue){
        return (int)((maxValue+1)*Math.random())-(int)((maxValue+1)*Math.random());
    }

    public static int[] copyArray(int[] arr){
        if(arr==null) return null;
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static boolean areArraysEqual(int[] arr1,int[] arr2){
        if(arr1==null&&arr2==null) return true;
        else if((arr1==null&&arr2!=null)||(arr1!=null)&&arr2==null) return  false;
        else if(arr1.length!=arr2.length) return false;
        for (int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }

    public static void printArray(int[] arr){
        for (int num:arr) {
            System.out.print(num +" ");
        }
        System.out.println();
    }

    @Test
    public  void test(){
        int testTime = 5000;
        int maxSize = 5000;
        int maxValue = 5000;
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize,maxValue);
            int[] arr1 = copyArray(arr);
            int[] arr2 = copyArray(arr);
            insertionSort(arr1);
            comparator(arr2);
            if(!areArraysEqual(arr1,arr2)){
                printArray(arr);
                printArray(arr1);
                printArray(arr2);
                System.out.println("出错了");
                return;
            }
        }
        System.out.println("测试结束");
        return;
    }
}
