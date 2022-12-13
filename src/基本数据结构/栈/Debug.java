package 基本数据结构.栈;

public class Debug {
    int testTime = 300;
    int maxSize = 50;
    int maxValue = 300;

    @org.junit.Test
    public void test_generateRandomStack(){
        Test.printStart();
        for (int i = 0; i < testTime; i++) {
            MyStack S = Test.generateRandomStack(10,maxValue);
            S.printStack();
        }
        Test.printEnd();
    }


}
