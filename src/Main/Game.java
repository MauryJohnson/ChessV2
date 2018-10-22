package Main;

import java.io.Console;
import java.util.LinkedList;
import java.util.Scanner;

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
	/*
	P1.Board[7][7] = 'O';
	P2.Pieces.get(1).ApplyMove(new int[2]);
	P2.Board[7][7] = 'N';
	P1.Pieces.get(1).ApplyMove(new int[2]);
	P1.Board[7][7] = 'P';
	P2.Pieces.get(1).ApplyMove(new int[2]);
	//////////////////////////
	
	P1.Board[7][7] = 'r';
	*/
	
	//P1.PrintBoard();
	
	//NEW GAME
	Game G = new Game(P1,P2);
	
	//G.TryMoveFromInput("a2 a4");
	
	//Swap Player Test
	/*
	G.PrintPlayers();
	
	G.SwapPlayer();
	
	G.PrintPlayers();
	*/

	//////////

	//G.SwapPlayer();
	
	//More advanced testing...
	//KNIGHT TRY MOVE TESTING ALL
	//PLAYER 2
	//G.ReturnStatusMove(((Knight<int[],int[],int[]>)P2.Pieces.get(1)).TryDownLeft());
	//G.Me.PrintBoard();
	
	
	//White Knight Checks Black

	/*
	G.SwapPlayer();
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryDownRight(0));
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryDownRight(0));
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryKnightRightDown());
	
	*/
	
	/*
	//						CASTLING 	WHITE	CASE  RIGHT
	//Black
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryUp(0));
	
	G.SwapPlayer();
	
	//White
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(9)).TryDown(1));
	
	G.ReturnStatusMove(((Bishop<int[],int[],int[]>)G.Me.Pieces.get(2)).TryDownLeft(1));
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryDownRight(0));
	
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(11)).TryDown(1));
	
	G.ReturnStatusMove(((Queen<int[],int[],int[]>)G.Me.Pieces.get(3)).TryDown(1));
	
	//G.ReturnStatusMove(((Rooke<int[],int[],int[]>)G.Me.Pieces.get(0)).TryRookeRightCastle());
	
	G.WrapUpCases();
	//			END		CASTLING			CASE
	*/
	
	
	/*
	//			CASTLING     WHITE   CASE		LEFT
	
		//Black
	
		G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryUp(0));
		
		G.SwapPlayer();
		
		//White
		G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(12)).TryDown(1));
		
		G.ReturnStatusMove(((Bishop<int[],int[],int[]>)G.Me.Pieces.get(5)).TryDownLeft(1));
		
		G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(6)).TryDownRight(0));
		
		G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(11)).TryDown(1));
		
		G.ReturnStatusMove(((Queen<int[],int[],int[]>)G.Me.Pieces.get(3)).TryDown(1));
		
		//G.ReturnStatusMove(((Rooke<int[],int[],int[]>)G.Me.Pieces.get(0)).TryRookeRightCastle());
		
		G.WrapUpCases();
	//			END				CASTLING			LEFT
	*/
		
		/*
		//						CASTLING 	BLACK	CASE  RIGHT
		//Black
		G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryUp(0));
		
		//G.SwapPlayer();
		
		G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(9)).TryUp(1));
		
		G.ReturnStatusMove(((Bishop<int[],int[],int[]>)G.Me.Pieces.get(2)).TryUpLeft(1));
		
		G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryUpRight(0));
		
		G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(11)).TryUp(1));
		
		G.ReturnStatusMove(((Queen<int[],int[],int[]>)G.Me.Pieces.get(3)).TryUp(1));
		
		//G.ReturnStatusMove(((Rooke<int[],int[],int[]>)G.Me.Pieces.get(0)).TryRookeRightCastle());
		
		//G.WrapUpCases();
		//			END		CASTLING			CASE
		*/
			
	//	CASTLING     BLACK   CASE		LEFT
	
	//Black
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(12)).TryUp(1));

	G.ReturnStatusMove(((Bishop<int[],int[],int[]>)G.Me.Pieces.get(5)).TryUpLeft(1));

	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(6)).TryUpRight(0));

	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(11)).TryUp(1));

	G.ReturnStatusMove(((Queen<int[],int[],int[]>)G.Me.Pieces.get(3)).TryUp(1));

	//G.ReturnStatusMove(((Rooke<int[],int[],int[]>)G.Me.Pieces.get(0)).TryRookeRightCastle());

	//G.WrapUpCases();
	//			END				CASTLING			LEFT
		
	/*
	//			ENPASSANT 					CASE    USE Ctrl+F   Find __PRINT BOARD__
	//Black
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryUp(0));
	
	G.SwapPlayer();
	
	//White
	//G.FinishMoveTwice();
	
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryDown(1));
	
	G.WrapUpCases();
	
	//Black
	
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(11)).TryUp(1));
	
	G.WrapUpCases();
	
	//White
	
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryDown(0));
	
	G.WrapUpCases();
	
	//Black
	
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(9)).TryUp(1));
	
	G.WrapUpCases();
	
	//White
	
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryRight(0));
	*/
	//			END		ENPASSANT				CASE
	
	
	boolean End = false;
	
	boolean P1Draw = false;
	
	boolean P2Draw = false;
	
	//System.out.println("\nSTART_____GAME\n");
	Scanner s = new Scanner(System.in);
	int Status =-1;
	String input;
	
	//Switch First Player to white
	G.SwapPlayer();
	
	boolean FirstTurn = true;
	
	while(!End){
		Status = -1;
		
		P2.PrintBoard(G);
		
		while(Status==-1) {
		
		input = s.nextLine();
		System.out.printf("Input: %s\n", input);
		
		if(input.contains("resign")) {
			System.out.printf("resign\nPlayer 2 wins");
			System.exit(0);
		}
		
		P1Draw = input.contains("draw?");
		if(P1Draw&&P2Draw) {
			System.out.println("draw");
			System.exit(0);
		}
		else {
			//P1Draw = false;
			P2Draw = false;
		}
		
		Status = G.TryMoveFromInput(input);
		}
		
		if(FirstTurn) {
		G.SwapPlayer();
		FirstTurn = false;
		}
		else {
		
		//Set opponent pawn JustMovedTwice booolean to false if it moved their pawn last turn
		G.FinishMoveTwice();
		
		//Perform stalemate check for Opponent's state
		if(G.StaleMate())
		{
			System.out.println("Stalemate");
			System.exit(0);
		}
		
		//Swap players to player 2
		G.SwapPlayer();
		}
		
		Status = -1;
		
		P1.PrintBoard(G);
		
		while(Status==-1) {
			
			input = s.nextLine();
			System.out.printf("Input: %s\n", input);
			
			if(input.contains("resign")) {
				System.out.printf("resign\nPlayer 1 wins");
				System.exit(0);
			}
			
			P2Draw = input.contains("draw?");
			if(P1Draw&&P2Draw) {
				System.out.println("draw");
				System.exit(0);
			}
			else {
				P1Draw = false;
				//P2Draw = false;
			}
			
			
			Status = G.TryMoveFromInput(input);
		}
		
			//Perform stalemate check for Opponent state, after performed movement
				if(G.StaleMate())
				{
					System.out.println("Stalemate");
					System.exit(0);
				}
				
		//Opponent set pawn justmoved twice to false and swap player
		G.WrapUpCases();
		
	}
	
	
}

