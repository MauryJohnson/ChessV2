package Pieces;

import Main.*;
/**
 * Abstract class piece, extended by all pieces
 * @author Maury Johnson
 *
 */
public abstract class Piece extends Player {

	/**
	 * Have to know what player piece has
	 * @author Maury Johnson
	 */
	public char Player;
	/**
	 * Instant access of Piece type
	 * @author Maury Johnson
	 */
	public char Piece;
	/**
	 * integer array indicating current position of piece on boars
	 * Have to have current position of piece
	 * @author Maury Johnson
	 */
	public int[] CurrentPosition;

	/**
	 * Constructs Player IF YOU EVER CREATED PIECE W/O PLAYER
	 * @param Player
	 * The type of player
	 * @author Maury Johnson
	 */
	public Piece(char Player) {
		super(Player);
		CurrentPosition = new int[2];
		// TODO Auto-generated constructor stub
	}
	/**
	 * Sets player color that piece has
	 * @param c
	 * The type of player to set to piece
	 * @author Maury Johnson
	 */
	public void SetPlayer(char c) {
		this.Player = c;
	}
	
	/**
	 * Get Potential Piece enemy, ally, or nothing by looking at the board.
	 * @param P
	 * Start Coordinates
	 * @param P2
	 * End Coordinates
	 * @return
	 * int
	 * @author Maury Johnson
	 */
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
	/**
	 * Determines if coordinate 1 is equal to coordinate 2
	 * @param p1
	 * Coordinate 1
	 * @param p2
	 * Coordinate 2
	 * @return
	 * boolean
	 */
	 public boolean IntEquals(int[] p1, int[] p2) {
		 return p2[0]==p1[0] && p2[1]==p1[1];
	 }
	
	 /**
	  * Returns int corresponding to where the next move is, if free space.
	  * @param p
	  * Coordinate 1
	  * @param p2
	  * Coordinate 2
	  * @return
	  * int
	  */
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
				 
