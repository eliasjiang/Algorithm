package 归并排序及相关;
import java.util.Arrays;

public class MergeSort_递归实现 {
    //递归方法实现
    public static void mergesort(int arr[]){
        if(arr==null||arr.length<=1) return ;
        else process(arr,0,arr.length-1);
    }

    public static void process(int[] arr,int left,int right){
        if(left==right) return;
        else{
            int mid = left + (right - left)/2;
            process(arr,left,mid);
            process(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int arr[],int left,int mid,int right){
        int[] help = new int[right-left+1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        while(p1<=mid&&p2<=right){
            help[i++] = arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=mid){
            help[i++] = arr[p1++];
        }
        while(p2<=right){
            help[i++] = arr[p2++];
        }
        for(int j=0;j<help.length;j++){
            arr[left+j] = help[j];
        }
    }

    //测试
    public static void main(String[] args) {
        int testTime = 5000;
        int MaxSize = 10;
        int MaxValue = 100;
        System.out.println("测试开始");
        for(int i=0;i<testTime;i++){
            int[] arr1 = MergeSort_对数器.generateRandomArray(MaxSize,MaxValue);
            int[] arr2 = MergeSort_对数器.copyArray(arr1);
            mergesort(arr1);
            Arrays.sort(arr2);
            if(!MergeSort_对数器.isEqual(arr1,arr2)){
                System.out.println("出错");
                MergeSort_对数器.printArray(arr1);
                MergeSort_对数器.printArray(arr2);
                break;
            }

        }
        System.out.println("测试结束");
    }

}
