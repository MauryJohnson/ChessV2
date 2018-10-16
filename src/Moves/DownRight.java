package Moves;

import java.util.function.BiFunction;

public interface DownRight<T,Q,R> extends BiFunction<T,Q,R> {
//Returns all moves possible for downright (given piece)
public R TryDownRight();
}