//Determine if anymove Opponent does for any piece puts Opponent in check
private boolean StaleMate() {
	// TODO Auto-generated method stub
	
	boolean Stalemate = false;
	
	Stalemate = OpponentCheckMate();
	
	return Stalemate;
}

private void WrapUpCases() {
	// TODO Auto-generated method stub
	this.FinishMoveTwice();
	
	this.SwapPlayer();
	
}

//Print the players me and opponent
public void PrintPlayers() {
	System.out.printf("\n###########\nME: %c\n",Me.Player);
	System.out.printf("Opponent: %c\n#############\n\n",Opponent.Player);
}

//Basic Return status of movement
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
	Me.PrintBoard(this);
}

//PRint all the stati of pieces
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

//Get the Object Piece by looking for its coordinate match in board
public Piece GetPiece(int[] IT){
	
	for(int i=0; i<Me.Pieces.size();i+=1) {
		if(IT[0]==Me.Pieces.get(i).CurrentPosition[0] && IT[1]==Me.Pieces.get(i).CurrentPosition[1]) {
			int c1 = Me.Pieces.get(i).CurrentPosition[0];
			int c2 = Me.Pieces.get(i).CurrentPosition[1];
			//System.out.printf("\n***Found Piece %c @ [%d,%d]***\n",Me.Board[c1][c2],c1,c2);
			return Me.Pieces.get(i);
		}
	}
	
	for(int i=0; i<Opponent.Pieces.size();i+=1) {
		if(IT[0]==Opponent.Pieces.get(i).CurrentPosition[0] && IT[1]==Opponent.Pieces.get(i).CurrentPosition[1]) {
			int c1 = Opponent.Pieces.get(i).CurrentPosition[0];
			int c2 = Opponent.Pieces.get(i).CurrentPosition[1];
			//System.out.printf("\n***Found Piece %c @ [%d,%d]***\n",Opponent.Board[c1][c2],c1,c2);
			return Opponent.Pieces.get(i);
		}
	}
	
	//If no player pieces found in that spot
	return null;
}

//Returns status of movement tried, including check/checkmate
public int ReturnStatusMove(int[] R) {
	
	if(R==null) {
		return -1;
	}
	
	//Print Board before moving
	System.out.println("\nBoard");
	Me.PrintBoard(this);
	
	//Initialize return status
	int ret = -1;
	//If Return type is out of bounds
	if(R[0]<0) {
		System.out.println("ERROR / BOUNDS ERROR");
	}
	else {
		
		System.out.printf("\nRETURN STATUS: %d\n",R[0]);
		
		//If return type is valid move
		if(R[0]>=1 && R[0]<=8 || R[0]>=9 && R[0]<=16) {
			System.out.printf("\nMove to: [%d,%d] W\\ Piece: %c\n",R[1],R[2],(char)R[3]);
			int[] K = new int[R.length-1];
			
			for(int i=1; i<R.length;i+=1) {
				K[i-1] = R[i];
			}
			
			ret = KillPiece(K);			
				
			///////////////////////////////////CHECK MATE CHECK
			
			
			if(ret==1&&OpponentCheckMate()) {
				System.out.printf("\nOpponent:%c is in CHECKMATE! %c WINS!\n",Opponent.Player,Me.Player);
				Me.PrintBoard(this);
				System.exit(-1);
			}
			
						
			///////////////////////////////////CHECK MATE CHECK
			
		}
		//Ally Attacked, do nothing
		else if(R[0]>=17){
			//Ally Detected, do nothing
			ret = -1;
		}
	}
	
	//Print status of all pieces after every move
	PrintAllPieceStatus();
	Me.PrintBoard(this);
	
	return ret;
}

//Swap me with opponent Player1->Player2
public void SwapPlayer() {
	Player Z = Me;
	Me = Opponent;
	Opponent = Z;
	this.PrintPlayers();
}

public int ToInt(char c) {
	if(c=='a') {
		return 0;
	}
	if(c=='b') {
		return 1;
	}
	if(c=='c') {
		return 2;
	}
	if(c=='d') {
		return 3;
	}
	if(c=='e') {
		return 4;
	}
	if(c=='f') {
		return 5;
	}
	if(c=='g') {
		return 6;
	}
	if(c=='h') {
		return 7;
	}
	
	return -1;
}


public int[] ParseInput(String s) {
	System.out.printf("String Size: %d",s.length());
	
	/*if(s.length()!=5 && s.length()!=7) {
		//e4 e5\0, the max len is 5
		return null;
	}
	*/
	if(s.length()<5) {
		return null;
	}
	
	int i,j,k,l;
	
	try {
		i = ToInt(s.charAt(0));
	}
	catch (Exception e){
		return null;
	}
			
	System.out.printf("i:%d\n",i);
	if(i<0) {
		return null;
	}
	String s1 = "" + s.charAt(1);
	 
	try {j = 8-Integer.parseInt(s1);
	}
	catch(Exception f){
		return null;
	}
	
	System.out.printf("j:%d\n",j);
	if(j<0||j>7) {
		return null;
	}
	
	try{ k = ToInt(s.charAt(3));
	}
	catch(Exception h) {
		return null;
	}
	
	System.out.printf("k:%d\n",k);
	if(k<0) {
		return null;
	}
	s1 = "" + s.charAt(4);
	 
	try{l = 8-Integer.parseInt(s1);
	}
	catch(Exception o) {
		return null;
	}
	
	 System.out.printf("l:%d\n",l);
	if(l<0||l>7) {
		return null;
	}
	
	int [] All = {j,i,l,k};
	
	System.out.printf("Parsed From:[%d,%d] To:[%d,%d]\n", All[0],All[1],All[2],All[3]);
	
	return All;
}

