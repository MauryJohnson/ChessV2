package Moves;

import java.util.function.BiFunction;

public interface Up<T,Q,R> extends BiFunction<T,Q,R> {

public R TryUp();

}
