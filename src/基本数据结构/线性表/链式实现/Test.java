package 基本数据结构.线性表.链式实现;

import 基本数据结构.线性表.顺序实现.MyArrayList;

public class Test {
    public static MyLinkList generateRandomList(int maxSize, int maxValue) throws Exception {
        int size = generateRandomNatureNum(maxSize);
        MyLinkList L = null;
        for (int i = 0; i < size; i++) {
            int data = generateRandomNum(maxValue);
            MyLinkList p = new MyLinkList(data);
            if(i==0) L = p;
            MyLinkList.addElem(L,data);
        }
        return L;
    }
//
    public static void printMyArrayList(MyLinkList L) throws Exception {
         if(L==null) {System.out.println("List is empty");return;}
         MyLinkList p = L;
         int index = 0;
         while(p!=null){
             System.out.printf("[%d] %d ",index,p.getData());
             index++;
             p = p.getNext();
         }
         System.out.println();
         return;
    }

    public static int generateRandomNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1)) - (int)(Math.random()*(maxValue+1));
    }

    public static int generateRandomNatureNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1));
    }
}
