package 基本数据结构.线性表.顺序实现;

public class Debug {
    int testTime = 3000;
    int maxSize = 500;
    int maxValue = 6500;


    @org.junit.Test
    //测试生成随机数方法
    public void test_generateRandomNum(){
        for(int i=0;i<300;i++){
            System.out.println(Test.generateRandomNum(2000));
        }
    }

    @org.junit.Test
    //测试生成随机正整数方法
    public void test_generateRandomNatureNum(){
        for(int i=0;i<300;i++){
            System.out.println(Test.generateRandomNatureNum(2000));
        }
    }

    @org.junit.Test
    //测试生成随机列表方法
    public void test_generateRandomList() throws Exception {
        for(int i=0;i<300;i++){
            MyArrayList L = Test.generateRandomList(50,200);
            Test.printMyArrayList(L);
        }
    }

    @org.junit.Test
    public void test_getEle() throws Exception {
        for (int i = 0; i < testTime; i++) {
            MyArrayList L = Test.generateRandomList(10,200);;
            while (L.listLength()==0){L = Test.generateRandomList(100,200);}
            Test.printMyArrayList(L);
            int index = Test.generateRandomNatureNum(L.listLength()-1);
            int num = L.getElem(index);
            System.out.println("The " + index + "th number in the array is " + num);
        }


    }

    @org.junit.Test
    public void test_listInsert() throws Exception{
        for (int i=0;i<testTime;i++){
            MyArrayList L = Test.generateRandomList(3,100);
            while (L.listCurrentCapacity()==0) {L = Test.generateRandomList(30,100);}
            Test.printMyArrayList(L);
            int index = Test.generateRandomNatureNum(L.listLength()+10);
            int num = Test.generateRandomNum(100);
            L.listInsert(index,num);
            Test.printMyArrayList(L);
            System.out.println("Insert " + num + " to the " + index + "th place");
            System.out.println("----------------------");
        }
    }

    @org.junit.Test
    public void test_listDelete() throws Exception{
        for (int i=0;i<testTime;i++){
            MyArrayList L = Test.generateRandomList(100,100);
            while (L.listEmpty()){L = Test.generateRandomList(30,100);}
            Test.printMyArrayList(L);
            int index = Test.generateRandomNatureNum(L.listLength()-1);
            int num = L.listDelete(index);
            Test.printMyArrayList(L);
            System.out.println("Delete the " + index + "th number " + num);
            System.out.println("--------------------------");
        }
    }

    @org.junit.Test
    public void test_locateElem() throws Exception{
        for (int i=0;i<testTime;i++){
            MyArrayList L = Test.generateRandomList(10,100);
            while (L.listEmpty()){L = Test.generateRandomList(30,100);}
            Test.printMyArrayList(L);
            int ele = Test.generateRandomNum(maxValue);
            int res = L.locateElem(ele);
            if(res!=-1){
                System.out.println("found " + ele + " in the " + res + "th place");

            }
            else System.out.println("There is no " + ele + " in the list");
        }

    }



    //辅助方法
    public void MakeArrayNotEmpty(MyArrayList L) throws Exception {
        while (L.listCurrentCapacity()==0) {L = Test.generateRandomList(maxSize,maxValue);}
        return;
    }

}

class ListEmptyException extends Exception{

}

class IndexFaultException extends Exception{

}
