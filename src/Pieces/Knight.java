package Pieces;

import Moves.*;

//Special unit, implements Four, but with the offeset associated with knight, which is
//Moving 2 units twice BEFORE implementing Right,Left for eight possible moves

//Special cases UpLeft, UpRight,DownLeft,DownRight
//Since have knight, will move twice then go, ignoring all pieces hopped over except for the final position

/**
 * 
 * Knight piece
 * 
 * @author Maury Johnson
 *
  * @param <T>
 * Any type that can describe the coordinates
 * @param <Q>
 * Any type that can describe the coordinates
 * @param <R>
 * Any type to return special properties about the movement
 */
public class Knight<T,Q,R> extends Piece implements UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>,KnightLeftDown<T,Q,R>,KnightLeftUp<T,Q,R>,KnightRightDown<T,Q,R>,KnightRightUp<T,Q,R>{
	
	/**
	 * IF EVER IF EVER THAT THIS IS CREATED WITHOUT PIECE CREATED, INITIALIZE PIECE CLASS
	 * @param Player
	 * Player that piece is assigned to
	 * @author Maury Johnson
	 */
	public Knight(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}
	//////////
	@Override
	/**
	 * Tries to do special knight move right and up
	 * return
	 * R
	 * @author Maury Johnson
	 */
	public R TryKnightRightUp() {
		// TODO Auto-generated method stub
		//Create Position that will be knight right right up
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1]+2;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);
		
		return (R)Ret;
	}
	///////////
	@Override
	/**
	 * Tries to do special knight move right and down
	 * return
	 * R
	 * @author Maury Johnson
	 */
	public R TryKnightRightDown() {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1]+2;
				
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	/**
	 * Tries to do special knight move left and up
	 * return
	 * R
	 * @author Maury Johnson
	 */
	public R TryKnightLeftUp() {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1]-2;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	/**
	 * Tries to do special knight move left and down
	 * return
	 * R
	 * @author Maury Johnson
	 */
	public R TryKnightLeftDown() {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1]-2;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	/**
	 * Tries to do special knight move down and right
	 * return
	 * R
	 * @author Maury Johnson
	 */
	public R TryDownRight(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-2;
		P[1] = CurrentPosition[1]+1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	/**
	 * Tries to do special knight move down and left
	 * return
	 * R
	 * @author Maury Johnson
	 */
	public R TryDownLeft(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-2;
		P[1] = CurrentPosition[1]-1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	/**
	 * Tries to do special knight move up and right
	 * return
	 * R
	 * @author Maury Johnson
	 */
	public R TryUpRight(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+2;
		P[1] = CurrentPosition[1]+1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	/**
	 * Tries to do special knight move up and left
	 * return
	 * R
	 * @author Maury Johnson
	 */
	public R TryUpLeft(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+2;
		P[1] = CurrentPosition[1]-1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

}