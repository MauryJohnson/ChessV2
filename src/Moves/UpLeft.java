package Moves;

import java.util.function.BiFunction;

public interface UpLeft<T,Q,R> extends BiFunction<T,Q,R>{
	public R TryUpLeft();
}
