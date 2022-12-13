package 归并排序及相关;

public class MergeSort_非递归实现 {
    public static void mergesort(int arr[]){
        if(arr==null||arr.length<=1) return ;
        int N = arr.length;
        //设置步长
        int mergeSize = 1;
        while(mergeSize<N){
            int L = 0;
            while(L<N){//划分左组和右组
                //不足直接设置为右组
                if(mergeSize >= N - L){
                    break;
                }
                int M = L + mergeSize -1;//确定左组右边界
                int R = M + Math.min(mergeSize,N-M-1);//确定右组右边界
                merge(arr,L,M,R);//进行merge
                L = R + 1;//L后移

                if(mergeSize > N/2){//防止溢出
                    break;
                }

                mergeSize <<= 1;

            }
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
        while(p2<=left){
            help[i++] = arr[p1++];
        }
        for(int j=0;j<help.length;j++){
            arr[left+j] = help[j];
        }
    }
}
