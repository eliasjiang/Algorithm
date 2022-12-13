package 查找.插值查找;

public class interpolationSearch {
    public static int arrayInterpolationSearch(int[] arr,int key){
        if(arr==null||arr.length==0||key<arr[0]||key>arr[arr.length-1])return -1;
        int left = 0;int right = arr.length-1;int mid;
        while(left<right){
            mid = left + (right-left)*(key - arr[left])/(arr[right]-arr[left]);
            if(key<mid) right = mid -1;
            else if(key>mid) left = mid + 1;
            else return mid;
        }
        return -1;
    }


}
