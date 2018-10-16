package Moves;

import java.util.function.BiFunction;

public interface Left<T,Q,R> extends BiFunction<T,Q,R>{
public R TryLeft();
}
