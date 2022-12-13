package 基本数据结构.线性表.链式实现;



public class MyLinkList {
    private int data;
    private MyLinkList next = null;


    public MyLinkList(){

    }

    public MyLinkList(int data){
        this.data = data;
    }

    public static boolean listEmpty(MyLinkList L) {
        if(L==null) return true;
        else return false;
    }
//
    public static void clearList(MyLinkList L) {
        if(L==null) return;
        while(L.next!=null){
            MyLinkList temp = L;
            L = L.next;
            temp = null;
        }
        return;
    }
//
    public static int getElem(MyLinkList L,int index) throws ListEmptyException, IndexFaultException {
        if(L==null) throw new ListEmptyException();
        int i=0;
        MyLinkList p = L;
        while(p.next!=null&&i<index){
            p = p.next;
            i++;
        }
        if(i<index) throw new IndexFaultException();
        return p.data;

    }
//
    public static int locateElem(MyLinkList L,int ele) throws Exception {
        if(L==null) throw new ListEmptyException();
        MyLinkList p = L;
        int index = 0;
        while(p.next!=null&&p.data!=ele) {p = p.next;index++;}
        if(p.data==ele) {return index;}
        else throw new Exception("There is no " + ele + " in the linkList");
    }
//
//    public int peekElem(int index) throws IndexFaultException {
//
//    }
//

    public static void listInsert(MyLinkList L,int index, int ele) throws Exception {
        if(L==null) MyLinkList.addElem(L,ele);
        MyLinkList p = L;
        MyLinkList add = new MyLinkList(ele);
        int counter = 0;
        while(p.hasNext()&&counter<index-1){
            p = p.next;
            counter++;
        }
        if(p.next==null) p.next = add;
        else{
            MyLinkList temp = p.next;
            p.next = add;
            add.next = temp;
        }

        return;

    }
//
//    //delete ith node(if i is bigger than the length,delete the last one) and return the num
    public static int listDelete(MyLinkList L,int index) throws Exception {
        if (index < 0||L==null) throw new Exception("The index is wrong or the list is empty");
        MyLinkList p = L;
        int counter = 0;
        int res = 0;
        while (p.hasNext() && counter < index - 1) {
            p = p.next;
            counter++;
        }
        if (p.next == null) {
            res = p.data;
            p = null;
        } else {
            MyLinkList temp = p.next;
            if (temp.next != null) {
                p.next = temp.next;
                res = temp.data;
                temp = null;
            }


        }
        return res;
    }
//    //
//    public int listLength() {
//
//    }
//
//    public int listCurrentCapacity(){
//
//    }
////
////    public void listUnion(MyArrayList int L2) {
////
////    }
//
    public static void addElem(MyLinkList L,int ele) throws Exception {
        MyLinkList p = new MyLinkList(ele);
        if(L==null) {L = p;return;}
        MyLinkList temp = L;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.next  = p;
        return;
    }


    //辅助方法
    public boolean hasNext(){
        if(this==null||this.next==null) return false;
        else return true;
    }

    public int getData(){
        return this.data;
    }

    public MyLinkList getNext(){
        return this.next;
    }
}
