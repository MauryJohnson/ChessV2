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
		
		Ret = IterateThrough(FP,8,1);	
		
		if(Ret[0]>0 && Ret[0]<9) {
			//Can Move twice, get king now
			Piece King = GetPieceFromType('K');
			if(King!=null) {
	
				//Add king information here
				int[] ExtraRet = new int[Ret.length+4];
				for(int i=0;i<Ret.length;i+=1) {
					ExtraRet[i]=Ret[i];
				}
				
				//Set Where King will go
				ExtraRet[6] = Ret[1];
				ExtraRet[7] = Ret[2]+1;
				
				//Set Where king is coming from
				ExtraRet[8] = King.CurrentPosition[0];
				ExtraRet[9] = King.CurrentPosition[1];
				
				return (R)ExtraRet;
				
			}
			else {
			Ret[0]=-1;
			return (R)Ret;
			}
		}
		else {
			
			Ret[0] = -1;
			return (R)Ret;
		}
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
		
		Ret = IterateThrough(FP,9,2);	
		
		if(Ret[0]>0 && Ret[0]<9) {
			//Can Move twice, get king now
			Piece King = GetPieceFromType('K');
			if(King!=null) {
	
				//Add king information here
				int[] ExtraRet = new int[Ret.length+4];
				for(int i=0;i<Ret.length;i+=1) {
					ExtraRet[i]=Ret[i];
				}
				
				//Set Where King will go
				ExtraRet[6] = Ret[1];
				ExtraRet[7] = Ret[2]-1;
				
				//Set Where king is coming from
				ExtraRet[8] = King.CurrentPosition[0];
				ExtraRet[9] = King.CurrentPosition[1];
				
				return (R)ExtraRet;
				
			}
			else {
			Ret[0]=-1;
			return (R)Ret;
			}
		}
		else {
			
			Ret[0] = -1;
			return (R)Ret;
		}
		
	}
	
}