//Get Movement which matches the movement there
public int GetMatchingMove(Piece MyPiece, int[] To) {
	//Read from all cases in that list
	//Case 1 - Up
	//Case 2 - Right
	//Case 3 - Down
	//Case 4 - Left
	//Case 5 - UpLeft
	//Case 6 - UpRight
	//Case 7 - DownRight
	//Case 8 - DownLeft
	//Case 9 - KnightLeftUp
	//Case 10 - KnightLeftDown
	//Case 11 - KnightRightUp
	//Case 12 - KnightRightDown
	//Case 13 - RookeLeftCastle
	//Case 14 - RookeRightCastle
	//Handle cases for bish
	
	System.out.println("Try to GetMatchingMove1");
	
	LinkedList<int[]> R = new LinkedList<int[]>();
	
	AddAllSets(R,MyPiece,true);
		
	//For all sets of movements, find the one which coordinates [1][2]-TO match
	for(int i=0;i<R.size();i+=1) {
		if(R.get(i)==null) {
			continue;
		}
		
		if(R.get(i).length>=9) {
			if(GetPiece(To) instanceof King<?,?,?>) {
			//Fix pose for castling move 
			return ReturnStatusMove(R.get(i));
			}
			else {
				continue;
			}
		}
		
		//If they match!! ReturnStatusMove of that int ARRAY
		if(To[0]==R.get(i)[1] && To[1]==R.get(i)[2] /*&& MyPiece.CurrentPosition[0]==R.get(i)[4] && MyPiece.CurrentPosition[1]==R.get(i)[5]*/) {
			
			
			System.out.printf("\nGOT IT! GetMatchingMove2 TO [%d,%d] FROM [%d,%d]\n",To[0],To[1],R.get(i)[4],R.get(i)[5]);
			
			
			return ReturnStatusMove(R.get(i));
		}
		
	}
	
	
	//System.out.println("Failed to GetMatchingMove3");
	//System.out.println("Illegal move, try again");
	//IF failed to find matching TO [1][2] FROM START
	
	return -1;
}

//Try Move From Input, return 0 success, -1 fail, 1 Check
public int TryMoveFromInput(String s) {
	//Parse String Input
	int [] TrueIn = ParseInput(s);
	if(TrueIn==null) {
		
		return -1;
	}
	//Get from Position and verify it's piece
	int[] MyPose = {TrueIn[0],TrueIn[1]};
	Piece MyPiece = GetPiece(MyPose);
	
	if(MyPiece==null||MyPiece.Player!=Me.Player) {
		System.out.println("Illegal move, try again");
		return -1;
	}
	
	// For each type piece, cast it to that 
	//Get To position and perform returnstatusmove on it
	
	int[] To = {TrueIn[2],TrueIn[3]};
	
	int Ret = GetMatchingMove(MyPiece, To);
	
	//If Pawn
	if(MyPiece instanceof Pawn<?,?,?> )  {
		if(MyPiece.CurrentPosition[0]==0||MyPiece.CurrentPosition[0]==7) {
			//Promote to the last character involved
			System.out.printf("Promotion!!! @ [%d,%d]\n",MyPiece.CurrentPosition[0],MyPiece.CurrentPosition[1]);
			if(s.length()==7) {
			Piece NewP = NewPiece(s.charAt(s.length()-1));	
			if(NewP!=null) {
				
				ReplacePiece(NewP,MyPiece);
				
			}
			else {
				
				//Invalid argument?!?!
				
			}
			}
			else {
			Queen<int[],int[],int[]> Q = new Queen<int[],int[],int[]>(Me.Player);
			Q.Piece = 'Q';
			ReplacePiece(Q,MyPiece);
			}
		}
	}
	
	if(Ret<0) {
		System.out.println("Illegal move, try again");
	}
	
	return Ret;
}

private Piece NewPiece(char s) {
	// TODO Auto-generated method stub
	if(s=='R') {
		Piece R = new Rooke<int[],int[],int[]>(Me.Player);
		R.Piece = 'R';
		return R;
	}
	else if(s=='N') {
		Piece N = new Knight<int[],int[],int[]>(Me.Player);
		N.Piece = 'N';
		return N;
	}
	else if(s=='B') {
		Piece B = new Bishop<int[],int[],int[]>(Me.Player);	
		B.Piece = 'B';
		return 	B;
	}
	
	/*else if(s=='K') {
		Piece K = new King<int[],int[],int[]>(Me.Player);
		K.Piece = 'K';
		return K;
	}
	*/
	else if(s=='Q') {
		Piece Q = new Queen<int[],int[],int[]>(Me.Player);
		Q.Piece = 'Q';
		return Q;
	}
	/*
	else if(s=='p') {
		
		
	}
	*/
	
	return null;
}

private void ReplacePiece(Piece NewPiece,Piece OldPiece) {
	//Set new pose
	NewPiece.CurrentPosition[0] = OldPiece.CurrentPosition[0];
	NewPiece.CurrentPosition[1] = OldPiece.CurrentPosition[1];
	
	//Completely remove data of old piece from ll
	Me.Pieces.remove(OldPiece);
	
	//New Board
	Me.Board = Me.CopyNewBoard(NewPiece.CurrentPosition[0], NewPiece.CurrentPosition[1], NewPiece.Piece);
	//Set player
	NewPiece.SetPlayer(Me.Player);
	
	Me.Pieces.add(NewPiece);
}

