package Pieces;

import java.util.LinkedList;

import Main.*;

public abstract class Piece extends Player {

	//Points to Player K's Pieces, in order to find other ally Pieces in board.
	public LinkedList<Piece> Pieces = new LinkedList<Piece>();
	//Have to know what player piece has
	public char Player;
	//Instant access of Piece type
	public char Piece;
	//Have to have current position of piece
	public int[] CurrentPosition = new int[2];

	//Constructs Player IF YOU EVER CREATED PIECE W/O PLAYER
	public Piece(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}
	
	public void SetPlayer(char c) {
		this.Player = c;
	}
	
	//Get Potential Piece enemy, ally, or nothing by looking at the board.
	public int GetPotentialPiece(int[] P, int[] P2) {
		//System.out.println("\nBoard to look at\n");
		//PrintBoard();
		//Iterate through board to find something 
		if(Board[P2[0]][P2[1]]=='#' || Board[P2[0]][P2[1]]==' ') {
			//Free Space, return [1,...,8]
			return ComputeWisePosition(P,P2);
		}
		//ALLY PIECE
		else if(AllyPiece(P2)) {
			//Ally Piece, return >=17
			return ComputeWisePosition(P,P2)+16;
		}
		//ENEMY PIECE
		else {
			//Kill Piece!
			//Enemy Piece!!
			return ComputeWisePosition(P,P2)+8;
		}
	}
	
	 public boolean IntEquals(int[] p1, int[] p2) {
		 return p2[0]==p1[0] && p2[1]==p1[1];
	 }
	
	 //Returns int corresponding to where the next move is, if free space.
	 public int ComputeWisePosition(int[] p, int[] p2) {
		 //System.out.printf("PWISE FROM: [%d,%d]\n", p[0],p[1]);
		 
		 if(this instanceof Knight<?,?,?>) {
			 return KnightStatus(p,p2);
		 }
		 
		 //Case 1, left up from current
		 int[] p3 = {p[0]-1,p[1]+1};
		 int Pose = 1;
		 
		 for(int i=-1; i<=1;i+=1) {
			 for(int j=-1; j<=1; j+=1) {
			 if((i!=p[0] || j!=p[1])) {
				 //Do check
				 p3[0] = p[0]+i;
				 p3[1] = p[1]+j;
				 if(p3[0]==p2[0]&&p3[1]==p2[1]) {
					 return Pose;
				 }
				 System.out.printf("Next Pose: [%d,%d]\n",p3[0],p3[1]);
			 }
			 //Next Possible Pose
			 Pose+=1;
			 }
		 }
		 //Impossible
		 return -1;
	 }

	public int KnightStatus(int[] p, int[] p2) {
		
		if(p2[1]-p[1]==1) {
			//Went Right after U or D 2
			if(p2[0]-p[0]==2) {
				//Went Up 2 THEN R
				return 2;
			}
			else if(p2[0]-p[0]==-2) {
				//Went Down 2 THEN R
				return 5;
			}
		}
		
		else if(p2[1]-p[1]==-1) {
			//Went Left after U or D 2
			if(p2[0]-p[0]==2) {
				//Went Up 2 Then L
				return 1;
			}
			else if(p2[0]-p[0]==-2) {
				//Went DOWN 2 THEN L
				return 6;
			}
		}
		
		else if(p2[0]-p[0]==1) {
			//Went Up After L or R 2
			if(p2[1]-p[1]==2) {
				//Went RIGHT 2 then UP
				return 3;
			}
			else if(p2[1]-p[1]==-2) {
				//Went LEFT 2 then UP
				return 8;
			}
		}
		
		else if(p2[0]-p[0]==-1) {
			//Went Down After L or R 2
			if(p2[1]-p[1]==2) {
				//Went RIGHT 2 THEN Down
				return 4;
			}
			else if(p2[1]-p[1]==-2) {
				//Went LEFT 2 THEN Down
				return 7;
			}
		}
		//SHOULD NEVER HAPPEN W/ HORSE
		return -1;
	}

	//Check if found ally piece in that position
	public boolean AllyPiece(int [] P) {
		
		for(int i=0;i<Pieces.size();i+=1) {
			if(P[0]==Pieces.get(i).CurrentPosition[0] && P[1]==Pieces.get(i).CurrentPosition[1]) {
				return true;
			}
		}
		return false;
	}
	
