package 查找.二分法;

public class BinarySearch {
    public static int arrayBinarySearch(int[] arr,int key){
        if(arr==null||arr.length==0) return -1;
        int low = 0;int high = arr.length-1;int mid;
        while(low<=high){
            mid = low + (high-low)/2;
            if(key < arr[mid]) high = mid - 1;
            else if(key>arr[mid]) low = mid + 1;
            else return mid;
        }
        return -1;
    }
}

