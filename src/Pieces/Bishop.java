package Pieces;

import Moves.*;
/**
 * Bishop piece
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
public class Bishop<T,Q,R> extends Piece implements UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	/**
	 * Set up Bishop with player
	 * @param Player
	 * Player that piece is assigned to
	 * @author Maury Johnson
	 */
	public Bishop(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	/**
	 * With Bishop, try move down and right
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
	 * With Bishop, try move down and left
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
		
		if(i>=0&&i<=7) {
	
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
	 * With Bishop, try move up and right
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
	 * With Bishop, try move up and left
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
		
		if(i>=0&&i<=7) {
	
		Ret = IterateThrough(FP,4,i);	
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}	
	
}