//Destroy piece in board
private int KillPiece(int[] K) {
	// TODO Auto-generated method stub
	System.err.printf("Try Kill Piece in Position: [%d,%d] FROM: [%d,%d] KillPiece1\n " ,K[0],K[1],K[3],K[4]);
	//Iterate through all opponent's pieces
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		System.out.printf("IF [%d,%d] == [%d,%d]\n",K[0],K[1],Opponent.Pieces.get(i).CurrentPosition[0],Opponent.Pieces.get(i).CurrentPosition[1]);
		//If coordinate to kill piece matches a piece in opponent list
		if(K[0]==Opponent.Pieces.get(i).CurrentPosition[0] && K[1]==Opponent.Pieces.get(i).CurrentPosition[1]) {
			
			//Kill Opponent Piece Found
			System.err.printf("Kill Opponent Piece:%c @[%d,%d] KillPiece2",
					Opponent.Pieces.get(i).Piece,
					Opponent.Pieces.get(i).CurrentPosition[0],
					Opponent.Pieces.get(i).CurrentPosition[1]);
				
			//MyPosition starts
			int [] MyPosition = {K[3],K[4]};
			Piece MyPiece = GetPiece(MyPosition);
			//My type
			char MyType = MyPiece.Piece;	
			//Attack this position
			int []Attack = {K[0],K[1]};
			//Attacked Piece object
			Piece AttackedPiece = Opponent.Pieces.get(i);
			
			if(MyPiece!=null) {
			//(Player Opponent, char OpponentType,int[] MyPosition,Piece MyPiece, Piece AttackedPiece, int[] Attack) {
			
			if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
			//If pawn and K indicates enapassant move
			EnPassant(MyPiece,K,true);	
			
			System.out.println("Enpass Test:");
			Me.PrintBoard(this);
			
			}
			else {
			//Attack opponent piece	
			Attack(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
			}
			
			System.out.println("Board to look at KillPiece1");
			Me.PrintBoard(this);
			
			//Check if this leads to a check on your end...
			if(MeInCheck()){
				System.err.println("Invalid Move, puts yourself in check, restoring original spot KillPiece2");
				
				///////////////////////////////////////////////////////ENPASSANT
				if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
				//Restore state before an attempted EnPassant move
				RestoreEnPassant(MyPiece,AttackedPiece,K);
				}
				///////////////////////////////////////////////////////
				
				else {
				//Restore Opponent piece and My Piece
				Restore(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
				}
				
				//Return status -1 indicating invalid movement
				return -1;
			}
			
			else if(OpponentInCheck()){
				System.err.println("Opponent is in check KillPiece3");
				//Return status 1 indicating opponent is in check
				
				///////////////////////////////////////////////////////ENPASSANT
				if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
					//Restore previous move before enpassant, even if it worked... safety
					RestoreEnPassant(MyPiece,AttackedPiece,K);
				}
				///////////////////////////////////////////////////////
				
				//If king or Rooke Moved, can no longer castle
				CastleCheck(MyPiece);				
				
				//IF pawn moved in first turn, this invalidates its option to move twice
				PawnFirstMoveCheck(MyPiece);
				
				/////////////////////////////////////////////////////////EnPassent?
				EnPassant(MyPiece,K,false);
				
				return 1;
			}
				///////////////////////////////////////////////////////ENPASSANT
				if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
					//Restore previous move before enpassant, even if it worked... safety
					RestoreEnPassant(MyPiece,AttackedPiece,K);
				}
				///////////////////////////////////////////////////////
				
				//IF pawn moved in first turn, this invalidates its option to move twice
				PawnFirstMoveCheck(MyPiece);
				
				//If king or Rooke Moved, can no longer castle
				CastleCheck(MyPiece);
				
				////////////////////////////////////////////////////////EnPassent?
				EnPassant(MyPiece,K,false);
				
				return 0;
				
			}//End case MyPiece Found
			//My Piece not found
			else {
				System.out.println("ERROR, MY PIECE NOT FOUND");
				System.exit(-1);
			}
		
		}//End case kill
	}//End For
	
	//FOR PAWN...
	//IF attackleft/attackright is free space, no enpassant possible!
	System.err.println("\n Found Free Space #/' ' KillPiece4");
	
	//Set My Position
	int [] MyPosition = {K[3],K[4]};
	Piece MyPiece = GetPiece(MyPosition);
	
	if(MyPiece==null) {
		System.out.printf("\nPiece Should never be null @ [%d,%d]  KillPiece 5\n",K[3],K[4]);
		Me.PrintBoard(this);
		System.exit(-1);	
	}
	
	//My Type
	char MyType = MyPiece.Piece;
	//Attack this position
	int []Attack = {K[0],K[1]};
	
	Piece AttackedPiece = null;
	
	if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		int [] GetAtt = {K[5],K[6]};
		AttackedPiece=GetPiece(GetAtt);
	}
	else if(MyPiece instanceof Rooke<?,?,?> && K.length>=9) {
	
		int[] KingPose = {K[7],K[8]};
		Piece MyKing = GetPiece(KingPose);
		int[] KingTo = {K[5],K[6]};
		
		//Castling Case
		Castle(MyPiece,MyKing,KingTo,Attack);
	}
	else {
	//No Piece to attack, no piece found to attack in that position
	AttackedPiece=null;
	}
	
	//My Piece exists
	if(MyPiece!=null) {
	
	if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		//If pawn and K indicates enapassant move
		EnPassant(MyPiece,K,true);	
			
		System.out.println("Enpass Test:");
		Me.PrintBoard(this);
			
		//System.exit(-1);
			
	}	
	else if(MyPiece instanceof Rooke<?,?,?> && K.length>=9) {
		
	}
	else {
	//Traverse to the empty position
	
	Attack(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
	
	}
	
	
	System.err.println("Board to look at KillPiece5");
	Me.PrintBoard(this);
	
	//Check if this leads to a check on your end...
	if(MeInCheck()){
		System.err.println("Invalid Move, puts yourself in check KillPiece6");
		
		///////////////////////////////////////////////////////ENPASSANT
		if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		//Restore state before an attempted EnPassant move
		RestoreEnPassant(MyPiece,AttackedPiece,K);
		}
		///////////////////////////////////////////////////////
		
		else if(MyPiece instanceof Rooke<?,?,?> && K.length>=9) {
			
			
		}
		
		else {
		//Restore old positions board and MyPiece
		
		Restore(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
		
		}
		
		return -1;
	}
	
	//If opponent is in check because of my move
	else if(OpponentInCheck()){
		System.err.println("Opponent is in check KillPiece7");
		//Return status 1 indicating opponent is in check
		
		///////////////////////////////////////////////////////ENPASSANT
		if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		//Restore state before an attempted EnPassant move
		RestoreEnPassant(MyPiece,AttackedPiece,K);
		}
		///////////////////////////////////////////////////////
		
		//IF pawn moved in first turn, this invalidates its option to move twice
		PawnFirstMoveCheck(MyPiece);
		
		//If king or Rooke Moved, can no longer castle
		CastleCheck(MyPiece);
		
		//EnPassent?
		EnPassant(MyPiece,K,false);
		
		return 1;
	}
	
	///////////////////////////////////////////////////////ENPASSANT
	if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		//Restore state before an attempted EnPassant move
		RestoreEnPassant(MyPiece,AttackedPiece,K);
	}
	///////////////////////////////////////////////////////
	
	//IF pawn moved in first turn, this invalidates its option to move twice
	PawnFirstMoveCheck(MyPiece);
	
	//If king or Rooke Moved, can no longer castle
	CastleCheck(MyPiece);
	
	//EnPassant?
	EnPassant(MyPiece,K,false);
	
	return 0;
	
	}
	//My Piece not found
	else {
		System.out.println("ERROR, MY PIECE NOT FOUND");
		System.exit(-1);
	}
	
	return 0;
	
}

