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
public interface DownLeft<T,Q,R>{
//Returns all moves possible for downright (given piece)
public R TryDownLeft(int i);
}
