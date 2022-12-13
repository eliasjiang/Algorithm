package 基本数据结构.数据结构抽象.迭代;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

public interface MyIterable<E> {
    MyIterator<E> iterator();
    default void forEach(Consumer<? super E> action){
        Objects.requireNonNull(action);
        for (MyIterator<E> i=this.iterator();i.hasNext();){
            action.accept(i.next());
        throw new UnsupportedOperationException();
        }

    default Spliterator<E> spliterator() {
//        return Spliterators.spliteratorUnknownSize(iterator(), 0);
        throw new UnsupportedOperationException();
    }
}
