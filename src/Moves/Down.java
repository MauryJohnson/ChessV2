package Moves;

import java.util.function.BiFunction;

public interface Down<T,Q,R> extends BiFunction<T,Q,R> {
	public R TryDown();
}
