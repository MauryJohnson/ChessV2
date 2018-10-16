package Moves;

import java.util.function.BiFunction;

public interface UpRight<T,Q,R> extends BiFunction<T,Q,R> {
public R TryUpRight();
}
