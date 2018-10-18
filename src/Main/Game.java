package Main;

import java.util.LinkedList;

import Pieces.*;

//When Game class created, game is started
//GAME CONTROLS PLAYERS,PIECES,BOARD,..
public class Game {
	public static Player Me;
	public static Player Opponent;
	
	public Game(Player P1, Player P2) {
		Me = P1;
		Opponent = P2;
	}
	
public static void main(String[] args) {
	
	//This creates a board [8][8]
	new Board();
	
	//CREATE PLAYER 1
	Player P1 = new Player('B');
	P1.INIT();
	System.out.println();
	//CREATE PLAYER 2
	Player P2 = new Player('W');
	P2.INIT();
	/////////////////
		
	//Board Update Test BOTH PLAYERS
	P1.Board[7][7] = 'O';
	P2.Pieces.get(1).ApplyMove(new int[2]);
	P2.Board[7][7] = 'N';
	P1.Pieces.get(1).ApplyMove(new int[2]);
	P1.Board[7][7] = 'P';
	P2.Pieces.get(1).ApplyMove(new int[2]);
	//////////////////////////
	
	P1.Board[7][7] = 'r';
	
	//NEW GAME
	Game G = new Game(P1,P2);
	
	//Swap Player Test
	/*
	G.PrintPlayers();
	
	G.SwapPlayer();
	
	G.PrintPlayers();
	*/

	//////////
	int[] RET = {0};
	
	G.SwapPlayer();
	
	//More advanced testing...
	//KNIGHT TRY MOVE TESTING ALL
	//PLAYER 2
	//G.ReturnStatusMove(((Knight<int[],int[],int[]>)P2.Pieces.get(1)).TryDownLeft());
	//G.Me.PrintBoard();
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryDownRight());
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryDownRight());
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryKnightRightDown());
	

	
	//G.ReturnStatusMove(((Knight<int[],int[],int[]>)P2.Pieces.get(1)).TryUpRight());
	//G.ReturnStatusMove(((Knight<int[],int[],int[]>)P2.Pieces.get(1)).TryDownRight());
	//G.ReturnStatusMove(((Knight<int[],int[],int[]>)P2.Pieces.get(1)).TryKnightLeftDown());
	//G.ReturnStatusMove(((Knight<int[],int[],int[]>)P2.Pieces.get(1)).TryUpLeft());
	//G.Me.PrintBoard();
	//PLAYER 1
	
	/*ReturnStatus(((Knight<int[],int[],int[]>)P1.Pieces[1]).TryUpLeft()[0]);
	ReturnStatus(((Knight<int[],int[],int[]>)P2.Pieces[1]).TryUpRight()[0]);
	ReturnStatus(((Knight<int[],int[],int[]>)P2.Pieces[1]).TryKnightRightUp()[0]);
	ReturnStatus(((Knight<int[],int[],int[]>)P2.Pieces[1]).TryKnightRightDown()[0]);
	ReturnStatus(((Knight<int[],int[],int[]>)P2.Pieces[1]).TryKnightLeftUp()[0]);
	ReturnStatus(((Knight<int[],int[],int[]>)P2.Pieces[1]).TryKnightLeftDown()[0]);
	*/
	
	//P1.Board[7][7] = 'Z';
	//ReturnStatus(((Bishop<int[],int[],int[]>)P2.Pieces[2]).TryDownLeft()[0]);
	/////////////////////////
	
}

public void PrintPlayers() {
	System.out.printf("\n###########\nME: %c\n",Me.Player);
	System.out.printf("Opponent: %c\n#############\n\n",Opponent.Player);
}

public void ReturnStatus(int[] R) {
	if(R[0]<0) {
		System.out.println("ERROR / BOUNDS ERROR");
	}
	else {
		System.out.printf("\nRETURN STATUS: %d\n",R[0]);
		if(R[0]>=1 && R[0]<=8 || R[0]>=9 && R[0]<=16) {
			System.out.printf("\nMove to: [%d,%d] W\\ Piece: %c\n",R[1],R[2],(char)R[3]);
			int[] K = {R[1],R[2],R[3],R[4],R[5]};
			
			//KillPiece(K);
		
		}
		else if(R[0]>=17){
			//Ally Detected, do nothing
		}
	}
	PrintAllPieceStatus();
	Me.PrintBoard();
}

public void PrintAllPieceStatus() {
	System.out.println("\nMy Piece Stati");
	for(int i=0; i<Me.Pieces.size();i+=1) {
		System.out.printf("Piece:%c My Position:[%d,%d]\n",Me.Pieces.get(i).Piece,Me.Pieces.get(i).CurrentPosition[0],Me.Pieces.get(i).CurrentPosition[1]);
	}
	System.out.println("\nOpponent Piece Stati");
	for(int i=0; i< Opponent.Pieces.size();i+=1) {
		System.out.printf("Piece:%c My Position:[%d,%d]\n",Opponent.Pieces.get(i).Piece,Opponent.Pieces.get(i).CurrentPosition[0],Opponent.Pieces.get(i).CurrentPosition[1]);
	}
	System.out.println("");
}

