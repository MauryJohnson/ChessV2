package Pieces;

import Moves.*;

public class Pawn<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	public boolean CanMoveUpTwice = true;
	
	public Pawn(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public R TryDownRight(int i) {
		// TODO Auto-generated method stub
		if(Player!='B') {
			return null;
		}
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1]+1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);
		
		//Invalidate not enemy
		if(Ret[0]<9||Ret[0]>16) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

	@Override
	public R TryDownLeft(int i) {
		// TODO Auto-generated method stub
		if(Player!='B') {
			return null;
		}
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1]-1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);
		
		//Invalidate not enemy
		if(Ret[0]<9||Ret[0]>16) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

	@Override
	public R TryUpRight(int i) {
		// TODO Auto-generated method stub
		if(Player!='W') {
			return null;
		}
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1]+1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);
		
		//Invalidate not attack of an enemy
		if(Ret[0]<9||Ret[0]>16) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

	@Override
	public R TryUpLeft(int i) {
		// TODO Auto-generated method stub
		if(Player!='W') {
			return null;
		}
		
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1]-1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);
		
		//Invalidate not attack of an enemy
		if(Ret[0]<9||Ret[0]>16) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

	@Override
	public R TryDown(int i) {
		// TODO Auto-generated method stub
		if(Player!='W') {
			return null;
		}
		
		int[] Ret = null;
		
		int[] FP = new int[2];
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i==0||i==1) {
		if(i==1&&!CanMoveUpTwice) {
			System.out.println("Cannot move up twice anymore");
			return null;
		}
		
		Ret = IterateThrough(FP,0,i);	
	
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}

	@Override
	public R TryUp(int i) {
		// TODO Auto-generated method stub
		if(Player!='B') {
			return null;
		}
		
		int[] P = new int[2];
		
		if(i==0) {
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1];
		}
		else if(i==1) {
		P[0] = CurrentPosition[0]+2;
		P[1] = CurrentPosition[1];	
		}
		else {
			System.out.println("Invalid Parameter");
			return null;
		}
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		//If walks right into any piece, invalidated move
		if(Ret[0]>8) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

}
