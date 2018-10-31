package Pieces;

import Moves.*;
/**
 * Queen piece
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
public class Queen<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R>,UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{
	
	/**
	 * Sets up player for piece queen
	 * @param Player
	 * Player that piece is assigned to
	 */
	public Queen(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 * Tries to do queen attack move down right
	 * @param
	 * int
	 * @return
	 * R
	 * @author Maury Johnson
	 */
	public R TryDownRight(int i) {
		// TODO Auto-generated method stub
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i>=0&&i<=7) {
	
		Ret = IterateThrough(FP,6,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}

	@Override
	/**
	 * Tries to do queen attack move down left
	 * @param
	 * int
	 * @return
	 * R
	 * @author Maury Johnson
	 */
	public R TryDownLeft(int i) {
		// TODO Auto-generated method stub
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i>=0&&i<=7) {
	
		Ret = IterateThrough(FP,7,i);	
		
		//System.out.printf("Curr Pose: [%d,%d]", CurrentPosition[0],CurrentPosition[1]);
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}

	@Override
	/**
	 * Tries to do queen attack move up right
	 * @param
	 * int
	 * @return
	 * R
	 * @author Maury Johnson
	 */
	public R TryUpRight(int i) {
		// TODO Auto-generated method stub
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i>=0&&i<=7) {
	
		Ret = IterateThrough(FP,5,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}

	@Override
	/**
	 * Tries to do queen attack move up left
	 * @param
	 * int
	 * @return
	 * R
	 * @author Maury Johnson
	 */
	public R TryUpLeft(int i) {
		// TODO Auto-generated method stub
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i>=0&&i<=7) {
	
		Ret = IterateThrough(FP,4,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}

	@Override
	/**
	 * Tries to do queen attack move right
	 * @param
	 * int
	 * @return
	 * R
	 * @author Maury Johnson
	 */
	public R TryRight(int i) {
		// TODO Auto-generated method stub
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i>=0&&i<=7) {
	
		Ret = IterateThrough(FP,3,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}

	@Override
	/**
	 * Tries to do queen attack move left
	 * @param
	 * int
	 * @return
	 * R
	 * @author Maury Johnson
	 */
	public R TryLeft(int i) {
		// TODO Auto-generated method stub
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i>=0&&i<=7) {
	
		Ret = IterateThrough(FP,2,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}

	@Override
	/**
	 * Tries to do queen attack move down
	 * @param
	 * int
	 * @return
	 * R
	 * @author Maury Johnson
	 */
	public R TryDown(int i) {
		// TODO Auto-generated method stub
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i>=0&&i<=7) {
	
		Ret = IterateThrough(FP,0,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}

	@Override
	/**
	 * Tries to do queen attack move up
	 * @param
	 * int
	 * @return
	 * R
	 * @author Maury Johnson
	 */
	public R TryUp(int i) {
		// TODO Auto-generated method stub
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i>=0&&i<=7) {
	
		Ret = IterateThrough(FP,1,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}
}
