package Pieces;

import Moves.*;

public class Bishop<T,Q,R> extends Piece implements UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	//IF EVER IF EVER THAT THIS IS CREATED WITHOUT PIECE CREATED, INITIALIZE PIECE CLASS
	public Bishop(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}
	
	@Override
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
