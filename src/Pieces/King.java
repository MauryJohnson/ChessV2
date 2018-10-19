package Pieces;

import Moves.*;

public class King<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R>,UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	//Can castle initially
	public boolean CanCastle =  true;
	
	public King(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public R TryDownRight(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1]+1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	public R TryDownLeft(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1]-1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	public R TryUpRight(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1]+1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	public R TryUpLeft(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1]-1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	public R TryRight(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0];
		P[1] = CurrentPosition[1]+1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	public R TryLeft(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0];
		P[1] = CurrentPosition[1]-1;
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	public R TryDown(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1];
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}

	@Override
	public R TryUp(int i) {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1];
		
		int[] Ret;
		Ret = ApplyMove(CurrentPosition,P);

		return (R)Ret;
	}
	
}
