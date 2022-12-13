package 基本数据结构.数据结构抽象.迭代;

import java.util.Objects;
import java.util.function.Consumer;

public interface MyIterator<E> {
    boolean hasNext();
    E next();
    default void remove(){
        throw new UnsupportedOperationException("Remove");
    }
    default void forEachRemaining(Consumer<? super E> action){
        Objects.requireNonNull(action);
        while(hasNext()){
            while(hasNext()){
                action.accept(next());
            }
        }
    }
}
