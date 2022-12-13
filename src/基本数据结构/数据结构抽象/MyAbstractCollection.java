package 基本数据结构.数据结构抽象;

import 基本数据结构.数据结构抽象.迭代.MyIterator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public abstract class MyAbstractCollection<E> implements MyCollection<E>{
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    /*Constructor*/
    protected MyAbstractCollection(){}

    /*store*/
    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(MyCollection<? extends E> c) {
        boolean modified = false;
        for (MyIterator<?> i =  c.iterator(); i.hasNext();){
            if(add((E) i.next())) modified = true;
        }
        return modified;
    }

    /*delete*/
    @Override
    public boolean remove(Object o) {
        MyIterator<E> it = iterator();
        if(o==null){
            while(it.hasNext()){
                if(it.next()==null){
                    it.remove();
                    return true;
                }
            }
        }else{
            while(it.hasNext()){
                if(o.equals(it.next())){
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(MyCollection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        MyIterator<E> it = iterator();
        while(it.hasNext()){
            if(c.contains(it.next())){
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(MyCollection<?> c) {
       Objects.requireNonNull(c);
       boolean modified = false;
       MyIterator<E> it = iterator();
       while(it.hasNext()){
           if(!c.contains(it.next())){
               it.remove();
               modified = true;
           }
       }
       return modified;
    }


    public void clear() {
        MyIterator<E> it = iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
    }

    /*search*/
    @Override
    public boolean contains(Object o) {
        MyIterator<E> it = iterator();
        if(o==null){
            while (it.hasNext()){
                if(it.next()==null){
                    return true;
                }
            }
        }else{
            while(it.hasNext()){
                if(o.equals(it.next())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(MyCollection<?> c) {
        for(MyIterator<?> i=c.iterator();i.hasNext();){
            if(!contains(i.next())) return false;
        }
        return true;
    }

    @Override
    public Object[] toArray() {
        Object[] r = new Object[size()];
        MyIterator<E> it = iterator();
        for (int i = 0; i < r.length; i++) {
            if(it.hasNext()){
                return Arrays.copyOf(r,i);
            }
            r[i] = it.next();
        }

        return it.hasNext()?finishToArray(r,it):r;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /*iterate*/
    @Override
    public abstract MyIterator<E> iterator();

    @Override
    public abstract int size();

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    /*other*/
    private static <T> T[] finishToArray(T[] r,MyIterator<?> it){
        int i = r.length;
        while(it.hasNext()){
            int cap = r.length;
            if(i==cap){
                int newCap = cap + (cap>>1)+1;
                if(newCap-MAX_ARRAY_SIZE>0) newCap = hugeCapacity(cap+1);
                r = Arrays.copyOf(r,newCap);
            }
            r[i++] = (T)it.next();
        }
        return (i==r.length)?r: Arrays.copyOf(r,i);
    }

    private static int hugeCapacity(int minCapacity){
        if(minCapacity<0){
            throw new OutOfMemoryError("Required array size too large");
        }
        return (minCapacity>MAX_ARRAY_SIZE)?Integer.MAX_VALUE:MAX_ARRAY_SIZE;
    }

    public String toString(){
        MyIterator<E> it = iterator();
        if(!it.hasNext()) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;){
            E e = it.next();
            sb.append('[');
            sb.append(e==this?"(this Collection)":e);
            if(!it.hasNext()) return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
}
