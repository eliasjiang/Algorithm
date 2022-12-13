package 基本数据结构.线性表.链式实现;

import org.junit.Test;

public class Debug {
    int maxSize = 300;
    int maxValue = 300;
    int testTime = 300;

    @Test
    public void test_generateRandomList() throws Exception {
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            MyLinkList L = 基本数据结构.线性表.链式实现.Test.generateRandomList(maxSize,maxValue);
            基本数据结构.线性表.链式实现.Test.printMyArrayList(L);
        }
        System.out.println("测试结束");
    }


    @Test
    public void test_insertList() throws Exception{
        System.out.println("Test starts");
        for (int i = 0; i < testTime; i++) {
            MyLinkList L = 基本数据结构.线性表.链式实现.Test.generateRandomList(10,100);
            基本数据结构.线性表.链式实现.Test.printMyArrayList(L);
            int index = 基本数据结构.线性表.链式实现.Test.generateRandomNatureNum(10);
            int ele = 基本数据结构.线性表.链式实现.Test.generateRandomNum(200);
            if(L!=null)MyLinkList.listInsert(L,index,ele);
            基本数据结构.线性表.链式实现.Test.printMyArrayList(L);
            System.out.println("added " + ele + " in the " + index + " th place");
        }
        System.out.println("Test ends");
    }

    @Test
    public void test_deleteList() throws Exception{
        System.out.println("Test starts");
        for (int i = 0; i < testTime; i++) {
            MyLinkList L = 基本数据结构.线性表.链式实现.Test.generateRandomList(10,100);
            基本数据结构.线性表.链式实现.Test.printMyArrayList(L);
            int index = 基本数据结构.线性表.链式实现.Test.generateRandomNatureNum(10);
            if(L!=null){
                MyLinkList.listDelete(L,index);
            }
            基本数据结构.线性表.链式实现.Test.printMyArrayList(L);
            System.out.println("deleted the " + index + " th place");
        }
        System.out.println("Test ends");
    }

    @Test
    public void test_locateElem() throws Exception{
        System.out.println("Test starts");
        for (int i = 0; i < testTime; i++){
            MyLinkList L = 基本数据结构.线性表.链式实现.Test.generateRandomList(maxSize,maxValue);
            基本数据结构.线性表.链式实现.Test.printMyArrayList(L);
            int ele = 基本数据结构.线性表.链式实现.Test.generateRandomNum(maxValue);
            try{
                int index = MyLinkList.locateElem(L,ele);
                System.out.println("There is a " + ele + " in the " + index + "th place");
            }catch (Exception e){
                System.out.println(" There is no " + ele + " in the linkList");
            }

        }
        System.out.println("Test ends");
    }
}

class ListEmptyException extends Exception{

}

class IndexFaultException extends Exception{

}
