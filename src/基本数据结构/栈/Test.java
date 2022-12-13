package 基本数据结构.栈;

public class Test {
    public static int generateRandomNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1)) - (int)(Math.random()*(maxValue+1));
    }

    public static int generateRandomNatureNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1));
    }

    public static MyStack generateRandomStack(int maxSize,int maxValue){
        int length = generateRandomNatureNum(maxSize);
        MyStack S = new MyStack();
        for (int i = 0; i < length; i++) {
            int ele = generateRandomNum(maxValue);
            MyStack.push(S,ele);
        }
        return S;
    }

    public static void printStart(){
        System.out.println("Test starts");
    }

    public static void printEnd(){
        System.out.println("Test ends");
    }
}