//Perform Castling move **ONly can be performed when not in check
private void Castle(Piece MyPiece, Piece MyKing, int[] KingTo, int[] Attack) {
	if(!(MyKing instanceof King<?,?,?>) || !(MyPiece instanceof Rooke<?,?,?>)) {
		System.out.println("Piece is neither king nor a rooke Castle1");
		return;
	}
	
	//Move Rooke
	Me.Board = 	Me.CopyNewBoard(MyPiece.CurrentPosition[0], MyPiece.CurrentPosition[1],Me.WhichBlock(MyPiece.CurrentPosition[0], MyPiece.CurrentPosition[1]));
	MyPiece.CurrentPosition[0] = Attack[0];
	MyPiece.CurrentPosition[1] = Attack[1];
	Me.Board = 	Me.CopyNewBoard(Attack[0], Attack[1],MyPiece.Piece);
	
	//Move King
	Me.Board = 	Me.CopyNewBoard(MyKing.CurrentPosition[0], MyKing.CurrentPosition[1],Me.WhichBlock(MyKing.CurrentPosition[0], MyKing.CurrentPosition[1]));
	MyKing.CurrentPosition[0] = KingTo[0];
	MyKing.CurrentPosition[1] = KingTo[1];
	Me.Board = 	Me.CopyNewBoard(KingTo[0], KingTo[1],MyKing.Piece);

	System.out.println("FINISHING Castle2...");
	
	Me.PrintBoard(this);
	
	//System.exit(-1);
	
}

//For Kill/Attack Enemy functions
//Check if it's pawn and also if EnPassent is active, then continue with EnPassent move
private void EnPassant(Piece MyPiece,int[] Attack, boolean Try) {
	
	//Kill Piece @ [5,6]
	
	System.out.println("Try Enpassant1");
	
	if(Attack.length>=7) {
	
	if(MyPiece instanceof Pawn<?,?,?> || MyPiece.Piece=='p') {
		
		if(((Pawn<int[],int[],int[]>)MyPiece).EnPassantMove) {
			
			System.out.printf("ENPASSANT FROM: [%d,%d] TO: [%d,%d], KILL PIECE @ [%d,%d] EnPassant1",Attack[3],Attack[4],Attack[0],Attack[1],Attack[5],Attack[6]);
			
			int[] AnyP = {Attack[1],Attack[1]};
			Piece AnyPiece = GetPiece(AnyP);
			if(AnyPiece!=null) {
				if(MyPiece.AllyPiece(AnyP)) {
					//Ally piece to my piece!! NO!!
					System.out.println("This position taken is ally piece EnPassant2!!!");
					return;
				}
			}
			
			int[] MyPosition = {Attack[3],Attack[4]};
			char MyType = MyPiece.Piece;
			int[] Attck = {Attack[5],Attack[6]};
			Piece AttackedPiece = GetPiece(Attck);
			
			Attack(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attck);
			Attck[0] = Attack[0];
			Attck[1] = Attack[1];
			Attack(Me,MyType,MyPiece.CurrentPosition,MyPiece,null,Attck);
			
			if(!Try) {
			//After move validated, enpassant is false now
			((Pawn<int[],int[],int[]>)MyPiece).EnPassantMove = false;
			}
		}
		
	}
	
	}
	
}

//Restore state before enpassant movement, good for checking if this puts you in check
private void RestoreEnPassant(Piece MyPiece,Piece AttackedPiece,int[] Attack) {
	
	if(Attack.length>=7) {	
		if(MyPiece instanceof Pawn<?,?,?> || MyPiece.Piece=='p') {
			if(((Pawn<int[],int[],int[]>)MyPiece).EnPassantMove) {
				System.out.printf("RESTORE BEFORE ENPASSANT TO: [%d,%d] FROM: [%d,%d], RESTORE KILLED PIECE @ [%d,%d] -->SEE ctrl+ KillPiece Previous\n",Attack[3],Attack[4],Attack[0],Attack[1],Attack[5],Attack[6]);
				
				int[] MyPosition = {Attack[3],Attack[4]};
				char MyType = MyPiece.Piece;
				int[] Attck = {Attack[5],Attack[6]};
				
				MyPiece.CurrentPosition[0] = MyPosition[0];
				MyPiece.CurrentPosition[1] = MyPosition[1];
				
				Me.Board=Me.CopyNewBoard(MyPosition[0], MyPosition[1], MyType);
				Me.Board=Me.CopyNewBoard(Attack[0], Attack[1],Me.WhichBlock(Attack[0],Attack[1]));
				
				AttackedPiece.CurrentPosition=new int[2];
				AttackedPiece.CurrentPosition[0]=Attack[5];
				AttackedPiece.CurrentPosition[1]=Attack[6];
		
				Me.Board=Me.CopyNewBoard(Attack[5], Attack[6], AttackedPiece.Piece);
				
				/*Attck[0] = Attack[0];
				Attck[1] = Attack[1];
				Attack(Me,MyType,MyPiece.CurrentPosition,MyPiece,null,Attck);
				*/
	
				Me.PrintBoard(this);
				
			}
		}
	}
}

//If Pawn already moved, pawn cannot move two units any more
private void PawnFirstMoveCheck(Piece MyPiece) {
	// TODO Auto-generated method stub
	if(MyPiece instanceof Pawn<?,?,?>) {
		((Pawn<int[],int[],int[]>) MyPiece).CanMoveUpTwice=false;
	}
	
	
}

