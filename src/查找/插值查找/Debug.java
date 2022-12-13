package 查找.插值查找;


import 查找.二分法.BinarySearch;

public class Debug {
    @org.junit.Test
    public void test1(){
        for (int i = 0; i < 3000; i++) {
            int[] arr = Test.generateArray(100);
            int key = Test.generateRandomNum(100);
            int res = interpolationSearch.arrayInterpolationSearch(arr,key);
            Test.printArray(arr);
            System.out.printf("the key is %d,found the key in the %d place",key,res);
            System.out.println();
        }
    }

}
