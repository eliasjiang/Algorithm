package 基本数据结构.线性表.顺序实现;

import 基本数据结构.线性表.顺序实现.IndexFaultException;
import 基本数据结构.线性表.顺序实现.ListEmptyException;

public class MyArrayList {
    private int capacity = 10;
    private int length = 0;
    private int[] data = new int[capacity];

    MyArrayList(){

    }

    MyArrayList(int capacity){
        this.capacity = capacity;
        this.data = new int[this.capacity];
    }

    public boolean listEmpty() {
        if(this.listLength()==0) return true;
        else return false;
    }

    public void clearList() {
        if(this==null||this.listLength()==0) return;
        else this.length=0;
        return;
    }

    public int getElem(int index) throws ListEmptyException, IndexFaultException {

        if(this.listLength()==0||this==null) throw new ListEmptyException();
        if(index<0||index>=this.listLength()) throw new IndexFaultException();
        else return data[index];
    }

    public int locateElem(int ele) throws ListEmptyException, IndexFaultException {
        if (this.listEmpty()) throw new ListEmptyException();
        int res;
        for (int i = 0; i < this.listLength(); i++) {
            res = this.peekElem(i);
            if(res==ele) return i;
        }
        return -1;
    }

    public int peekElem(int index) throws IndexFaultException {
        if (index>=this.listLength()||index<0) throw new IndexFaultException();
        return this.data[index];
    }

    public void listInsert(int index, int ele) throws Exception {
        if(this==null) return;
        if(index<0) throw new IndexFaultException();
        if (index>=this.listLength()) {addElem(ele);return;}
        if (this.listLength()==this.listCurrentCapacity()) extendCapacity();
        for (int i = this.listLength()-1;i>=index;i--){
            this.data[i+1] = this.data[i];
        }
        this.data[index] = ele;
        this.length++;
        return;
    }

    //delete and return the num
    public int listDelete(int index) throws Exception {
        if (listEmpty()) {throw new ListEmptyException();}
        if(index<0||index>=this.listLength()) throw new IndexFaultException();
        int num = this.getElem(index);;
        if(index==this.listLength()-1){
            length--;
            return num;
        }
        for (int i=index;i<this.listLength()-1;i++){
            this.data[i] = this.data[i+1];
        }
        length--;
        return num;

    }
//
    public int listLength() {
        return this.length;
    }

    public int listCurrentCapacity(){
        return this.capacity;
    }
//
//    public void listUnion(MyArrayList int L2) {
//
//    }

    public void addElem(int ele) throws Exception {
        if (this==null||this.data.length==0) throw new ListEmptyException();
        if(this.length==this.capacity) this.extendCapacity();
        this.data[length] = ele;
        length++;
        return ;
    }


    //辅助方法
    private void extendCapacity(){
        this.capacity *= 2;
        int[] newData = new int[capacity];
        for (int i = 0; i < this.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }


}
