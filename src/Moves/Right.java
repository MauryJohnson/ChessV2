package Moves;

import java.util.function.BiFunction;

public interface Right<T,Q,R> extends BiFunction<T,Q,R>{
public R TryRight();
}
