package Main;

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
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)P2.Pieces.get(1)).TryDownRight());
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

public void ReturnStatusMove(int[] R) {
	if(R[0]<0) {
		System.out.println("ERROR / BOUNDS ERROR");
	}
	else {
		System.out.printf("\nRETURN STATUS: %d\n",R[0]);
		if(R[0]>=1 && R[0]<=8 || R[0]>=9 && R[0]<=16) {
			System.out.printf("\nMove to: [%d,%d] W\\ Piece: %c\n",R[1],R[2],(char)R[3]);
			int[] K = {R[1],R[2],R[3],R[4],R[5]};
			
			KillPiece(K);
		
		}
		else if(R[0]>=17){
			//Ally Detected, do nothing
		}
	}
	PrintAllPieceStatus();
	Me.PrintBoard();
}

public void SwapPlayer() {
	Player Z = Me;
	Me = Opponent;
	Opponent = Z;
	this.PrintPlayers();
}

//Destroy piece in board
private void KillPiece(int[] K) {
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
			char typeGot = Opponent.Board[Got.CurrentPosition[0]][Got.CurrentPosition[1]];	
			Me.Board=Me.CopyNewBoard(K[0],K[1],typeGot);
			Me.Board=Me.CopyNewBoard(K[3],K[4],Me.WhichBlock(K[3],K[4]));
			Got.CurrentPosition = K;
			//Check if this leads to a check on your end...
			//if(MeInCheck){
			//}
			//else if(OpponentInCheck){
			//}
			}
			return;
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
	MeInCheck();
	//Check if this leads to a check on your end...
	//if(MeInCheck){
	//}
	//else if(OpponentInCheck){
	//}
	}
	
}

private boolean MeInCheck() {
	System.out.println("Am I in check?");
	//Iterate through all piece moves
	//See if ANY can attack king!
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %d^^^^^^^^^^^^\n",i);
		//IF Rooke
		if(Opponent.Pieces.get(i) instanceof Rooke<?,?,?>) {
			
		}
		//If Knight
		if(Opponent.Pieces.get(i) instanceof Knight<?,?,?>) {
			ReturnStatus(((Knight<int[],int[],int[]>)Opponent.Pieces.get(i)).TryUpRight());
			ReturnStatus(((Knight<int[],int[],int[]>)Opponent.Pieces.get(i)).TryUpLeft());	
			ReturnStatus(((Knight<int[],int[],int[]>)Opponent.Pieces.get(i)).TryDownRight());
			ReturnStatus(((Knight<int[],int[],int[]>)Opponent.Pieces.get(i)).TryDownLeft());
			ReturnStatus(((Knight<int[],int[],int[]>)Opponent.Pieces.get(i)).TryKnightRightUp());
			ReturnStatus(((Knight<int[],int[],int[]>)Opponent.Pieces.get(i)).TryKnightRightDown());
			ReturnStatus(((Knight<int[],int[],int[]>)Opponent.Pieces.get(i)).TryKnightLeftUp());
			ReturnStatus(((Knight<int[],int[],int[]>)Opponent.Pieces.get(i)).TryKnightLeftDown());
		}
		//If Bishop
		if(Opponent.Pieces.get(i) instanceof Bishop<?,?,?>) {
			
		}
		//If Queen
		//if(Opponent.Pieces.get(i) instanceof Queen<?,?,?>) {
			
		//}
		//If King
		//if(Opponent.Pieces.get(i) instanceof King<?,?,?>) {
			
		//}
		//If Pawn
		//if(Opponent.Pieces.get(i) instanceof Pawn<?,?,?>) {
			
		//}
		
		//THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
	}
	
	
	System.out.println("\n I'm Not In Check Because of this move \n");
return false;	
}

private boolean OpponentInCheck() {
	
	
	
return false;
}

}



