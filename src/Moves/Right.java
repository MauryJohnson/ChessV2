package Moves;
/**
 *An implementable move
 *
 * @param <T>
 * Can be any specified parameter to indicate coordinate
 * @param <Q>
 * Can be any specified parameter to indicate coordinate
 * @param <R>
 * Can be any specified parameter to indicate status of move
 */
public interface Right<T,Q,R>{
public R TryRight(int i);
}