//Checks if king or rooke moved
//If king moves, none of the pieces can castle with king
//Otherwise, the rooke that moved will no longer be able to castle with king
private void CastleCheck(Piece MyPiece) {
	// TODO Auto-generated method stub
	boolean NotMoved = true;
	if(MyPiece instanceof King<?,?,?>) {	
		//King Moved 
		NotMoved = ((King<int[],int[],int[]>)(MyPiece)).CanCastle = false;
		//Set all rookes CanCastle to false
		NoneCanCastle();
	}
	
	if(MyPiece instanceof Rooke<?,?,?>){
		//Rooke Moved
		((Rooke<int[],int[],int[]>)(MyPiece)).CanCastle = false;
	}
	
}

//Set all of my rooke's CanCastle to false, because king moved
private void NoneCanCastle() {
	// TODO Auto-generated method stub
	
	for(int i=0;i<Me.Pieces.size();i+=1) {
		if(Me.Pieces.get(i) instanceof Rooke<?,?,?>) {
			((Rooke<int[],int[],int[]>)(Me.Pieces.get(i))).CanCastle = false;
		}
	}
	
}

//Check if Player Me is in check
public boolean MeInCheck() {
	System.err.println("Am I in check? MeInCheck1");
	//Iterate through all piece moves
	//See if ANY can attack king!
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %c^^^^^^^^^^^^\n",Opponent.Pieces.get(i).Piece);
		
		//Add all sets of possible moves to List
		AddAllSets(R,Opponent.Pieces.get(i),false);
		
		//Check if king is attacked
		if(KingAttacked(R)) {
			//My King is attacked
			System.err.printf("\n %c IS In Check MeInCheck2 \n PROOF:\n\n",Me.Player);
			Me.PrintBoard(this);
			//Opponent.PrintBoard(this);
			return true;
		}
		//THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
	}
	
	System.err.printf("\n %c(Me) Not In Check Because of My move MeInCheck3 -- ctrl-f -> find next Restore\n PROOF:\n\n",Me.Player);
	Me.PrintBoard(this);
	//Opponent.PrintBoard(this);
	//Player Me is not in check
	return false;	
}


//Check if opponent king is attacked given list of all positions that are attacked
public boolean KingAttacked(LinkedList<int[]> R) {
	
	System.out.println("");
	
	if(R==null) {
		return false;
	}
	
	// TODO Auto-generated method stub
	for(int i=0;i<R.size();i+=1) {
		if(R.get(i)==null) {
			continue;
		}
		/*
		if(R.get(i).length>=9) {
			continue;
		}
		*/
		//If Return status is valid IE a free area OR attacked area
		if(R.get(i)[0]>=1 && R.get(i)[0]<=16) {
		
		//Attacked position	
		int[] Attack = {R.get(i)[1],R.get(i)[2]};
		
		//Piece attacked
		Piece Attacked = GetPiece(Attack);
		
		//My Position
		int [] MyPosition = new int[2];
		MyPosition[0]=R.get(i)[4];
		MyPosition[1]=R.get(i)[5];
		
		//System.out.printf("Curr POSE AGAINN [%d,%d]", MyPosition[0],MyPosition[1]);
		
		//My Piece
		Piece ME = GetPiece(MyPosition);
		
		//Given a poor entry.. Nothing to worry about!!
		if(ME==null) {
			System.out.printf("Error, my piece cannot be located @ [%d,%d]\n",MyPosition[0],MyPosition[1]);
			continue;
		}
		
		//IF Piece got is a king piece
		if(Attacked instanceof King<?,?,?>) {
			//If king got is not the opponent's king
			if(Attacked.Player!=Opponent.Player) {
				//Opponent is attacking my king!
				System.out.printf("\n%c%c is attacking %c king TO [%d,%d] KingAttacked1 \n",ME.Player,ME.Piece,Attacked.Player,Attacked.CurrentPosition[0],Attacked.CurrentPosition[1]);
				return true;
				}
			}
		
		}
		//Not valid move from movesets
		else {
			//System.out.printf("King Attacked check Invalid move: [%d,%d] , STATUS:%d KingAttacked2 \n",R.get(i)[1],R.get(i)[2],R.get(i)[0]);
		}
		
	}
	
	//Opponent's king is not attacked
	System.out.println("Opponent King Not Attacked KingAttacked3");
	return false;
}

