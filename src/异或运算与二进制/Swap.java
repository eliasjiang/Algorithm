package 异或运算与二进制;


/*异或运算：
    定义：不同取1，相同取0
    骚操作：swap运算
* */
public class Swap {
    public static void main(String[] args) {
        int a = 16;
        int b = 603;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
