package 异或运算与二进制;

/*测试方法尚未完成*/

public class onlyOddTimes {
    /*在数组中，有且仅有一个数出现了奇数次，其余数均出现了偶数次，试找出这个数并打印*/
    public static int FindOnlyOddTimes(int[] arr){
        int tag = 0;//设置tag储存异或结果
        for(int i=0;i<arr.length;i++){
            tag ^= arr[i];
        }
        return tag;
    }

    //生成满足条件的随机数组
    //len必须是奇数
    public static int[] generateRandomArray(int len,int range){
        if(len%2==0) len++;//确定len为奇数
        int[] arr = new int[len];//为数组分配空间
        int oddTimes = (int)(Math.random()*len)+1;//确定奇数次
        if(oddTimes%2==0){
            if(oddTimes==0) oddTimes =1;
            else{
                oddTimes -= 1;
            }
        }


        return arr;
    }
    public static int randomNumber(int range){
        return ((int)(Math.random()*range)+1) - ((int)(Math.random()*range)+1);
    }
    //测试函数
    public static void main(String[] args) {

    }
}