//Check if movement doesn't change check
private boolean MoveStillCheck(LinkedList<int[]> R) {
	
	if(R==null) {
		return true;
	}
	//Iterate through all movesets
	for(int i=0;i<R.size();i+=1) {
		
		//If moveset is null, continue
		if(R.get(i)==null) {
			continue;
		}
		//Don't want to include castling case, because ALREADY IN CHECK!
		if(R.get(i).length>=9) {
			System.out.println("Already Checked");
			continue;
		}
		
		//If move is valid
		if(R.get(i)[0]>=1&&R.get(i)[0]<=16) {
			/*
			System.out.println("Board to look at");
			Opponent.PrintBoard();	
			*/
		//My Position
		int[] MyPosition = {R.get(i)[4],R.get(i)[5]};
		
		//Attacked Position
		int[] Attack = new int[R.get(i).length];
		for(int k=1;k<(R.get(i)).length;k+=1) {
			Attack[k-1]=R.get(i)[k];
		}
		
		//My Piece
		Piece MyPiece = GetPiece(MyPosition);
		
		if(MyPiece==null) {
			return true;
			/*System.out.println("ERROR! My Piece is MISSING");
			System.exit(-1);
			*/
		}
		//Attacked Piece
		Piece AttackedPiece = GetPiece(Attack);
		//My Type
		char MyType = MyPiece.Piece;
		
		//There exists a piece to attack
		if(AttackedPiece!=null) {
		
		
		/*
		//Set Board Attacked Position to MyType of Piece
		Opponent.Board=Opponent.CopyNewBoard(Attack[0],Attack[1],MyType);
		
		//Set Old Position to A Chess Space
		Opponent.Board=Opponent.CopyNewBoard(MyPosition[0],MyPosition[1],Opponent.WhichBlock(MyPosition[0],MyPosition[1]));

		//Set the memory of current position in Piece class to Attacked position
		MyPiece.CurrentPosition = Attack;
		
		//Set AttackedPiece Position to -1,-1, GONE
		int [] n = {-1,-1};
		AttackedPiece.CurrentPosition =n;
		*/
			
		Attack(Opponent, MyType, MyPosition, MyPiece, AttackedPiece, Attack);
		
		//Print Board after changes made
		System.err.println("Board to look at MoveStillCheck1");
		Opponent.PrintBoard(this);
		
		//If, after changes made, opponent is not in check
		if(!OpponentInCheck()) {
			//Found solution to get out of check
			
			//Restore original positions for MyPiece and AttackedPiece
			Restore(Opponent, MyType, MyPosition, MyPiece, AttackedPiece, Attack);
			
			System.err.println("Board Restored And Can Get Out OF Check MoveStillCheck1");
			Opponent.PrintBoard(this);
			
			//Found solution, king not still in check
			return false;
		}
		else {
			//Still in check, keep looking at each moveset for each piece
			
			//Restore previous board
			Restore(Opponent, MyType, MyPosition, MyPiece,AttackedPiece, Attack);
			System.err.println("Board Restored MoveStillCheck2");
			Opponent.PrintBoard(this);
			
		}

		}
		
		//Movement to free space
		else {
			
			/////////////////////////////////////////////////////////ENPASASNT
			if(MyPiece instanceof Pawn<?,?,?> && Attack.length>=7) {
				//If pawn and K indicates enapassant move
				EnPassant(MyPiece,Attack,true);	
				
				System.out.println("Enpass Test: MoveStillCheck 1.5");
				Me.PrintBoard(this);
				
			}
			/////////////////////////////////////////////////////////ENPASSANT
			
			else {
			//Traverse to free space
			Attack(Opponent, MyType, MyPosition, MyPiece, AttackedPiece, Attack);
			}
			
			//Print the new board
			System.err.println("Board to look at MoveStillCheck2");
			Opponent.PrintBoard(this);
			
			//Movement to free space succeeds
			if(!OpponentInCheck()) {
				//Restore(Opponent,MyType,MyPosition,A)
				//Restore previous board
				
				/////////////////////////////////////////////////////////RESTORE ENPASSANT
				if(MyPiece instanceof Pawn<?,?,?> && Attack.length>=7) {
				RestoreEnPassant(MyPiece,AttackedPiece,Attack);	
				}
				/////////////////////////////////////////////////////////RESTORE ENPASSANT
				
				else {
				Restore(Opponent, MyType, MyPosition, MyPiece,AttackedPiece, Attack);
				}
				
				
				System.err.println("Board Restored And Can Get Out Of Check MoveStillCheck3");
				Opponent.PrintBoard(this);
				//Found case where can get out of check
				return false;
			}
			//Movement to free space fails. Have not found case where out of check 
			else {
				
				/////////////////////////////////////////////////////////RESTORE ENPASSANT
				if(MyPiece instanceof Pawn<?,?,?> && Attack.length>=7) {
				RestoreEnPassant(MyPiece,AttackedPiece,Attack);	
				}
				/////////////////////////////////////////////////////////
				
				else {
				//Restore previous board
				Restore(Opponent, MyType, MyPosition, MyPiece, AttackedPiece, Attack);
				}
				
				System.err.println("Board Restored MoveStillCheck4");
				Opponent.PrintBoard(this);
			}
		
		}
		
		
		}
		//An invalid movement caught
		else {
			
			System.out.printf("Invalid return type for movement:%d \n",i);	
		}
	
	}
	
	//Have not found a case yet where move
	//Gets opponent not in check
	return true;
}

//After turn of next player done, loop through and remove piece status that just moved twice
private void FinishMoveTwice() {
	
	/*
	for(int i=0;i<Me.Pieces.size();i+=1) {
	
		if(Me.Pieces.get(i) instanceof Pawn<?,?,?>) {
			
			if(((Pawn<int[],int[],int[]>)Me.Pieces.get(i)).JustMovedTwice) {
				System.out.printf("Pawn for %c Just moved twice, revert to norm",Me.Player);
				((Pawn<int[],int[],int[]>)Me.Pieces.get(i)).JustMovedTwice = false;
			}
			
		}
		
	}
	*/
	
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		
		if(Opponent.Pieces.get(i) instanceof Pawn<?,?,?>) {
			if(((Pawn<int[],int[],int[]>)Opponent.Pieces.get(i)).JustMovedTwice) {
				System.out.printf("Pawn for %c Just moved twice @ [%d,%d], revert to norm\n",Opponent.Player,Opponent.Pieces.get(i).CurrentPosition[0],Opponent.Pieces.get(i).CurrentPosition[1]);
			((Pawn<int[],int[],int[]>)Opponent.Pieces.get(i)).JustMovedTwice = false;
			}
		}
		
	}
	
	//Set CanMoveTwice back to true for all pawns in appropriate positions
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		
		if(Opponent.Pieces.get(i) instanceof Pawn<?,?,?>) {
			
			if(Opponent.Player=='W'&&Opponent.Pieces.get(i).CurrentPosition[0]==6||Opponent.Player=='B'&&Opponent.Pieces.get(i).CurrentPosition[0]==1) {
				System.out.printf("Set Pawn for %c, CanMoveTwice @ [%d,%d], revert to norm\n",Opponent.Player,Opponent.Pieces.get(i).CurrentPosition[0],Opponent.Pieces.get(i).CurrentPosition[1]);
				if(Opponent.Player=='W'&&Opponent.Pieces.get(i).CurrentPosition[0]==6)
				((Pawn<int[],int[],int[]>)Opponent.Pieces.get(i)).CanMoveUpTwice = true;
				else if(Opponent.Player=='B'&&Opponent.Pieces.get(i).CurrentPosition[0]==1)
				((Pawn<int[],int[],int[]>)Opponent.Pieces.get(i)).CanMoveUpTwice = true;
				}
			
		}
		
	}
	
}

//Attack Position
private void Attack(Player Opponent, char OpponentType,int[] MyPosition,Piece MyPiece, Piece AttackedPiece, int[] Attack) {
	
	Opponent.Board=Opponent.CopyNewBoard(Attack[0],Attack[1],OpponentType);
	
	Opponent.Board=Opponent.CopyNewBoard(MyPosition[0],MyPosition[1],Opponent.WhichBlock(MyPosition[0],MyPosition[1]));
	
	int [] NewP = {Attack[0],Attack[1]};
	
	int []Dead = {-1,-1};
	
	if(AttackedPiece!=null)
	AttackedPiece.CurrentPosition = Dead;
	
	MyPiece.CurrentPosition = NewP;
	
}

