package Pieces;

import Moves.*;

public class Pawn<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R>,UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	public boolean CanMoveUpTwice = true;
	
	public boolean JustMovedTwice = false;
	
	public boolean EnPassantMove = false;
	
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
			
		//IF try to move up twice again
		if(i==1&&!CanMoveUpTwice) {
			System.out.println("Cannot move up twice anymore");
			return null;
		}
		
		Ret = IterateThrough(FP,0,i);	
	
		//Successful just moved twice case
		if(Ret[0]>=1&&Ret[0]<=8 && i==1) {
				JustMovedTwice=true;
		}
		
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
		
		int[] Ret = null;
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i==0||i==1) {
			
		//If try to move up twice again
		if(i==1&&!CanMoveUpTwice) {
			System.out.println("Cannot move up twice anymore");
			return null;
		}
		
		Ret = IterateThrough(FP,1,i);	
		
		//Successful just moved twice case
		if(Ret[0]>=1&&Ret[0]<=8 && i==1) {
			JustMovedTwice=true;
		}
		
		return (R)Ret;
		
		}
		
		else {
			
			System.out.println("Invalid Parameter");
			
			return null;
		}
	}


	@Override
	public R TryRight(int i) {
		// TODO Auto-generated method stub

		int[] Ret = null;
		
		int[] ExtraRet = new int[8];
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i==0) {
		
		Ret = IterateThrough(FP,3,i);	
		
		//Piece is enemy attacked
		if(Ret[0]>8&&Ret[0]<17) {
			
			int[] EnemyPiece = {Ret[1],Ret[2]};
			Piece Enemy = GetPiece(EnemyPiece);
			
			if(Enemy instanceof Pawn<?,?,?>) {
			
			if(((Pawn<int[],int[],int[]>)Enemy).JustMovedTwice){
				
				EnPassantMove =  true;
				
				Cpy(ExtraRet,Ret);
				
				ExtraRet[6] = ((Pawn<int[],int[],int[]>)Enemy).CurrentPosition[0];
				ExtraRet[7] = ((Pawn<int[],int[],int[]>)Enemy).CurrentPosition[1];
				
				Ret = ExtraRet;
				
				//CAN KILL!
				if(Player=='W') {
					Ret[1]-=1;
				
				}
				else {
					Ret[1]+=1;
				
				}
	
				System.out.printf("Extra Values added (Needed for killpiece enpassant), this is position to kill ACTUALLY [%d,%d] AND GOTO: [%d,%d] \n",Ret[6],Ret[7],Ret[1],Ret[2]);
				
				EnPassantMove = true;
				
				return (R)Ret;
				
			}
				
			}
			
		}
		else {
			//Cannot do EnPassant
			return null;
		}
		
			return null;
		}
		
		else {
			
			System.out.println("Invalid Parameterr");
			
			return null;
		}
	}

	//This is for if size of to is 8/
	private void Cpy(int [] To, int[] From) {
		if(To==null||From==null||To.length<8) {
			return;
		}
		for(int i=0; i<From.length; i+=1) {
			To[i]=From[i];
		}
	}

	@Override
	public R TryLeft(int i) {
		// TODO Auto-generated method stub
int[] Ret = null;
		
		int[] ExtraRet = new int[8];
		
		int[] FP = new int[2];
		
		FP[0] = CurrentPosition[0];
		FP[1] = CurrentPosition[1];
		
		if(i==0) {
		
		Ret = IterateThrough(FP,2,i);	
		
		//Piece is enemy attacked
		if(Ret[0]>8&&Ret[0]<17) {
			
			int[] EnemyPiece = {Ret[1],Ret[2]};
			Piece Enemy = GetPiece(EnemyPiece);
			
			if(Enemy instanceof Pawn<?,?,?>) {
			
			if(((Pawn<int[],int[],int[]>)Enemy).JustMovedTwice){
				
				EnPassantMove =  true;
				
				Cpy(ExtraRet,Ret);
				ExtraRet[6] = ((Pawn<int[],int[],int[]>)Enemy).CurrentPosition[0];
				ExtraRet[7] = ((Pawn<int[],int[],int[]>)Enemy).CurrentPosition[1];
				
				Ret = ExtraRet;
				
				//CAN KILL!
				if(Player=='W') {
					Ret[1]-=1;
					
				}
				else {
					Ret[1]+=1;
				
				}
				
				System.out.printf("Extra Values added (Needed for killpiece enpassant), this is position to kill ACTUALLY [%d,%d] AND GOTO: [%d,%d] \n",Ret[6],Ret[7],Ret[1],Ret[2]);
			
				EnPassantMove = true;
				
				return (R)Ret;
				
			}
			
				
			}
			
		}
		else {
			//Cannot do EnPassant
			return null;
		}
		
			return null;
		}
		
		else {
			
			System.out.println("Invalid Parameterr");
			
			return null;
		}
	}

}
