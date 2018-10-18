package Pieces;

import Moves.*;

public class Pawn<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	public Pawn(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public R TryDownRight() {
		// TODO Auto-generated method stub
		if(Player!='B') {
			return null;
		}
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1]+1;
		
		int[] Ret;
		Ret = ApplyMove(P);
		
		//Invalidate not enemy
		if(Ret[0]<9||Ret[0]>16) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

	@Override
	public R TryDownLeft() {
		// TODO Auto-generated method stub
		if(Player!='B') {
			return null;
		}
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1]-1;
		
		int[] Ret;
		Ret = ApplyMove(P);
		
		//Invalidate not enemy
		if(Ret[0]<9||Ret[0]>16) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

	@Override
	public R TryUpRight() {
		// TODO Auto-generated method stub
		if(Player!='W') {
			return null;
		}
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1]+1;
		
		int[] Ret;
		Ret = ApplyMove(P);
		
		//Invalidate not attack of an enemy
		if(Ret[0]<9||Ret[0]>16) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

	@Override
	public R TryUpLeft() {
		// TODO Auto-generated method stub
		if(Player!='W') {
			return null;
		}
		
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1]-1;
		
		int[] Ret;
		Ret = ApplyMove(P);
		
		//Invalidate not attack of an enemy
		if(Ret[0]<9||Ret[0]>16) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

	@Override
	public R TryDown() {
		// TODO Auto-generated method stub
		if(Player!='B') {
			return null;
		}
		
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]-1;
		P[1] = CurrentPosition[1];
		
		int[] Ret;
		Ret = ApplyMove(P);

		//If walks right into any piece, invalidated move
		if(Ret[0]>8) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

	@Override
	public R TryUp() {
		// TODO Auto-generated method stub
		if(Player!='W') {
			return null;
		}
		
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+1;
		P[1] = CurrentPosition[1];
		
		int[] Ret;
		Ret = ApplyMove(P);

		//If walks right into any piece, invalidated move
		if(Ret[0]>8) {
			Ret[0]=-1;
		}
		
		return (R)Ret;
	}

}
