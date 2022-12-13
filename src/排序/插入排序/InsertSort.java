package 排序.插入排序;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort0(int[] arr){
        if(arr.length==0||arr.length==1) return;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            boolean flag = true;
            if(arr[i]<arr[i-1]){
                while(flag&&j>=0){
                    if(j==0){
                        for(int m = i;m > 0;m--){
                            arr[m] = arr[m-1];
                        }
                        arr[0] = temp;
                        flag = false;
                    }else if(temp>=arr[j-1]&&temp<=arr[j]){
                        for(int k = i;k > j;k--){
                            arr[k] = arr[k-1];
                        }
                        arr[j] = temp;
                        flag = false;
                    }else{
                        j--;
                    }
                }

            }
        }
    }


    public static int[] insertSort1(int[] arr){
        int[] newArr = Arrays.copyOf(arr,arr.length);

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while(j>0&&temp<newArr[j-1]){
                newArr[j] = newArr[j-1];
                j--;
            }
            if(j!=i){
                newArr[j] = temp;
            }
        }
        return newArr;
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
