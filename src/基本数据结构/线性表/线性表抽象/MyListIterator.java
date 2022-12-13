package 基本数据结构.线性表.线性表抽象;

import 基本数据结构.数据结构抽象.迭代.MyIterator;

public interface MyListIterator<E> extends MyIterator<E> {
    boolean hasPrevious();
    E previous();

    void add(E element);
    void set(E newVal);
}
