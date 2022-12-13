package 排序.冒泡;

public class BubbleSort {

    public static void BubbleSort0(int[] arr){

        for(int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void BubbleSort1(int[] arr){
        if(arr.length==0||arr.length==1) return;
        boolean flag = true;
        for (int i=0;i<arr.length&&flag;i++){
            flag = false;
            for (int j = arr.length-2; j >= i ; j--) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=true;
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
