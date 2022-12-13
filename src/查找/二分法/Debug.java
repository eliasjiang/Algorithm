package 查找.二分法;

public class Debug{
    @org.junit.Test
    public void test1(){
        for (int i = 0; i < 300; i++) {
            int[] arr = Test.generateArray(100);
            int key = Test.generateRandomNum(100);
            int res = BinarySearch.arrayBinarySearch(arr,key);
            Test.printArray(arr);
            System.out.printf("the key is %d,found the key in the %d place",key,res);
            System.out.println();
        }
    }
}
