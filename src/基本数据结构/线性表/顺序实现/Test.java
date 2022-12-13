package 基本数据结构.线性表.顺序实现;

import 基本数据结构.线性表.顺序实现.MyArrayList;

public class Test {
    /*
        主方法
        1.生成随机List
        2.打印List

     */

    public static MyArrayList generateRandomList(int MaxSize, int MaxValue) throws Exception {
        int length = generateRandomNatureNum(MaxSize);
        MyArrayList L = new MyArrayList(length);
        for (int i=0;i<L.listCurrentCapacity();i++){
            int rd = generateRandomNum(MaxValue);
            L.addElem(rd);
        }
        return L;
    }




    public static void printMyArrayList(MyArrayList L) throws Exception {
        if (L==null||L.listLength()==0){
            System.out.println("The list is empty");
            return;
        }
        for (int i = 0; i < L.listLength(); i++) {
            System.out.print("[" + i + "]" + L.getElem(i) + " ");
        }
        System.out.println();
        return;

    }

    /*辅助方法
        1.生成随机数
        2.
     */

    public static int generateRandomNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1)) - (int)(Math.random()*(maxValue+1));
    }

    public static int generateRandomNatureNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1));
    }





}
