package 排序.选择;

public class SelectSort {

    public static void selectSort(int[] arr){
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {min = j;}
            }
            if(i!=min){
                swap(arr,i,min);
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
