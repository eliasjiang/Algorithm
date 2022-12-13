package 基本数据结构.数据结构抽象;

import 基本数据结构.数据结构抽象.迭代.MyIterable;
import 基本数据结构.数据结构抽象.迭代.MyIterator;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public interface MyCollection<E> extends MyIterable<E> {
    /*store*/
    boolean add(E e);
    boolean addAll(MyCollection<? extends E> c);
    /*delete*/
    boolean remove(Object o);
    default boolean removeIf(){
        throw new UnsupportedOperationException();
    }
    boolean removeAll(MyCollection<?> c);
    boolean retainAll(MyCollection<?> c);
    void clear();
    /*search*/
    boolean contains(Object o);
    boolean containsAll(MyCollection<?> c);
    /*view*/
    Object[] toArray();
    <T> T[] toArray(T[] a);
    default <T> T[] toArray(IntFunction<T[]> generator) {
        return toArray(generator.apply(0));
    }
    /*iterate*/
    MyIterator<E> iterator();
    default Spliterator<E> spliterator() {
//        return Spliterators.spliterator(this, 0);
        throw new UnsupportedOperationException();
    }
    default Stream<E> stream() {
        return StreamSupport.stream(spliterator(), false);
    }
    default Stream<E> parallelStream() {
        return StreamSupport.stream(spliterator(), true);
    }

    /*other*/
    int size();
    boolean isEmpty();

}
