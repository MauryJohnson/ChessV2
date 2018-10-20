package Pieces;

import Moves.*;

public class Rooke<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R>,RookeRightCastle<T,Q,R>,RookeLeftCastle<T,Q,R> {
	
	//Can castle initially
	public boolean CanCastle=true;
	
	//Indicate if Rooke is going to castle w/ king
	public boolean GoingToCastle = false;
	
	//IF EVER IF EVER THAT THIS IS CREATED WITHOUT PIECE CREATED, INITIALIZE PIECE CLASS
	public Rooke(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}

	@Override
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

	@Override
	public R TryRookeLeftCastle() {
		// TODO Auto-generated method stub
		//Check if this piece can castle
		if(!CanCastle) {
			System.out.printf("\nThis Rooke cannot castle @ [%d,%d]\n",super.CurrentPosition[0],super.CurrentPosition[1]);
			return null;
		}
		
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		Ret = IterateThrough(FP,2,7);	
		
		int[] MightBeKing = {Ret[1],Ret[2]};
		Piece King = super.GetPiece(MightBeKing);
		
		if(King instanceof King<?,?,?> && King.Player==this.Player) {
			//King and player match
			System.out.printf("\nMy Piece: [%d,%d], My King: [%d,%d]",CurrentPosition[0],CurrentPosition[1],MightBeKing[0],MightBeKing[1]);	
		}
		else {
			System.out.printf("\nThis Rooke TRIED, but cannot castle @ [%d,%d]\n",super.CurrentPosition[0],super.CurrentPosition[1]);
			return null;
		}
		
		GoingToCastle=true;
		
		return (R)Ret;
	}

	@Override
	public R TryRookeRightCastle() {
		// TODO Auto-generated method stub
		//Check if this piece can castle
		if(!CanCastle) {
			System.out.printf("\nThis Rooke cannot castle @ [%d,%d]\n",super.CurrentPosition[0],super.CurrentPosition[1]);
			return null;
		}
		
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		Ret = IterateThrough(FP,3,7);	
		
		int[] MightBeKing = {Ret[1],Ret[2]};
		Piece King =super.GetPiece(MightBeKing);
		
		if(King instanceof King<?,?,?> && King.Player==this.Player) {
			//King and player match
			System.out.printf("\nMy Piece: [%d,%d], My King: [%d,%d]",CurrentPosition[0],CurrentPosition[1],MightBeKing[0],MightBeKing[1]);	
		}
		else {
			System.out.printf("\nThis Rooke TRIED, but cannot castle @ [%d,%d]\n",super.CurrentPosition[0],super.CurrentPosition[1]);
			return null;
		}
		
		GoingToCastle=true;
		
		return (R)Ret;
	}

}