public Piece GetPiece(int[] IT){
	
	for(int i=0; i<Me.Pieces.size();i+=1) {
		if(IT[0]==Me.Pieces.get(i).CurrentPosition[0] && IT[1]==Me.Pieces.get(i).CurrentPosition[1]) {
			int c1 = Me.Pieces.get(i).CurrentPosition[0];
			int c2 = Me.Pieces.get(i).CurrentPosition[1];
			System.out.printf("\n***Found Piece %c @ [%d,%d]***\n",Me.Board[c1][c2],c1,c2);
			return Me.Pieces.get(i);
		}
	}
	
	for(int i=0; i<Opponent.Pieces.size();i+=1) {
		if(IT[0]==Opponent.Pieces.get(i).CurrentPosition[0] && IT[1]==Opponent.Pieces.get(i).CurrentPosition[1]) {
			int c1 = Opponent.Pieces.get(i).CurrentPosition[0];
			int c2 = Opponent.Pieces.get(i).CurrentPosition[1];
			System.out.printf("\n***Found Piece %c @ [%d,%d]***\n",Opponent.Board[c1][c2],c1,c2);
			return Opponent.Pieces.get(i);
		}
	}
	
	//If no player pieces found in that spot
	return null;
}

public int ReturnStatusMove(int[] R) {
	int ret = -1;
	if(R[0]<0) {
		System.out.println("ERROR / BOUNDS ERROR");
	}
	else {
		System.out.printf("\nRETURN STATUS: %d\n",R[0]);
		if(R[0]>=1 && R[0]<=8 || R[0]>=9 && R[0]<=16) {
			System.out.printf("\nMove to: [%d,%d] W\\ Piece: %c\n",R[1],R[2],(char)R[3]);
			int[] K = {R[1],R[2],R[3],R[4],R[5]};
			
			ret = KillPiece(K);			
			
			if(ret==1&&OpponentCheckMate()) {
				System.out.printf("\nOpponent:%c is in CHECKMATE! %c WINS!\n",Opponent.Player,Me.Player);
				Me.PrintBoard();
				System.exit(-1);
			}
			
		}
		else if(R[0]>=17){
			//Ally Detected, do nothing
			ret = -1;
		}
	}
	PrintAllPieceStatus();
	Me.PrintBoard();
	return ret;
}

public void SwapPlayer() {
	Player Z = Me;
	Me = Opponent;
	Opponent = Z;
	this.PrintPlayers();
}

//Destroy piece in board
private int KillPiece(int[] K) {
	// TODO Auto-generated method stub
	System.out.printf("Try Kill Piece in Position: [%d,%d] FROM: [%d,%d]\n",K[0],K[1],K[3],K[4]);
	
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		System.out.printf("IF [%d,%d] == [%d,%d]\n",K[0],K[1],Opponent.Pieces.get(i).CurrentPosition[0],Opponent.Pieces.get(i).CurrentPosition[1]);
		if(K[0]==Opponent.Pieces.get(i).CurrentPosition[0] && K[1]==Opponent.Pieces.get(i).CurrentPosition[1]) {
			
			System.out.printf("Kill Opponent Piece:%c @[%d,%d]",
					Opponent.Pieces.get(i).Piece,
					Opponent.Pieces.get(i).CurrentPosition[0],
					Opponent.Pieces.get(i).CurrentPosition[1]);
				
			Opponent.Pieces.get(i).CurrentPosition[0] = -1;
			Opponent.Pieces.get(i).CurrentPosition[1] = -1;
			
			//Opponent.Board[K[0]][K[1]] = (char)K[2];
			
			int [] Get = {K[3],K[4]};
			Piece Got = GetPiece(Get);
		
			if(Got!=null) {
			char MyType = Opponent.Board[Got.CurrentPosition[0]][Got.CurrentPosition[1]];	
			Me.Board=Me.CopyNewBoard(K[0],K[1],MyType);
			Me.Board=Me.CopyNewBoard(K[3],K[4],Me.WhichBlock(K[3],K[4]));
			Got.CurrentPosition = K;
			//Check if this leads to a check on your end...
			if(MeInCheck()){
				System.out.println("Invalid Move, puts yourself in check, restoring original spot");
				//Restore Opponent piece
				Opponent.Pieces.get(i).CurrentPosition[0] = K[1];
				Opponent.Pieces.get(i).CurrentPosition[1] = K[2];
				Me.Board=Me.CopyNewBoard(K[1], K[2], Opponent.Pieces.get(i).Piece);
				Me.Board=Me.CopyNewBoard(K[3], K[4], MyType);
				int [] OldP = {K[3],K[4]};
				Got.CurrentPosition = OldP;
				return -1;
			}
			else if(OpponentInCheck()){
				System.out.println("Opponent is in check");
				return 1;
			}
			}
		
		}
	}
	System.out.println("\n Found Free Space #/' '");
	
	int [] Get = {K[3],K[4]};
	Piece Got = GetPiece(Get);

	if(Got!=null) {
	char typeGot = Me.Board[Got.CurrentPosition[0]][Got.CurrentPosition[1]];	
	Me.Board=Me.CopyNewBoard(K[0],K[1],typeGot);
	Me.Board=Me.CopyNewBoard(K[3],K[4],Me.WhichBlock(K[3],K[4]));
	Got.CurrentPosition=K;
	//MeInCheck();
	//Check if this leads to a check on your end...
	if(MeInCheck()){
		System.out.println("Invalid Move, puts yourself in check");
		return -1;
	}
	else if(OpponentInCheck()){
		System.out.println("Opponent is in check");
		return 1;
	}
	}
	return 0;
	
}

