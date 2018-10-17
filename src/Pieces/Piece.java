package Pieces;

import Main.*;

public abstract class Piece extends Player {

	//Points to Player K's Pieces, in order to find other ally Pieces in board.
	public Piece[] Pieces;
	//Have to know what player piece has
	char Player;
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
		System.out.println("\nBoard to look at\n");
		PrintBoard();
		//Iterate through board to find something 
		if(Board[P2[0]][P2[1]]=='#' || Board[P2[0]][P2[1]]==' ') {
			//Free Space, return [1,...,8]
			if(this instanceof Knight<?,?,?>) {
			//Knight Piece, special case, can hop over anyone
			//Means clear to move to it, not coordinate case necessary
			return ComputeWisePosition(P,P2);
			}
			else {
			return ComputeWisePosition(P,P2);
			}
		}
		//ALLY PIECE
		else if(AllyPiece(P2)) {
			//Ally Piece, return >=17
			return 17;
		}
		//ENEMY PIECE
		else {
			//Kill Piece!
			if(this instanceof Knight<?,?,?>) {
				//Meaning clear to attack, no coordinate indication necessary for knight
				return ComputeWisePosition(P,P2);
			}
			//Enemy Piece!!
			return ComputeWisePosition(P,P2)+8;
		}
	}
	
	 public boolean IntEquals(int[] p1, int[] p2) {
		 return p2[0]==p1[0] && p2[1]==p1[1];
	 }
	
	 //Returns int corresponding to where the next move is, if free space.
	 public int ComputeWisePosition(int[] p, int[] p2) {
		 System.out.printf("PWISE FROM: [%d,%d]\n", p[0],p[1]);
		 
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
		
		for(int i=0;i<Pieces.length;i+=1) {
			if(P[0]==Pieces[i].CurrentPosition[0] && P[1]==Pieces[i].CurrentPosition[1]) {
				return true;
			}
		}
		return false;
	}

	public int ApplyMove(int[] P2) {
		
		System.out.printf("FROM:[%d,%d] TO: [%d,%d]\n",CurrentPosition[0],CurrentPosition[1],P2[0],P2[1]);
		
		//Bounds check
		if(P2[0]<0||P2[0]>7||P2[1]<0||P2[1]>7) {
			System.out.println("Position out of bounds");
			return -1;
		}
		//Collision check Enemy
		//Create function GetPiece(P2)
		
		/*
		if(this instanceof Knight<?,?,?>) {
		int[] DummyKnightPosition = {P2[0]-1,P2[1]};
		return GetPotentialPiece(DummyKnightPosition,P2);	
		}
		*/
		
		return GetPotentialPiece(CurrentPosition,P2);
	}
	
}
