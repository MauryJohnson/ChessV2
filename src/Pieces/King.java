package Pieces;

import Moves.*;

/**
 * King piece
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
public class King<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R>,UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	/**
	 * Indicates if King can castle
	 * Can castle initially
	 * @author Maury Johnson
	 */
	public boolean CanCastle =  true;
	
	/**
	 * Set Up king with player
	 * @param Player
	 * Player that piece is assigned to
	 * @author Maury Johnson
	 */
	public King(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}


	@Override
	/**
	 * With King, try move down and right
	 * @param i
	 * How far to go
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
		
		if(i==0) {
	
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
	 * With King, try move down and left
	 * @param i
	 * How far to go
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
		
		if(i==0) {
	
		Ret = IterateThrough(FP,7,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}

	@Override
	/**
	 * With King, try move up and right
	 * @param i
	 * How far to go
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
		
		if(i==0) {
	
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
	 * With King, try move up and left
	 * @param i
	 * How far to go
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
		
		if(i==0) {
	
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
	 * With King, try move right
	 * @param i
	 * How far to go
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
		
		if(i==0) {
	
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
	 * With King, try move left
	 * @param i
	 * How far to go
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
		
		if(i==0) {
	
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
	 * With King, try move down
	 * @param i
	 * How far to go
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
		
		if(i==0) {
	
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
	 * With King, try move up
	 * @param i
	 * How far to go
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
		
		if(i==0) {
	
		Ret = IterateThrough(FP,1,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}
}