private boolean MeInCheck() {
	System.out.println("Am I in check?");
	//Iterate through all piece moves
	//See if ANY can attack king!

	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %d^^^^^^^^^^^^\n",i);
		AddAllSets(R,Opponent.Pieces.get(i));
		if(KingAttacked(R)) {
			return true;
		}
		//THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
	}
	
	
	System.out.printf("\n %c(Me) Not In Check Because of My move \n",Me.Player);
return false;	
}


//Check if king is attacked given list of all positions that are attacked
private boolean KingAttacked(LinkedList<int[]> R) {
	if(R==null) {
		return false;
	}
	// TODO Auto-generated method stub
	for(int i=0;i<R.size();i+=1) {
		if(R.get(i)==null) {
			continue;
		}
		//If Return status is valid IE a free area OR attacked area
		if(R.get(i)[0]>=1 && R.get(i)[0]<=16) {
			
		int[] Attack = {R.get(i)[1],R.get(i)[2]};
		Piece Got = GetPiece(Attack);
		int [] MyPosition = {R.get(i)[4],R.get(i)[5]};
		Piece ME = GetPiece(MyPosition);
		if(Got instanceof King<?,?,?>) {
			if(Got.Player!=Opponent.Player) {
				//Opponent is attacking my king!
				System.out.printf("\n%c is attacking %c king TO [%d,%d]\n",ME.Player,Got.Player,Got.CurrentPosition[0],Got.CurrentPosition[1]);
				return true;
				}
			}
		
		}
		
		else {
			System.out.printf("King Attacked check Invalid move: %d\n",i);
		}
		
	}
	return false;
}

private boolean MoveStillCheck(LinkedList<int[]> R) {
	if(R==null) {
		return true;
	}
	for(int i=0;i<R.size();i+=1) {
		if(R.get(i)==null) {
			continue;
		}
		if(R.get(i)[0]>=1&&R.get(i)[0]<=16) {
		
		int[] MyPosition = {R.get(i)[4],R.get(i)[5]};
		int[] Attack = {R.get(i)[1],R.get(i)[2]};
		Piece MyPiece = GetPiece(MyPosition);
		if(MyPiece==null) {
			return true;
			/*System.out.println("ERROR! My Piece is MISSING");
			System.exit(-1);
			*/
		}
		
		Piece Got = GetPiece(Attack);
		
		if(Got!=null) {
		
		char MyType = MyPiece.Piece;
		
		Opponent.Board=Opponent.CopyNewBoard(Attack[0],Attack[1],MyType);
		
		Opponent.Board=Opponent.CopyNewBoard(MyPosition[0],MyPosition[1],Opponent.WhichBlock(MyPosition[0],MyPosition[1]));

		MyPiece.CurrentPosition = Attack;
		
		int [] n = {-1,-1};
		Got.CurrentPosition =n;
		
		if(!OpponentInCheck()) {
			//Found solution out of check
			Opponent.Board=Opponent.CopyNewBoard(MyPosition[0], MyPosition[1], MyType);
			
			Opponent.Board=Opponent.CopyNewBoard(Attack[0], Attack[1], Got.Piece);
			
			MyPiece.CurrentPosition = MyPosition;
			
			Got.CurrentPosition = Attack;
			
			return false;
		}
		else {
			//Still in check
			Opponent.Board=Opponent.CopyNewBoard(MyPosition[0], MyPosition[1], MyType);
			
			Opponent.Board=Opponent.CopyNewBoard(Attack[0], Attack[1], Got.Piece);
			
			MyPiece.CurrentPosition = MyPosition;
			
			Got.CurrentPosition = Attack;
			//Continue
		}

		}
		
		}
		else {
			System.out.printf("Move Still in Check Invalid move:%d\n",i);
		}
	}
	return true;
}