			 if((i!=0 || j!=0 )) {
				 //Do check
				 p3[0] = p[0]+i;
				 p3[1] = p[1]+j;
				 //System.out.printf("Check this pose: %d @  [%d,%d]\n",Pose,p3[0],p3[1]);
				 if(p3[0]==p2[0]&&p3[1]==p2[1]) {
					 return Pose;
				 }
				 //System.out.printf("Next Pose: %d @ [%d,%d]\n",Pose+1,p3[0],p3[1]);
				 //Next Possible Pose
				 Pose+=1;
			 }
			
			 }
		 }
		 //Impossible
		 return -1;
	 }

	 /**
	  * Returns special status for knight
	  * @param p
	  * Knight Coordinate
	  * @param p2
	  * Goal Coordinate
	  * @return
	  * int
	  * @author Maury Johnson
	  */
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

	/**
	 * Check if found ally piece in that position
	 * @param P
	 * Potential Ally Coordinate
	 * @return
	 * boolean
	 * @author Maury Johnson
	 */
	public boolean AllyPiece(int [] P) {
		
		for(int i=0;i<Pieces.size();i+=1) {
			if(P[0]==Pieces.get(i).CurrentPosition[0] && P[1]==Pieces.get(i).CurrentPosition[1]) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @param FP
	 * First Position
	 * @param Case
	 * Indicates Type of move
	 * @param i
	 * How far to go for more
	 * @return
	 * int[]
	 * @author Maury Johnson
	 */
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
			//If collide with your ally or out of bounds, STOP
			if(Ret[0]>16 || Ret[0]<1) {
				Ret[0]=-1;
				return Ret;
			}
			//Collide with enemy, break from loop.
			else if(Ret[0]>=9 && Ret[0]<=16) {
				break;
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
				//If collide with your ally or out of bounds, STOP
				if(Ret[0]>16 || Ret[0]<1) {
					Ret[0]=-1;
					return Ret;
				}
				//Collide with enemy, break from loop.
				else if(Ret[0]>=9 && Ret[0]<=16) {
					break;
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
				//If collide with your ally or out of bounds, STOP
				if(Ret[0]>16 || Ret[0]<1) {
					Ret[0]=-1;
					return Ret;
				}
				//Collide with enemy, break from loop.
				else if(Ret[0]>=9 && Ret[0]<=16) {
					break;
				}
				
				FP[1]-=1;
			}
			Ret[5]+=i;		
		}
		//Case 3 of iterateThrough, increment Right
		else if(Case==3) {
			
			for(int j=0;j<i+1;j+=1) {
				P[0] = FP[0];
				P[1] = FP[1]+1;
				
				Ret = ApplyMove(FP,P);
				//If collide with your ally or out of bounds, STOP
				if(Ret[0]>16 || Ret[0]<1) {
					Ret[0]=-1;
					return Ret;
				}
				//Collide with enemy, break from loop.
				else if(Ret[0]>=9 && Ret[0]<=16) {
					break;
				}
				
				FP[1]+=1;
			}
			Ret[5]-=i;	
			
		}
		//Case 4 of iterateThrough, increment UpLeft
		else if(Case==4) {
			
			for(int j=0;j<i+1;j+=1) {
				P[0] = FP[0]+1;
				P[1] = FP[1]-1;
				
				Ret = ApplyMove(FP,P);
				//If collide with your ally or out of bounds, STOP
				if(Ret[0]>16 || Ret[0]<1) {
					Ret[0]=-1;
					return Ret;
				}
				//Collide with enemy, break from loop.
				else if(Ret[0]>=9 && Ret[0]<=16) {
					break;
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
				//If collide with your ally or out of bounds, STOP
				if(Ret[0]>16 || Ret[0]<1) {
					Ret[0]=-1;
					return Ret;
				}
				//Collide with enemy, break from loop.
				else if(Ret[0]>=9 && Ret[0]<=16) {
					break;
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
				//If collide with your ally or out of bounds, STOP
				if(Ret[0]>16 || Ret[0]<1) {
					Ret[0]=-1;
					return Ret;
				}
				//Collide with enemy, break from loop.
				else if(Ret[0]>=9 && Ret[0]<=16) {
					break;
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
				//If collide with your ally or out of bounds, STOP
				if(Ret[0]>16 || Ret[0]<1) {
					Ret[0]=-1;
					return Ret;
				}
				//Collide with enemy, break from loop.
				else if(Ret[0]>=9 && Ret[0]<=16) {
					break;
				}
				
				FP[0]-=1;
				FP[1]-=1;
				
			}
			Ret[4]+=i;
			Ret[5]+=i;	
		}
		//Case 8 of iterateThrough, increment Left For RookeCastleLeft
		else if(Case==8) {
					
			//This Position will be restored after checking for check w/ temp king poses
			int[] King_Original_Pose = new int[2];
			Piece King = GetPieceFromType('K');
			King_Original_Pose[0] = King.CurrentPosition[0];
			King_Original_Pose[1] = King.CurrentPosition[1];
			
			int j=0;
			
			for(j=0;j<i+1;j+=1) {
				P[0] = FP[0];
				P[1] = FP[1]-1;
						
				
				if(j>=1) {
					//Check for checks in these positions
					King.CurrentPosition[1]=P[1];
					System.out.printf("\nIterateThrough8 Case8 King Pose: [%d,%d]\n",King.CurrentPosition[0],King.CurrentPosition[1]);
					if(MeInCheck()) {
						
						King.CurrentPosition[1] = King_Original_Pose[1];
				
						Ret[0]=-1;
						return Ret;
					}
				}
				
				Ret = ApplyMove(FP,P);
				//If collide with your ally,enemy, or out of bounds, STOP
				if(Ret[0]>8 || Ret[0]<1) {
					Ret[0]=-1;
					King.CurrentPosition[1] = King_Original_Pose[1];
					return Ret;
				}
						
				FP[1]-=1;
						
			}
			
			Ret[5]+=i;	
			King.CurrentPosition[1] = King_Original_Pose[1];
		}
		//Case 9 of iterateThrough, increment Right for RookeCastleRight
		else if(Case==9) {
			
			//This Position will be restored after checking for check w/ temp king poses
			int[] King_Original_Pose = new int[2];
			Piece King = GetPieceFromType('K');
			King_Original_Pose[0] = King.CurrentPosition[0];
			King_Original_Pose[1] = King.CurrentPosition[1];
			
			int j;
		
			for(j=0;j<i+1;j+=1) {
				P[0] = FP[0];
				P[1] = FP[1]+1;
				
				if(j>=1) {
					//Check for checks in these positions
					King.CurrentPosition[1]=P[1];
					//System.out.printf("\nIterateThrough9 Case9 King Pose: [%d,%d]\n",King.CurrentPosition[0],King.CurrentPosition[1]);
					if(MeInCheck()) {
						
						King.CurrentPosition[1] = King_Original_Pose[1];
						
						Ret[0]=-1;
						return Ret;
					}
				}
				
				Ret = ApplyMove(FP,P);
				
				//If collide with your ally,enemy, or out of bounds, STOP
				if(Ret[0]>8 || Ret[0]<1) {
					Ret[0]=-1;
					King.CurrentPosition[1] = King_Original_Pose[1];
					return Ret;
				}
				
				FP[1]+=1;
				
			}
		
			Ret[5]-=i;	
			King.CurrentPosition[1] = King_Original_Pose[1];
		}
		
		//System.out.printf("Iterate Through Case:%d Return Status: %d TO:[%d,%d] Piece:%c FROM:[%d,%d]   \n",Case,Ret[0],Ret[1],Ret[2],Ret[3],Ret[4],Ret[5]);
		
		return Ret;
	}
	
	/**
	 * Apply move to nearest edge, returns status of trying to move to that edge
	 * @param FirstPosition
	 * The First Position
	 * @param NextPosition
	 * The Next Position
	 * @return
	 * int[]
	 * @author Maury Johnson
	 */
	public int[] ApplyMove(int[] FirstPosition,int[] NextPosition) {
		
		//System.out.printf("\n-------------NEXT MOVE-------------\n\nFROM:[%d,%d] TO: [%d,%d]\n",FirstPosition[0],FirstPosition[1],NextPosition[0],NextPosition[1]);
		
		int[] Ret = new int[6];
		//Return status keeps track of current player
		Ret[3] = Piece;
		
		Ret[4] = FirstPosition[0];
		Ret[5] = FirstPosition[1];
		
		Ret[1] = NextPosition[0];
		Ret[2] = NextPosition[1];
		
		//Bounds check
		if(NextPosition[0]<0||NextPosition[0]>7||NextPosition[1]<0||NextPosition[1]>7||FirstPosition[0]<0||FirstPosition[1]>7||FirstPosition[1]<0||FirstPosition[1]>7) {
			//System.out.println("Position out of bounds ApplyMove2");
			Ret[0] = -1;
			//Ret = new int[6];
			//Ret[0]=-1;
			return Ret;
		}
		//Collision check Enemy
		//Create function GetPiece(P2)
		Ret[0] = GetPotentialPiece(FirstPosition,NextPosition);                                                                                                              
		//KillPiece(R);
		return Ret;
	}
	
	/**
	 * Sets the field piece to the type given
	 * @param c
	 * Piece type to set to
	 * @author Maury Johnson
	 */
	public void SetPiece(char c) {
		// TODO Auto-generated method stub
		this.Piece = c;
	}
	
	/**
	 * Given type character, get piece from current player of piece
	 * @param c
	 * the type of piece
	 * @return
	 * Piece
	 * @author Maury Johnson
	 */
	public Piece GetPieceFromType(char c) {
		
		for(int i=0;i<super.Pieces.size();i+=1) {
		
		if(super.Pieces.get(i).Piece==c) {
		
			//System.out.printf("\nGot %c @[%d,%d] FROM Player: %c\n",Pieces.get(i).Piece,Pieces.get(i).CurrentPosition[0],Pieces.get(i).CurrentPosition[1],Player);
			
			return super.Pieces.get(i);
		}
		
		}
		
		return null;
	}
	
}
