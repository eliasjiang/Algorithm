package 基本数据结构.线性表.线性表抽象;

import 基本数据结构.数据结构抽象.MyCollection;

public interface MyList<E> extends MyCollection<E> {
    E get(int id);
    E set(int id,E newVal);
    void add(int id,E element);
    void remove(int id);

    MyListIterator<E> listIterator(int pos);
}