//Checkmate can only occur if I make the move
//If not exists case when there is not a check mate for all piece moves,
//CHECKMATE!
private boolean OpponentCheckMate() {
	
	//SwapPlayer();
	
	System.out.println("Is Opponent in checkmate?");
	//Iterate through all opponents moves, generate the new table, and check if
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %d^^^^^^^^^^^^\n",i);
		AddAllSets(R,Opponent.Pieces.get(i));
		if(!MoveStillCheck(R)) {
			return false;
		}
		//THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
	}
	
	System.out.println("\n Opponent IS In CheckMate Because cannot find move to invalidate the check \n");
	
	return true;	
}

private void AddAllSets(LinkedList<int[]> R,Piece P) {
			//IF Rooke
			if(P instanceof Rooke<?,?,?>) {
				R.add(((Rooke<int[],int[],int[]>)P).TryUp());
				R.add(((Rooke<int[],int[],int[]>)P).TryDown());	
				R.add(((Rooke<int[],int[],int[]>)P).TryLeft());
				R.add(((Rooke<int[],int[],int[]>)P).TryRight());
		
			}
			//If Knight
			if(P instanceof Knight<?,?,?>) {
				
				R.add(((Knight<int[],int[],int[]>)P).TryUpRight());
				R.add(((Knight<int[],int[],int[]>)P).TryUpLeft());	
				R.add(((Knight<int[],int[],int[]>)P).TryDownRight());
				R.add(((Knight<int[],int[],int[]>)P).TryDownLeft());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightRightUp());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightRightDown());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightLeftUp());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightLeftDown());
				
				
			}
			//If Bishop
			if(P instanceof Bishop<?,?,?>) {
				
				R.add(((Bishop<int[],int[],int[]>)P).TryUpRight());
				R.add(((Bishop<int[],int[],int[]>)P).TryUpLeft());	
				R.add(((Bishop<int[],int[],int[]>)P).TryDownRight());
				R.add(((Bishop<int[],int[],int[]>)P).TryDownLeft());
		
				
			}
			//If Queen
			if(P instanceof Queen<?,?,?>) {
				R.add(((Queen<int[],int[],int[]>)P).TryUp());
				R.add(((Queen<int[],int[],int[]>)P).TryRight());	
				R.add(((Queen<int[],int[],int[]>)P).TryDown());
				R.add(((Queen<int[],int[],int[]>)P).TryLeft());

				R.add(((Queen<int[],int[],int[]>)P).TryUpRight());
				R.add(((Queen<int[],int[],int[]>)P).TryUpLeft());	
				R.add(((Queen<int[],int[],int[]>)P).TryDownRight());
				R.add(((Queen<int[],int[],int[]>)P).TryDownLeft());
		
			}
			//If King
			if(P instanceof King<?,?,?>) {
				
				R.add(((King<int[],int[],int[]>)P).TryUp());
				R.add(((King<int[],int[],int[]>)P).TryRight());	
				R.add(((King<int[],int[],int[]>)P).TryDown());
				R.add(((King<int[],int[],int[]>)P).TryLeft());

				R.add(((King<int[],int[],int[]>)P).TryUpRight());
				R.add(((King<int[],int[],int[]>)P).TryUpLeft());	
				R.add(((King<int[],int[],int[]>)P).TryDownRight());
				R.add(((King<int[],int[],int[]>)P).TryDownLeft());
		
				
			}
			//If Pawn
			if(P instanceof Pawn<?,?,?>) {
				
				R.add(((Pawn<int[],int[],int[]>)P).TryUp());
				R.add(((Pawn<int[],int[],int[]>)P).TryDown());
				R.add(((Pawn<int[],int[],int[]>)P).TryUpRight());
				R.add(((Pawn<int[],int[],int[]>)P).TryUpLeft());	
				
				R.add(((Pawn<int[],int[],int[]>)P).TryDownRight());
				R.add(((Pawn<int[],int[],int[]>)P).TryDownLeft());	
			
			}
	
}

private boolean OpponentInCheck() {
	
	SwapPlayer();
	
	System.out.println("Is Opponent in check?");
	//Iterate through all piece moves
	//See if ANY can attack king!

	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %d^^^^^^^^^^^^\n",i);
		AddAllSets(R,Opponent.Pieces.get(i));
		if(KingAttacked(R)) {
			SwapPlayer();
			return true;
		}
		//THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
	}
	
	
	System.out.printf("\n %c Not In Check Because of %c move \n",Me.Player,Opponent.Player);
	
	SwapPlayer();
	return false;	
}

}