	protected int[] IterateThrough(int[] FP, int Case,int i) {
		// TODO Auto-generated method stub
		
		int[] Ret = null;
		
		int[]P = new int[2];
		
		//Case 0 of iterateThrough, increment Down
		if(Case==0) {
			
		for(int j=0;j<i+1;j+=1) {
			P[0] = FP[0]-1;
			P[1] = FP[1];
			
			Ret = ApplyMove(FP,P);

			//If walks right into any piece, invalidated move
			if(Ret[0]>8) {
				Ret[0]=-1;
				return Ret;
			}
			FP[0]-=1;
		}
		Ret[4]+=i;
		
		}
		//Case 1 of iterateThrough, increment Up
		else if(Case==1) {
			
			for(int j=0;j<i+1;j+=1) {
				P[0] = FP[0]+1;
				P[1] = FP[1];
				
				Ret = ApplyMove(FP,P);
				//If walks right into any piece, invalidated move
				if(Ret[0]>8) {
					Ret[0]=-1;
					return Ret;
				}
				
				FP[0]+=1;
			}
			Ret[4]-=i;	
			
		}
		//Case 1 of iterateThrough, increment Left
		else if(Case==2) {
			
			for(int j=0;j<i+1;j+=1) {
				P[0] = FP[0];
				P[1] = FP[1]-1;
				
				Ret = ApplyMove(FP,P);
				//If walks right into any piece, invalidated move
				if(Ret[0]>8) {
					Ret[0]=-1;
					return Ret;
				}
				
				FP[0]-=1;
			}
			Ret[5]+=i;	
			
		}
		//Case 3 of iterateThrough, increment Right
		else if(Case==3) {
			
			for(int j=0;j<i+1;j+=1) {
				P[0] = FP[0];
				P[1] = FP[1]+1;
				
				Ret = ApplyMove(FP,P);
				//If walks right into any piece, invalidated move
				if(Ret[0]>8) {
					Ret[0]=-1;
					return Ret;
				}
				
				FP[0]+=1;
			}
			Ret[5]-=i;	
			
		}
		//Case 4 of iterateThrough, increment UpLeft
		else if(Case==4) {
			
			for(int j=0;j<i+1;j+=1) {
				P[0] = FP[0]+1;
				P[1] = FP[1]-1;
				
				Ret = ApplyMove(FP,P);
				//If walks right into any piece, invalidated move
				if(Ret[0]>8) {
					Ret[0]=-1;
					return Ret;
				}
				
				FP[0]+=1;
				FP[1]-=1;
			}
			Ret[4]-=i;
			Ret[5]+=i;	
			
		}
		//Case 5 of iterateThrough, increment UpRight
		else if(Case==5) {
			
			for(int j=0;j<i+1;j+=1) {
				P[0] = FP[0]+1;
				P[1] = FP[1]+1;
				
				Ret = ApplyMove(FP,P);
				//If walks right into any piece, invalidated move
				if(Ret[0]>8) {
					Ret[0]=-1;
					return Ret;
				}
				
				FP[0]+=1;
				FP[1]+=1;
				
			}
			Ret[4]-=i;
			Ret[5]-=i;
			
		}
		//Case 6 of iterateThrough, increment DownRight
		else if(Case==6) {
			
			for(int j=0;j<i+1;j+=1) {
				P[0] = FP[0]-1;
				P[1] = FP[1]+1;
				
				Ret = ApplyMove(FP,P);
				//If walks right into any piece, invalidated move
				if(Ret[0]>8) {
					Ret[0]=-1;
					return Ret;
				}
				
				FP[0]-=1;
				FP[1]+=1;
				
			}
			Ret[4]+=i;
			Ret[5]-=i;
			
		}
		//Case 7 of iterateThrough, increment DownLeft
		else if(Case==7) {
			
			for(int j=0;j<i+1;j+=1) {
				P[0] = FP[0]-1;
				P[1] = FP[1]-1;
				
				Ret = ApplyMove(FP,P);
				//If walks right into any piece, invalidated move
				if(Ret[0]>8) {
					Ret[0]=-1;
					return Ret;
				}
				
				FP[0]-=1;
				FP[1]-=1;
				
			}
			Ret[4]+=i;
			Ret[5]+=i;	
			
		}
		
		return Ret;
	}
	
	public int[] ApplyMove(int[] FirstPosition,int[] NextPosition) {
		
		System.out.printf("\n-------------NEXT MOVE-------------\n\nFROM:[%d,%d] TO: [%d,%d]\n",FirstPosition[0],FirstPosition[1],NextPosition[0],NextPosition[1]);
		
		int[] R = new int[6];
		//Return status keeps track of current player
		R[3] = Piece;
		
		R[4] = FirstPosition[0];
		R[5] = FirstPosition[1];
		
		R[1] = NextPosition[0];
		R[2] = NextPosition[1];
		
		//Bounds check
		if(NextPosition[0]<0||NextPosition[0]>7||NextPosition[1]<0||NextPosition[1]>7||FirstPosition[0]<0||FirstPosition[1]>7||FirstPosition[1]<0||FirstPosition[1]>7) {
			//System.out.println("Position out of bounds");
			R[0] = -1;
			return R;
		}
		//Collision check Enemy
		//Create function GetPiece(P2)
		R[0] = GetPotentialPiece(FirstPosition,NextPosition);                                                                                                              
		//KillPiece(R);
		return R;
	}

	public void SetPiece(char c) {
		// TODO Auto-generated method stub
		this.Piece = c;
	}

	
}
