package 基本数据结构.栈;

public class MyStack {
    private int capacity = 10;
    private int[] data = new int[capacity];
    private int top = 0;
//    public static void destroyStack(MyStack S){
//
//    }
//    public static void clearStack(MyStack S){
//
//    }
//    public static boolean stackEmpty(MyStack S){
//        if(S==null||S.top==0) return true;
//        else return false;
//    }
//    public static int getTop(MyStack S){
//
//    }
    public static void push(MyStack S,int ele){
        S.adjustCapacity();
        S.top++;
        S.data[S.top] = ele;
    }
    public static int pop(MyStack S) throws Exception {
        if (S.top==0||S==null) throw new Exception("The stack is empty");
        int res = S.data[S.top];
        S.top--;
        return  res;
    }
    public static int stackLength(MyStack S){
        return S.top+1;
    }

    private void adjustCapacity( ){
        if(this.top>= this.capacity/2){
            int[] newData = new int[this.capacity*2];
            for (int i=0;i<=top;i++) {
                newData[i] = data[i];
            }
            data = newData;
            capacity *= 2;
            return;
        }
        if (this.top<this.capacity/4&&this.top>10){
            int[] newData = new int[this.capacity/2];
            for (int i=0;i<=top;i++) {
                newData[i] = data[i];
            }
            data = newData;
            capacity /= 2;
            return;
        }
        return;
    }

    public void printStack(){
        for (int i = 0; i <=this.top ; i++) {
            System.out.printf("[%d] %d ",i,this.data[i]);
        }
        System.out.println();
        return;
    }
}