//Restore previous state of board
private void Restore(Player Opponent, char OpponentType,int[] MyPosition,Piece MyPiece, Piece AttackedPiece, int[] Attack) {
	
	Opponent.Board=Opponent.CopyNewBoard(MyPosition[0], MyPosition[1], OpponentType);
	
	if(AttackedPiece!=null)
		Opponent.Board=Opponent.CopyNewBoard(Attack[0], Attack[1], AttackedPiece.Piece);
	else
		Opponent.Board=Opponent.CopyNewBoard(Attack[0], Attack[1], Opponent.WhichBlock(Attack[0],Attack[1]));	
	MyPiece.CurrentPosition = MyPosition;
	
	if(AttackedPiece!=null)
		AttackedPiece.CurrentPosition = Attack;
	
}

//Checkmate can only occur if I make the move
//If not exists case when there is not a check mate for all piece moves,

//CHECKMATE!
private boolean OpponentCheckMate() {
	System.out.println("Is Opponent in checkmate? OpponentCheckMate1");
	
	//Iterate through all opponents moves, generate the new table, and check if
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %c^^^^^^^^^^^^\n",Opponent.Pieces.get(i).Piece);
		
		//Add the movements of all moves for piece
		AddAllSets(R,Opponent.Pieces.get(i),false);
		
		//If movements gets out of check, found case, return false.
		if(!MoveStillCheck(R)) {
			return false;
		}
		//THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
	}
	
	System.out.println("\nOpponent IS In CheckMate Because cannot find move to invalidate the check Opponent CheckMate3");
	//Checkmate if for all Pieces and moves for each of them, cannot find a case where one movement 
	//doesn't make king in check
	return true;	
}

//Add all possible movements for each piece
private void AddAllSets(LinkedList<int[]> R,Piece P,boolean InnerStack) {
			System.out.println("Add All Possible Movesets1");
	
			//IF Rooke
			if(P instanceof Rooke<?,?,?>) {
				
				//Only run this if you are in inner stack, MeInCheck calls AddAllSets but so does function ApplyMove
				//If both ran, infinite loop occurs
				//In Piece abstract class
				if(InnerStack) {
				R.add(((Rooke<int[],int[],int[]>)P).TryRookeLeftCastle());
				
				R.add(((Rooke<int[],int[],int[]>)P).TryRookeRightCastle());
				}
				
				for(int i=0;i<=7;i+=1)
				R.add(((Rooke<int[],int[],int[]>)P).TryUp(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Rooke<int[],int[],int[]>)P).TryDown(i));	
				
				for(int i=0;i<=7;i+=1)
				R.add(((Rooke<int[],int[],int[]>)P).TryLeft(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Rooke<int[],int[],int[]>)P).TryRight(i));
				
				System.out.println("\nROOKE");
			}
			//If Knight
			else if(P instanceof Knight<?,?,?>) {
				
				R.add(((Knight<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((Knight<int[],int[],int[]>)P).TryUpLeft(0));	
				R.add(((Knight<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((Knight<int[],int[],int[]>)P).TryDownLeft(0));
				R.add(((Knight<int[],int[],int[]>)P).TryKnightRightUp());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightRightDown());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightLeftUp());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightLeftDown());
				
				System.out.println("\nKNIGHT");
			}
			//If Bishop
			else if(P instanceof Bishop<?,?,?>) {
				
				for(int i=0;i<=7;i+=1)
				R.add(((Bishop<int[],int[],int[]>)P).TryUpRight(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Bishop<int[],int[],int[]>)P).TryUpLeft(i));	
				
				for(int i=0;i<=7;i+=1)
				R.add(((Bishop<int[],int[],int[]>)P).TryDownRight(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Bishop<int[],int[],int[]>)P).TryDownLeft(i));
		
				System.out.println("\nBISHOP");
			}
			//If Queen
			else if(P instanceof Queen<?,?,?>) {
				
				for(int i=0;i<=7;i+=1)
				R.add(((Queen<int[],int[],int[]>)P).TryUp(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Queen<int[],int[],int[]>)P).TryRight(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Queen<int[],int[],int[]>)P).TryDown(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Queen<int[],int[],int[]>)P).TryLeft(i));
				
				
				for(int i=0;i<=7;i+=1) {
				
				R.add(((Queen<int[],int[],int[]>)P).TryUpRight(i));
				
				R.add(((Queen<int[],int[],int[]>)P).TryUpLeft(i));
				
				R.add(((Queen<int[],int[],int[]>)P).TryDownRight(i));
				
				R.add(((Queen<int[],int[],int[]>)P).TryDownLeft(i));
				}
				
		
				System.out.println("\nQUEEN");
			}
			//If King
			else if(P instanceof King<?,?,?>) {
				
				R.add(((King<int[],int[],int[]>)P).TryUp(0));
				R.add(((King<int[],int[],int[]>)P).TryRight(0));	
				R.add(((King<int[],int[],int[]>)P).TryDown(0));
				R.add(((King<int[],int[],int[]>)P).TryLeft(0));

				R.add(((King<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((King<int[],int[],int[]>)P).TryUpLeft(0));	
				R.add(((King<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((King<int[],int[],int[]>)P).TryDownLeft(0));
		
				System.out.println("\nKING");
			}
			//If Pawn
			else if(P instanceof Pawn<?,?,?>) {
				
				R.add(((Pawn<int[],int[],int[]>)P).TryUp(0));
				R.add(((Pawn<int[],int[],int[]>)P).TryUp(1));
				
				R.add(((Pawn<int[],int[],int[]>)P).TryDown(0));
				R.add(((Pawn<int[],int[],int[]>)P).TryDown(1));
				
				R.add(((Pawn<int[],int[],int[]>)P).TryLeft(0));
				R.add(((Pawn<int[],int[],int[]>)P).TryRight(0));
				
				R.add(((Pawn<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((Pawn<int[],int[],int[]>)P).TryUpLeft(0));	
				
				R.add(((Pawn<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((Pawn<int[],int[],int[]>)P).TryDownLeft(0));	
			
				System.out.println("\nPAWN");
			}
			
			//System.out.printf("\nCurr Pose again: [%d,%d]\n",P.CurrentPosition[0], P.CurrentPosition[1]);
			System.out.println("Ends Adding All Possible Movesets2");
}

//Check if opponent is in check
public boolean OpponentInCheck() {

	System.err.println("Is Opponent in check? OpponentInCheck1");

	SwapPlayer();
	boolean OppInCheck = MeInCheck();
	
	if(OppInCheck) {
		System.err.println("Opponent in check OpponentInCheck2");
	}
	else {
		System.err.println("Opponent Not in check OpponentInCheck3");
	}
	
	SwapPlayer();
	return OppInCheck;
}

}