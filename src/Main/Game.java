/** @author Maury Johnson*/

package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import Pieces.*;

/**When Game class created, game is started
 * GAME CONTROLS PLAYERS,PIECES,BOARD,..
 * @author Maury Johnson
 *
 */
/**
 * Game is class used to play the game chess
 * @author Maury Johnson
 *
 */
public class Game {
	/**
	 * Me is object Player used in game and it stores info about current player
	 * @author Maury Johnson
	 */
	public static Player Me;
	/**
	 * Opponent is object Player used in game and it stored info about the current opponent
	 * @author Maury Johnson
	 */
	public static Player Opponent;
	/**
	 * Game constructor takes Player objects and then stores it to its
	 * fields Me and Opponent
	 * @param P1
	 * Object Player 1
	 * @param P2
	 * Object Player 2
	 * @author Maury Johnson
	 */
	public Game(Player P1, Player P2) {
		Me = P1;
		Opponent = P2;
	}
	
/**
 * Main is where game is started
 * @param args
 * Arguments given to main
 * give argument path to test file, create list of each line, send it to parser
 * @author Maury Johnson
 */	
public static void main(String[] args) {
	
	LinkedList<String> MyArgs = null;
	if(args.length==1) {
		//Open file from path
		MyArgs  = new LinkedList<String>();
		try {
			/*
			Path currentRelativePath = Paths.get("");
			String s = currentRelativePath.toAbsolutePath().toString();
			System.out.println("Current relative path is: " + s);
			*/
			System.out.printf("Path %s",args[0]);
			BufferedReader reader = new BufferedReader(new FileReader("."+args[0]));
			String line = null;
			
			do {
		    line = reader.readLine();
			if(line!=null) 
			MyArgs.add(line);	
			}while(line!=null);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	/**
	 * This creates a board [8][8]
	 * @author Maury Johnson
	 */
	new Board();
	
	/**
	 *  Player
	 * CREATE PLAYER 1
	 * @author Maury Johnson
    */
	Player P1 = new Player('B');
	/**
	 * @method INIT
	 * Initializes player's pieces for board
	 * @author Maury Johnson
	 */
	P1.INIT();
	System.out.println();
	/** Player
	 * CREATE PLAYER 2
	 * @author Maury Johnson
	 */
	Player P2 = new Player('W');
	/**
	 * @method INIT
	 * Initialized player's pieces for board
	 * @author Maury Johnson
	 */
	P2.INIT();

	/**
	 * Board Update Test BOTH PLAYERS
	P1.Board[7][7] = 'O';
	P2.Pieces.get(1).ApplyMove(new int[2]);
	P2.Board[7][7] = 'N';
	P1.Pieces.get(1).ApplyMove(new int[2]);
	P1.Board[7][7] = 'P';
	P2.Pieces.get(1).ApplyMove(new int[2]);
	//////////////////////////
	
	P1.Board[7][7] = 'r';
	P1.PrintBoard();
	@author Maury Johnson
	*/
	
	/**
	 *  Game
	 * Start New Game
	 * @author Maury Johnson
	 */
	Game G = new Game(P1,P2);
	
	/**
	 * @author Maury Johnson
	 * 
	 * Swap Player Test
	@method PrintPlayers
	Print who "Me" and "Opponent" is
	G.PrintPlayers();
	@method SwapPlayer
	Swap the Player Me and Opponent fields of game
	G.SwapPlayer();
	@method PrintPlayer
	Print who "Me" and "Opponent" is
	G.PrintPlayers();
	*/

	//////////
	/**More advanced testing...
	//KNIGHT TRY MOVE TESTING ALL
	//PLAYER 2
	//G.ReturnStatusMove(((Knight<int[],int[],int[]>)P2.Pieces.get(1)).TryDownLeft());
	//G.Me.PrintBoard();
	@author Maury Johnson
	*/
	
	/**White Knight Checks Black
	
	G.SwapPlayer();
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryDownRight(0));
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryDownRight(0));
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryKnightRightDown());
	
	G.WrapUpCases();
	
	@author Maury Johnson
	*/
	
	
	/**						CASTLING 	WHITE	CASE  RIGHT
	
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
	
	@author Maury Johnson
	*/
	
	/**			END		CASTLING			CASE
	
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
	@author Maury Johnson
	*/
		
		
		/**
		//						CASTLING 	BLACK	CASE  RIGHT
		//Black
		G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryUp(0));
		
		//G.SwapPlayer();
		
		G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(9)).TryUp(1));
		
		G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryUpRight(0));
		
		G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(11)).TryUp(1));
		
		G.ReturnStatusMove(((Queen<int[],int[],int[]>)G.Me.Pieces.get(3)).TryUp(1));
		
		G.ReturnStatusMove(((Bishop<int[],int[],int[]>)G.Me.Pieces.get(2)).TryUpRight(1));
		
		//G.ReturnStatusMove(((Rooke<int[],int[],int[]>)G.Me.Pieces.get(0)).TryRookeRightCastle());
		
		G.WrapUpCases();
		//			END		CASTLING			CASE
		@author Maury Johnson
		*/
			
	/**	CASTLING     BLACK   CASE		LEFT
	
	//Black
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(12)).TryUp(1));

	G.ReturnStatusMove(((Bishop<int[],int[],int[]>)G.Me.Pieces.get(5)).TryUpLeft(1));

	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(6)).TryUpRight(0));

	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(11)).TryUp(1));

	G.ReturnStatusMove(((Queen<int[],int[],int[]>)G.Me.Pieces.get(3)).TryUp(1));

	//G.ReturnStatusMove(((Rooke<int[],int[],int[]>)G.Me.Pieces.get(0)).TryRookeRightCastle());

	G.WrapUpCases();
	
	//			END				CASTLING			LEFT
	@author Maury Johnson
	*/
	
	/**			ENPASSANT 					CASE    USE Ctrl+F   Find __PRINT BOARD__
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
	
	//G.WrapUpCases();
	
	//White
	
	//G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryRight(0));
	
	//			END		ENPASSANT				CASE
	@author Maury Johnson
	*/
	
	/**
	 * Determines if reached end of game
	 * @author Maury Johnson
	 */
	boolean End = false;
	/**
	 * Determines if player1 asked to draw
	 *	@author Maury Johnson
	 */
	boolean P1Draw = false;
	/**
	 * Determines if player2 asked to draw
	 * @author Maury Johnson
	 */
	boolean P2Draw = false;
	
	/**System.out.println("\nSTART_____GAME\n");
	 * Used to scan the input of the players
	 * @author Maury Johnson
	 */
	Scanner s = new Scanner(System.in);
	/**
	 * Used to determine the status of the input
	 * @author Maury Johnson
	 */
	int Status =-1;
	/**
	 * Stores the input
	 * @author Maury Johnson
	 */
	String input = null;
	
	/**
	 * Switch First Player to white
	 * @author Maury Johnson
	 */
	G.SwapPlayer();
	
	/**
	 * Determines if this is player 1 and 2 first turn
	 * @author Maury Johnson
	 */
	boolean FirstTurn = true;
	
	int Idx = 0;
	
	/**
	 * While game has not ended
	 */
	while(!End){
		
		/**
		 * Print board for player 1
		 * @author Maury Johnson
		 */
		P2.PrintBoard(G);
		
		if(Status==1) {
			System.out.println("check");
		}
		
		/**
		 * Follow same procedure for status for player 2
		 * @author Maury Johnson
		 */
		Status = -1;
		
		/**
		 * while invalid input/move
		 * @author Maury Johnson
		 */
		System.out.println("White turn");
		while(Status==-1) {
		
		/**
		 * Get input from the next entered line by player
		 * @author Maury Johnson
		 */
		if(MyArgs==null || Idx>=MyArgs.size())
		input = s.nextLine();
		else {
		System.out.println("Enter to continue");
		s.nextLine();
		input = MyArgs.get(Idx);
		Idx+=1;
		}
		
		/**System.out.printf("Input: %s\n", input);
		 * Check if the input is "resign", then other player wins and leave program
		 * @author Maury Johnson
		 */
		if(input.contains("resign")) {
			System.out.printf("resign\nPlayer 2 wins");
			return;
		}
		/**
		 * Set P1Draw boolean to true if player1 has entered "draw?"
		 * @author Maury Johnson
		 */
		P1Draw = input.contains("draw?");
		/**
		 * If player2 has entered draw before and player 1 asked to draw aswell, 
		 * game is drawn, print draw and leave program.
		 * @author Maury Johnson
		 */
		if(P1Draw&&P2Draw) {
			System.out.println("draw");
			return;
		}
		/**
		 * If draw is declined or player2 hasn't drawn, player2's draw boolean is false
		 * @author Maury Johnson
		 */
		else {
			P2Draw = false;
		}
		/**
		 * Status is returned when trying to move given input
		 * @author Maury Johnson
		 */
		Status = G.TryMoveFromInput(input);
		/**
		 * If return Status is -2, player 2 is in checkmate and player 1 wins
		 * @author Maury Johnson
		 */
		if(Status==-2) {
			System.out.println("Checkmate");
			System.out.println("White wins");
			return;
		}
		/**
		 * If return Status is -1, print move is illegal, try again
		 * and allow while(Status==-1) to continue
		 * @author Maury Johnson
		 */
		else if(Status==-1) {
			System.out.println("Illegal move, try again");
		}
		else if(Status==1) {
			System.out.println("check");
		}
		}
		/**
		 * Check if this is the first turn of player 1,
		 * if so, then change players to player 2 only, and no cases are going to be checked
		 * like enpassant case or stalemate
		 * @author Maury Johnson
		 */
		if(FirstTurn) {
		G.SwapPlayer();
		FirstTurn = false;
		}
		/**
		 * If this is not the first turn for player 1, then check 
		 * If player 1's pawns just moved two units for this round  
		 * @author Maury Johnson
		 */
		else {
		
		/**
		 * Set opponent pawn JustMovedTwice booolean to false if it moved their pawn last turn
		 *@author Maury Johnson
		 */
		G.FinishMoveTwice();
		
		/**
		 * Perform stalemate check for Opponent's state
		 * @author Maury Johnson
		 */
		if(G.StaleMate())
		{
			System.out.println("Stalemate");
			return;
		}
		
		/**
		 * Swap players to player 2
		 * @author Maury Johnson
		 */
		G.SwapPlayer();
		}
		
		
		/**
		 * Print the board out for player 2
		 * @author Maury Johnson
		 */
		P1.PrintBoard(G);
		
		if(Status==1) {
			System.out.println("check");
		}
		
		/**
		 * Follow same procedure for status for player 2
		 * @author Maury Johnson
		 */
		Status = -1;
		
		System.out.println("Black turn");
		/**
		 * While invalid move or bad input
		 * @author Maury Johnson
		 */
		while(Status==-1) {
			/**
			 * Get input from player 2
			 * @author Maury Johnson
			 */
			if(MyArgs==null|| Idx>=MyArgs.size())
			input = s.nextLine();
			else {
			System.out.println("Enter to continue");
			s.nextLine();
	
			input = MyArgs.get(Idx);
			Idx+=1;
			}
			//System.out.printf("Input: %s\n", input);
			/**
			 * IF player 2 enters resign, print player 1 wins and return
			 * @author Maury Johnson
			 */
			if(input.contains("resign")) {
				System.out.printf("resign\nPlayer 1 wins");
				return;
			}
			
			/**
			 * Set P2Draw boolean to determine if player 2 inputted draw
			 * @author Maury Johnson
			 */
			P2Draw = input.contains("draw?");
			if(P1Draw&&P2Draw) {
				System.out.println("draw");
				return;
			}
			/**
			 * Set P1Draw boolean to false, since if player2 didn't accept draw
			 * @author Maury Johnson
			 */
			else {
				P1Draw = false;
			}
			
			/**
			 * Set Status to return value from TryMoveFronInput which tries to move given
			 * player 2 input
			 * @author Maury Johnson
			 */
			Status = G.TryMoveFromInput(input);
			/**
			 * If Status from return is -2, player 1 is in checkmate, print Player 2 wins and return
			 * @author Maury Johnson
			 */
			if(Status==-2) {
				System.out.println("Checkmate");
				System.out.println("Black wins");
				return;
			}
			/**
			 * If status returned -1, print illegal move, try again, and let while loop continue
			 * @author Maury Johnson
			 */
			else if(Status==-1) {
				System.out.println("Illegal move, try again");
			}
			else if(Status==1) {
				System.out.println("check");
			}
		}
			
			/**
			 * Perform stalemate check for Opponent state, after performed movement
			 * @author Maury Johnson
			 */
				if(G.StaleMate())
				{
					System.out.println("Stalemate");
					return;
				}
				
		/**
		 * Opponent set any pawn boolean justmoved twice to false and swap player
		 * @author Maury Johnson
		 */
		G.WrapUpCases();
		
	}
	
	
}

/**
 * Determine if any move Opponent does for any piece puts Opponent in check
 * @return 
 * boolean
 * @author Maury Johnson
 */
private boolean StaleMate() {
	// TODO Auto-generated method stub
	
	boolean Stalemate = false;
	
	Stalemate = OpponentCheckMate();
	
	return Stalemate;
}
/**
 * First check if opponent's pawn already moved, indicated by CanMoveTwice
 * boolean variable, and set them, if they exist, to true
 * This is due to when checking for check, pawn's CanMove twice variable can be altered, because
 * Of the new state that's generated,
 * So this is a precaution in order to not lose information that the pawn can move twice,
 * as long as it's located in the correct position
 * @author Maury Johnson
 */
private void WrapUpCases() {
	// TODO Auto-generated method stub
	this.FinishMoveTwice();
	
	this.SwapPlayer();
	
}

/**
 * Print the players me and opponent
 * @author Maury Johnson
 */
public void PrintPlayers() {
	System.out.printf("\n###########\nME: %c\n",Me.Player);
	System.out.printf("Opponent: %c\n#############\n\n",Opponent.Player);
}

/**
 * Basic Return status of movement but don't actually perform movement
 * Requires method TryMove which is any implemented move by a piece
 * as a parameter 
 * @param R
 * Int[] Array returned from trymove
 * @author Maury Johnson
 */
public void ReturnStatus(int[] R) {
	if(R[0]<0) {
		System.out.println("ERROR / BOUNDS ERROR");
	}
	else {
		System.out.printf("\nRETURN STATUS: %d\n",R[0]);
		/**
		 * Check if return status is valid
		 * @author Maury Johnson
		 */
		if(R[0]>=1 && R[0]<=8 || R[0]>=9 && R[0]<=16) {
			System.out.printf("\nMove to: [%d,%d] W\\ Piece: %c\n",R[1],R[2],(char)R[3]);
			//int[] K = {R[1],R[2],R[3],R[4],R[5]};	
			//KillPiece(K);
		}
		else if(R[0]>=17){
			/**
			 * Ally Detected, do nothing
			 * @author Maury Johnson
			 */
		}
	}
	/**
	 * @method PrintAllPieceStatus
	 * Print status of all pieces
	 * @author Maury Johnson
	 */
	PrintAllPieceStatus();
	/**
	 * @method PrintBoard
	 * Print Board given this game object
	 * @author Maury Johnson
	 */
	Me.PrintBoard(this);
}

/**
 * PRint all the statuses of pieces
 *@author Maury Johnson
 */
public void PrintAllPieceStatus() {
	System.out.println("\nMy Piece Statuses");
	for(int i=0; i<Me.Pieces.size();i+=1) {
		System.out.printf("Piece:%c My Position:[%d,%d]\n",Me.Pieces.get(i).Piece,Me.Pieces.get(i).CurrentPosition[0],Me.Pieces.get(i).CurrentPosition[1]);
	}
	System.out.println("\nOpponent Piece Stati");
	for(int i=0; i< Opponent.Pieces.size();i+=1) {
		System.out.printf("Piece:%c My Position:[%d,%d]\n",Opponent.Pieces.get(i).Piece,Opponent.Pieces.get(i).CurrentPosition[0],Opponent.Pieces.get(i).CurrentPosition[1]);
	}
	System.out.println("");
}

/**
 * Get the Object Piece by looking for its coordinate match in board
 * @param IT
 * Position to get piece object
 * @return 
 * Piece Object
 * @author Maury Johnson
 */
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
	
	/**
	 *If no player pieces found in that spot
	 * @author Maury Johnson
	 */
	return null;
}

/**
 * Returns status of movement tried, including check/checkmate, requires
 * method Trymove as parameter, which is implemented from a piece
 * @param R
 * int[] array from TryMove
 * @return
 * int
 * @author Maury Johnson
 */
public int ReturnStatusMove(int[] R) {
	
	/**
	 * If there is no input, return status -1, invalid move
	 * @author Maury Johnson
	 */
	if(R==null) {
		return -1;
	}
	
	/**
	 * @method PriceBoard
	 * Print Board before moving
	 *
	@author Maury Johnson
	*/
	System.out.println("\nBoard");
	Me.PrintBoard(this);
	
	
	/**
	 * Initialize return status
	 *@author Maury Johnson
	 */
	int ret = -1;
	/**
	 * Check If Return type is out of bounds
	 * @author Maury Johnson
	 */
	if(R[0]<0) {
		System.out.println("ERROR / BOUNDS ERROR");
	}
	else {
		
		System.out.printf("\nRETURN STATUS: %d\n",R[0]);
		
		/**
		 * If return type is valid move
		 * @author Maury Johnson
		 */
		if(R[0]>=1 && R[0]<=8 || R[0]>=9 && R[0]<=16) {
			System.out.printf("\nMove to: [%d,%d] W\\ Piece: %c\n",R[1],R[2],(char)R[3]);
			
			/**
			 * Truncate Return array to R[1] to final entry in R
			 * @author Maury Johnson
			 */
			int[] K = new int[R.length-1];
			for(int i=1; i<R.length;i+=1) {
				K[i-1] = R[i];
			}
			/**
			 * return status of trying to attack piece
			 * @author Maury Johnson
			 */
			System.out.printf("K length:%d",K.length);
			ret = KillPiece(K);			
			System.out.printf("return status: %d", ret);
			
			/**
			 * @method OpponentCheckMate
			 * CHECK MATE CHECK done on opponent
			 * If ret is 1, that means opponent is in check,
			 * Now check if opponent is in checkmate, if so, then my player wins
			 * @author Maury Johnson
			 */
			if(ret==1&&OpponentCheckMate()) {
				System.out.printf("\nOpponent:%c is in CHECKMATE! %c WINS!\n",Opponent.Player,Me.Player);
				Me.PrintBoard(this);
				return -2;
			}
			else if(ret==1) {
				return 1;
			}
		}
		/**
		 * case where Ally is Attacked, do nothing
		 * and set return status to -1
		 * @author Maury Johnson
		 */
		else if(R[0]>=17){
			ret = -1;
		}
	}
	
	/**
	 * @method PrintAllPieceStatus
	 * Print status of all pieces after every move
	 *@author Maury Johnson
	 */
	PrintAllPieceStatus();
	Me.PrintBoard(this);
	
	return ret;
}

/**
 * Swap field Player Me with field Opponent, Player1->Player2
 *@author Maury Johnson
 */
public void SwapPlayer() {
	Player Z = Me;
	Me = Opponent;
	Opponent = Z;
	this.PrintPlayers();
}

/**
 * Convert character for board coordinate to integer
 * @param c
 * Character to be parsed
 * @return
 * int
 * @author Maury Johnson
 */
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

/**
 * Parse input from player and return appropriate coordinates, if it is a valid input
 * @param s
 * String to be parsed
 * @return
 * int []
 * @author Maury Johnson
 */
public int[] ParseInput(String s) {
	
	System.out.printf("\n"
			+ "String:%s",s);
	
	/**
	System.out.printf("String Size: %d",s.length());
	if(s.length()!=5 && s.length()!=7) {
		//e4 e5\0, the max len is 5
		return null;
	}
	Not needed
	@author Maury Johnson
	*/
	
	/**
	 * check if the input length is valid, has to be >=5
	 * @author Maury Johnson
	 */
	if(s.length()<5) {
		return null;
	}
	/**
	 * Initialize variables to be used for coordinates
	 * @author Maury Johnson
	 */
	int i,j,k,l;
	
	/**
	 * Try to convert to integer character
	 * If this fails, then return null
	 * @author Maury Johnson
	 */
	try {
		i = ToInt(s.charAt(0));
	}
	catch (Exception e){
		return null;
	}
	/**		
	System.out.printf("i:%d\n",i);
	@author Maury Johnson
	*/
	/**
	 * Check if integer is valid, else return null
	 * @author Maury Johnson
	 */
	if(i<0||i>7) {
		return null;
	}
	/**
	 * Create string out of next character and then parse integer from it
	 * @author Maury Johnson
	 */
	String s1 = "" + s.charAt(1);
	 /**
	  * try to parse integer out of this string,
	  * return null if error
	  * @author Maury Johnson
	  */
	try {j = 8-Integer.parseInt(s1);
	}
	catch(Exception f){
		return null;
	}
	
	/**
	 * System.out.printf("j:%d\n",j);
	 *@author Maury Johnson
	 */
	
	/**
	 * Check if integer is valid, otherwise return null.
	 * @author Maury Johnson
	 */
	if(j<0||j>7) {
		return null;
	}
	 /**
	  * try to parse integer out of this string,
	  * return null if error
	  * @author Maury Johnson
	  */
	try{ k = ToInt(s.charAt(3));
	}
	catch(Exception h) {
		return null;
	}
	
	/**
	 * System.out.printf("k:%d\n",k);
	 * @author Maury Johnson
	 */
	/**
	 * Check if integer is valid, otherwise return null
	 * @author Maury Johnson
	 */
	if(k<0) {
		return null;
	}
	/**
	 * Convert character to string
	 * and try to parse integer from it
	 * @author Maury Johnson
	 */
	s1 = "" + s.charAt(4);
	 
	/**
	  * try to parse integer out of this string,
	  * return null if error
	  * @author Maury Johnson
	 */
	try{l = 8-Integer.parseInt(s1);
	}
	catch(Exception o) {
		return null;
	}
	
	 /**System.out.printf("l:%d\n",l);
		@author Maury Johnson
	 */
	/**
	 * Check if integer is valid, otherwise return null
	 * @author Maury Johnson
	 */
	if(l<0||l>7) {
		return null;
	}
	/**
	 * 
	 * Store all coordinates from start to end
	 * @author Maury Johnson
	 */
	int [] All = {j,i,l,k};
	/**
	System.out.printf("Parsed From:[%d,%d] To:[%d,%d]\n", All[0],All[1],All[2],All[3]);
	@author Maury Johnson
	*/
	return All;
}

/**
 * Get Movement which matches the movement of piece to the coordinate in row,col format
 * @param MyPiece
 * Object Piece
 * @param To
 * int[] Coordinate
 * @return
 * int
 * @author Maury Johnson
 */
public int GetMatchingMove(Piece MyPiece, int[] To) {
	/**Read from all cases in that list
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
	@author Maury Johnson
	*/
	/**
	System.out.println("Try to GetMatchingMove1");
	@author Maury Johnson
	*/
	/**
	 * Create list to store all possible movements from piece determined
	 * @author Maury Johnson
	 */
	LinkedList<int[]> R = new LinkedList<int[]>();
	/**
	 * @method AddAllSets
	 * Gets all possible movements from piece, stores it into the linked list
	 * @author Maury Johnson
	 */
	AddAllSets(R,MyPiece,true);
		
	/**
	 * For all sets of movements, find the one which ending coordinates match to TO
	 */
	for(int i=0;i<R.size();i+=1) {
		if(R.get(i)==null) {
			continue;
		}
		
		/**
		 * Case where length of coordinate array is 9, indiicating that the movement is a castle
		 * 
		 * @author Maury Johnson
		 */
		if(R.get(i).length>=9) {
			/**@method GetPiece
			 * Gets Piece coordinated from returned coordinates
			 * Checks if that end coordinate piece is an instance of king of current player
			 * @author Maury Johnson
			 */
			if(GetPiece(To) instanceof King<?,?,?>) {
			/**
			 *Fix pose for castling move 
			 * @author Maury Johnson
			 */
			
			/**
			 * System.out.printf("\nGOT IT! GetMatchingMove2 TO [%d,%d] FROM [%d,%d]\n",To[0],To[1],R.get(i)[4],R.get(i)[5]);
			 *@author Maury Johnson
			 */
			/**
			 * Now perform the movement for this array
			 * @author Maury Johnson
			 */
			return ReturnStatusMove(R.get(i));
			}
			/**
			 * If To coordinate piece is not king, then continue
			 * @author Maury Johnson
			 */
			else {
				continue;
			}
		}
		
		
		/**
		 * If the To coordinated match and the current position matches in array, 
		 * call function ReturnStatusMove of that int ARRAY
		 * @author Maury Johnson	
		 */
		if(To[0]==R.get(i)[1] && To[1]==R.get(i)[2] && MyPiece.CurrentPosition[0]==R.get(i)[4] && MyPiece.CurrentPosition[1]==R.get(i)[5]) {
			
			/**System.out.printf("\nGOT IT! GetMatchingMove2 TO [%d,%d] FROM [%d,%d]\n",To[0],To[1],R.get(i)[4],R.get(i)[5]);
			 *@author Maury Johnson 
			 */
			/**
			 * @method ReturnStatusMove
			 * Takes matching int[] array and returns status from ReturnStatusMove function.
			 * @author Maury Johnson
			 */
			return ReturnStatusMove(R.get(i));
		}
		
	}
	
	
	/**
	 * System.out.println("Failed to GetMatchingMove3");
	 *System.out.println("Illegal move, try again");
	 *IF failed to find matching TO [1][2] FROM START
	 @author Maury Johnson
	*/
	
	return -1;
}

/**
 * Try Move From Input, return 0 success, -1 fail, 1 Opponent is in Check
 * @param s
 * Input from player
 * @return
 * int
 * @author Maury Johnson
 */
public int TryMoveFromInput(String s) {
	/**
	 * @method ParseInput
	 * Parse String Input, and return coordinate From and To array
	 * @author Maury Johnson
	 */
	int [] TrueIn = ParseInput(s);
	/**
	 * Check if integer array is valid
	 * @author Maury Johnson
	 */
	if(TrueIn==null) {
		return -1;
	}
	
	/**
	 * Get from Position and verify it's a piece
	 * @author Maury Johnson
	 */
	int[] MyPose = {TrueIn[0],TrueIn[1]};
	Piece MyPiece = GetPiece(MyPose);
	
	/**
	 * Check if not valid piece or the piece is not my piece
	 * Then return -1 status
	 * @author Maury Johnson
	 */
	if(MyPiece==null||MyPiece.Player!=Me.Player) {
		/**
		 * System.out.println("Illegal move, try again");
		 * @author Maury Johnson
		 */
		return -1;
	}
	
	/**
	 *  For each type piece, cast it to that 
	 * @author Maury Johnson
	 */
	/**
	 * @method GetPiece
	 * Gets piece given coordinated
	 * Get To position and perform returnstatusmove on it
	 * @author Maury Johnson
	 */
	int[] To = {TrueIn[2],TrueIn[3]};
	Piece ToPiece = GetPiece(To);
	
	/**
	 * Check if Player Me piece is a king piece
	 * @author Maury Johnson
	 */
	if(MyPiece instanceof King<?,?,?>) {
	/**
	 * Then King wants to castle a rooke, King -> Rooke type of click
	 * @author Maury Johnson
	 */
	if(ToPiece instanceof Rooke<?,?,?>) {
		/**
		 * Just switch piece and perform rooke castle movement to king
		 * @author Maury Johnson
		 */
		To[0] = MyPiece.CurrentPosition[0];
		To[1] = MyPiece.CurrentPosition[1];
		
		MyPiece = ToPiece;
		
	}
	/**
	 * Check if king wants to move twice over.. then another castling attempt
	 * @author Maury Johnson
	 */
	else if(Math.abs(MyPiece.CurrentPosition[1]-To[1])==2 && MyPiece instanceof King<?,?,?>) {
		
		System.out.println("CASTLE");
		
		/**
		 * If negative dist, then rooke is to right side
		 * @author Maury Johnson
		 */
		if(MyPiece.CurrentPosition[1]-To[1]==-2) {
			/**
			 * Now get Rooke on right side of king
			 * @author Maury Johnson
			 */
			int [] getR = {MyPiece.CurrentPosition[0],7};
			
			/**
			 * Now set To[] array to king's current position
			 * @author Maury Johnson
			 */
			To[0]=MyPiece.CurrentPosition[0];
			To[1]=MyPiece.CurrentPosition[1];
			
			/**
			 * @method GetPiece
			 * Set king piece object to rooke object, while also
			 * Setting To parameter to king's position, in order to correctly use
			 * GetMatchingMove function 
			 * If piece is not rooke, return status -1 error!!
			 *@author Maury Johnson
			 */
			MyPiece = GetPiece(getR);
			if(MyPiece==null || !(MyPiece instanceof Rooke<?,?,?>)) {
				return -1;
			}
		
			/**
			 *@method ReturnStatusMove
			 *Return status of movement which implements a move
			 *@method get
			 *get 7th piece for current player, which will be right rook for both players
			 *@method TryRookeLeftCastle
			 *Try to castle left for rooke
			 * @author Maury Johnson
			 *
			 */
			
			return ReturnStatusMove(((Rooke<int[],int[],int[]>)Me.Pieces.get(7)).TryRookeLeftCastle());
		
		}
		/**
		 * If positive dist, then rooke is to left side
		 *@author Maury Johnson
		 */
		else if(MyPiece.CurrentPosition[1]-To[1]==2 && MyPiece instanceof King<?,?,?>) {
			
			/**
			 * Get Left side rooke
			 * @author Maury Johnson
			 */
			int [] getR = {MyPiece.CurrentPosition[0],0};
			/**
			 * Set to position to king again, for castle type move
			 * @author Maury Johnson
			 */
			To[0]=MyPiece.CurrentPosition[0];
			To[1]=MyPiece.CurrentPosition[1];
			
			/**
			 * @method GetPiece
			 * Set king piece object to rooke object, while also
			 * Setting To parameter to king's position, in order to correctly use
			 * GetMatchingMove function
			 * If piece doesn't exist, return -1, error!! 
			 *@author Maury Johnson
			 */
			MyPiece = GetPiece(getR);
			if(MyPiece==null|| !(MyPiece instanceof Rooke<?,?,?>)) {
				//System.out.println("Illegal move, try again");
				return -1;
			}
			/**
			 *@method ReturnStatusMove
			 *Return status of movement which implements a move
			 *@method get
			 *get 0th piece for current player, which will be left rook for both players
			 *@method TryRookeRightCastle
			 *Try to castle right for rooke
			 * @author Maury Johnson
			 *
			 */
			return ReturnStatusMove(((Rooke<int[],int[],int[]>)Me.Pieces.get(0)).TryRookeRightCastle());
		}
		
	}
	
	}
	
	/**
	 * @method GetMatchingMove
	 * For a traditional move
	 * Set Return variable to GetMatchingMove,
	 * gets return status
	 * @author Maury Johnson
	 */
	int Ret = GetMatchingMove(MyPiece, To);
	
	/**
	 * Check if MY piece to move is Pawn
	 * @author Maury Johnson
	 */
	if(MyPiece instanceof Pawn<?,?,?> )  {
		/**
		 * Check if my piece position reached the end of board, promotion available
		 * @author Maury Johnson
		 */
		if(MyPiece.CurrentPosition[0]==0||MyPiece.CurrentPosition[0]==7) {
			/**
			* Promote to the last character given
			*
			*
			System.out.printf("Promotion!!! @ [%d,%d]\n",MyPiece.CurrentPosition[0],MyPiece.CurrentPosition[1]);
			* @author Maury Johnson
			*/
			/**
			 * Validate parsed string length
			 * @author Maury Johnson
			 */
			if(s.length()==7) {
			Piece NewP = NewPiece(s.charAt(s.length()-1));	
			/**
			 * 
			 * @author Maury Johnson
			 */
			if(NewP!=null) {
				
				ReplacePiece(NewP,MyPiece);
				
			}
			else {
				/**
				 * Invalid argument?!?!
				 * No piece exists from given piece to promote to, error
				 * @author Maury Johnson
				  return -1;
				 */ 
			}
			}
			/**
			 * If no promotion piece is given, then default promotion given is queen
			 * @author Maury Johnson
			 */
			else {
			Queen<int[],int[],int[]> Q = new Queen<int[],int[],int[]>(Me.Player);
			Q.Piece = 'Q';
			ReplacePiece(Q,MyPiece);
			}
			if(OpponentInCheck()) {
				return 1;
			}
		}
	}

	return Ret;
}

/**
 * Created new piece for current player, given character
 * @param s
 * Piece type
 * @return
 * Piece object
 * @author Maury Johnson
*/
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
/**
 * Replaces one piece with another piece, preferrably a pawn with another piece
 * @param NewPiece
 * Piece object to replace old piece
 * @param OldPiece
 * Piece object to be replaced 
 * @author Maury Johnson
 */
private void ReplacePiece(Piece NewPiece,Piece OldPiece) {
	/**
	 * Set new pose
	 * @author Maury Johnson
	 */
	NewPiece.CurrentPosition[0] = OldPiece.CurrentPosition[0];
	NewPiece.CurrentPosition[1] = OldPiece.CurrentPosition[1];
	
	/**
	 * Completely remove data of old piece from linked list
	 * @author Maury Johnson
	 */
	//Me.Pieces.remove(OldPiece);
	
	OldPiece.CurrentPosition[0] = -1;
	OldPiece.CurrentPosition[1] = -1;
	
	/**
	 * New Board
	 * @author Maury Johnson
	 */
	Me.Board = Me.CopyNewBoard(NewPiece.CurrentPosition[0], NewPiece.CurrentPosition[1], NewPiece.Piece);
	
	/**
	 * Set player, add this new piece to current player's collection of pieces
	 * @author Maury Johnson
	 */
	NewPiece.SetPlayer(Me.Player);
	Me.Pieces.add(NewPiece);
}

/**
 * Destroy piece in board
 * @param K
 * int[] Contains information about current piece position and final piece position
 * @return
 * int
 * @author Maury Johnson
 */
private int KillPiece(int[] K) {
	/**
	 * System.err.printf("Try Kill Piece in Position: [%d,%d] FROM: [%d,%d] KillPiece1\n " ,K[0],K[1],K[3],K[4]);
	 * @author Maury Johnson
	 */
	/**
	 * Iterate through all opponent's pieces
	 * @author Maury Johnson
	 */
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		/**
		*System.out.printf("IF [%d,%d] == [%d,%d]\n",K[0],K[1],Opponent.Pieces.get(i).CurrentPosition[0],Opponent.Pieces.get(i).CurrentPosition[1]);
		*If coordinate to kill piece matches a piece in opponent list
		*@author Maury Johnson
		*/
		if(K[0]==Opponent.Pieces.get(i).CurrentPosition[0] && K[1]==Opponent.Pieces.get(i).CurrentPosition[1]) {
			
			/**
			 * Kill Opponent Piece Found
			 * @author Maury Johnson
			 */
			System.err.printf("Kill Opponent Piece:%c @[%d,%d] KillPiece2",
					Opponent.Pieces.get(i).Piece,
					Opponent.Pieces.get(i).CurrentPosition[0],
					Opponent.Pieces.get(i).CurrentPosition[1]);
				
			/**
			 * MyPosition starts
			 * @author Maury Johnson
			 */
			int [] MyPosition = {K[3],K[4]};
			Piece MyPiece = GetPiece(MyPosition);
			/**
			 * My type
			 * @author Maury Johnson
			 */
			char MyType = MyPiece.Piece;	
			/**
			 * Attack this position
			 * @author Maury Johnson
			 */
			int []Attack = {K[0],K[1]};
			/**
			 * Attacked Piece object
			 * @author Maury Johnson
			 */
			Piece AttackedPiece = Opponent.Pieces.get(i);
			
			if(MyPiece!=null) {
			/**
			 * (Player Opponent, char OpponentType,int[] MyPosition,Piece MyPiece, Piece AttackedPiece, int[] Attack) {
			 * @author Maury Johnson
			 */
			
			if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
			/**If pawn and K indicates enapassant move
			 * @method Enpassant
			 * Perform enpassant if conditions pawn and array length >=7 are satisfied
			 * @author Maury Johnson
			 */
			EnPassant(MyPiece,K,true);	
			
			
			System.out.println("Enpass Test:");
			Me.PrintBoard(this);
			// @author Maury Johnson
			
			
			}
			else {
			/**
			 * Attack opponent piece	
			 * @author Maury Johnson
			 */
			Attack(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
			}
			
			
			System.out.println("Board to look at KillPiece1");
			Me.PrintBoard(this);
			//@author Maury Johnson
			//*/
			
			/**
			 * Check if this leads to a check on your end...
			 * @author Maury Johnson
			 */
			if(MeInCheck()){
				System.err.println("Invalid Move, puts yourself in check, restoring original spot KillPiece2");
				
				/**
				 * Restore piece and attacked piece if they participated in enpassant
				 * @author Maury Johnson
				 */
				if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
				/**
				 * @method RestoreEnPassant
				 * Restore state before an attempted EnPassant move
				 * @author Maury Johnson
				 */
				RestoreEnPassant(MyPiece,AttackedPiece,K);
				/**
				 * Cannot perform enpassant here w/o check, so this is false
				 * @author Maury Johnson
				 */
				((Pawn<int[],int[],int[]>)MyPiece).EnPassantMove = false;
				}
				
				else {
				/**
				 * Restore Opponent piece and My Piece
				 * @author Maury Johnson
				 */
				Restore(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
				}
				
				/**
				 * Return status -1 indicating invalid movement
				 * @author Maury Johnson
				 */
				return -1;
			}
			/**
			 * If this move puts opponent in check
			 * @author Maury Johnson
			 */
			else if(OpponentInCheck()){
				/**
				 * System.err.println("Opponent is in check KillPiece3");
				 *
				 * Return status 1 indicating opponent is in check
				 * @author Maury Johnson
				 */
				
				if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
					/**
					 * @method RestoreEnPassant
					 * Restore previous move before enpassant, even if it worked... safety
					 * @author Maury Johnson
					 */
					RestoreEnPassant(MyPiece,AttackedPiece,K);
				}
				
				/**
				 * @method CastleCheck
				 * If king or Rooke Moved, can no longer castle
				  @author Maury Johnson
				 */
				CastleCheck(MyPiece);				
				
				/**
				 * @method PawnFirstMoveCheck
				 * IF current player pawn moved in first turn, this invalidates its option to move twice
				 *@author Maury Johnson
				 */
				PawnFirstMoveCheck(MyPiece);
				
				/**
				 * @method EnPassant
				 * Perform Potential Enpassant
				 * @author Maury Johnson
				 */
				EnPassant(MyPiece,K,false);
				/**
				 * return 1 indicating opponent is in check
				 * @author Maury Johnson
				 */
				
					//System.out.println("check");
				
				return 1;
			}
				/**
				 * Case where opponent is not in check for a valid move
				 * @author Maury Johnson
				 */
			
				if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
					/**
					 * Restore previous move before enpassant, even if it worked... safety
					 * @author Maury Johnson
					 */
					RestoreEnPassant(MyPiece,AttackedPiece,K);
				}
				
				/**
				 * @method PawnFirstMoveCheck 
				 * IF pawn moved in first turn, this invalidates its option to move twice
				 * @author Maury Johnson
				 */
				PawnFirstMoveCheck(MyPiece);
				
				/**
				 * @method CastleCheck
				 * If king or Rooke Moved, can no longer castle
				 * @author Maury Johnson
				 */
				CastleCheck(MyPiece);
				
				/**
				 * @method Enpassant
				 * Perform EnPassant if valid
				 * @author Maury Johnson
				 */
				EnPassant(MyPiece,K,false);
				
				/**
				 * return 0 indicating normal move no checks
				 * @author Maury Johnson
				 */
				return 0;
				
			}
			/**
			 * IF piece is not found, error, exit program
			 * @author Maury Johnson
			 */
			else {
				System.out.println("ERROR, MY PIECE NOT FOUND");
				System.exit(-1);
			}
		
		}
	}
	
	/**
	//FOR PAWN...
	//IF attackleft/attackright is free space, no enpassant possible!
	System.err.println("\n Found Free Space #/' ' KillPiece4");
	@author Maury Johnson
	*/
	
	/**
	 * @method GetPiece
	 * Set My Position
	 * and MY Piece
	 * @author Maury Johnson
	 */
	int [] MyPosition = {K[3],K[4]};
	Piece MyPiece = GetPiece(MyPosition);
	/**
	 * MyPiece should never be null
	 * @author Maury Johnson
	 */
	if(MyPiece==null) {
		System.out.printf("\nPiece Should never be null @ [%d,%d]  KillPiece 5\n",K[3],K[4]);
		Me.PrintBoard(this);
		System.exit(-1);	
	}
	
	/**
	 * Get from char My Type
	 * @author Maury Johnson
	 */
	char MyType = MyPiece.Piece;
	/**
	 * Attack this position
	 * @author Maury Johnson
	 */
	int []Attack = {K[0],K[1]};
	Piece AttackedPiece = null;
	
	/**
	 * Check if piece is instance of pawn and can perform enpassant
	 * @author Maury Johnson
	 */
	if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		int [] GetAtt = {K[5],K[6]};
		AttackedPiece=GetPiece(GetAtt);
	}
	/**
	 * Check if piece is a rooke and can perform castling
	 * @author Maury Johnson
	 */
	else if(MyPiece instanceof Rooke<?,?,?> && K.length>=9) {
	 
		System.out.printf("\n K[0]:%d \n",K[0]);
	    	
		if(K[0]<0) {
			//System.out.println("Illegal move, try again");
			return -1;
		}
		
		int[] KingPose = {K[7],K[8]};
		Piece MyKing = GetPiece(KingPose);
		int[] KingTo = {K[5],K[6]};
		
		/**
		 * Castling Case
		 * @author Maury Johnson
		 */
		Castle(MyPiece,MyKing,KingTo,Attack);
	}
	else {
	/**
	 * No Piece to attack, no piece found to attack in that position
	 * @author Maury Johnson
	 */
	AttackedPiece=null;
	}
	
	/**
	 * My Piece exists
	 * @author Maury Johnson
	 */
	if(MyPiece!=null) {
	
	if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		/**
		 * If pawn and K indicates enapassant move
		 * @author Maury Johnson
		 */
		EnPassant(MyPiece,K,true);	
		
		System.out.println("Enpass Test:");
		Me.PrintBoard(this);
		//@author Maury Johnson
		//*/	
	}	
	else if(MyPiece instanceof Rooke<?,?,?> && K.length>=9) {
		
	}
	else {
	/**
	 * Traverse to the empty position
	 * @author Maury Johnson
	 */
	
	Attack(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
	
	}
	
	
	System.err.println("Board to look at KillPiece5");
	Me.PrintBoard(this);
	//@author Maury Johnson
	//*/
	
	/**
	 * Check if this leads to a check on your end...
	 * @author Maury Johnson
	 */
	if(MeInCheck()){
		/**
		System.err.println("Invalid Move, puts yourself in check KillPiece6");
		@author Maury Johnson
		*/
		/**
		 * Restore attempted enpassant movement
		 * @author Maury Johnson
		 */
		if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		/**
		 * Restore state before an attempted EnPassant move
		 * @author Maury Johnson
		 */
		RestoreEnPassant(MyPiece,AttackedPiece,K);
		/**Cannot perform enpassant here w/o check, so this is false
		 * @author Maury Johnson
		 */
		((Pawn<int[],int[],int[]>)MyPiece).EnPassantMove = false;
		}
		
		else if(MyPiece instanceof Rooke<?,?,?> && K.length>=9) {
			
			
		}
		
		else {
		/**
		 * Restore old positions board and MyPiece
		 * @author Maury Johnson
		 */
		
		Restore(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
		
		}
		/**
		 * Return status indicating invalid move
		 * @author Maury Johnson
		 */
		return -1;
	}
	
	/**
	 * @method OpponentInCheck
	 * If opponent is in check because of my move
	 *@author Maury Johnson
	 */
	else if(OpponentInCheck()){
		System.err.println("Opponent is in check KillPiece7");
		/**Return status 1 indicating opponent is in check
		 * @author Maury Johnson
		 */
		
		/**
		 * Check if piece is pawn and can perform enpassant
		 * @author Maury Johnson
		 */
		if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		/**
		 * @method RestoreEnpassant
		 * Restore state before an attempted EnPassant move
		 * @author Maury Johnson
		 */
		RestoreEnPassant(MyPiece,AttackedPiece,K);
		}

		/**
		 * @method PawnFirstMoveCheck
		 * IF pawn moved in first turn, this invalidates its option to move twice
		 * @author Maury Johnson
		 */
		PawnFirstMoveCheck(MyPiece);
		
		/**
		 * @method CastleCheck
		 * If king or Rooke Moved, can no longer castle
		 * @author Maury Johnson
		 */
		CastleCheck(MyPiece);
		
		/**
		 * @method Enpassant
		 * Try enpassant move for valid piece
		 * @author Maury Johnson
		 */
		EnPassant(MyPiece,K,false);
		
		/**
		 * return status indicating opponent is in check
		 * @author Maury Johnson
		 */
		//System.out.println("check");
		return 1;
	}
	
	/**
	 * Check if performed empassant, restore previous state
	 * @author Maury Johnson
	 */
	if(MyPiece instanceof Pawn<?,?,?> && K.length>=7) {
		//Restore state before an attempted EnPassant move
		RestoreEnPassant(MyPiece,AttackedPiece,K);
	}
	
	/**
	 * @method PawnFirstMoveCheck
	 * IF pawn moved in first turn, this invalidates its option to move twice
	 * @author Maury Johnson
	 */
	PawnFirstMoveCheck(MyPiece);
	
	/**@method CastleCheck
	 * If king or Rooke Moved, can no longer castle
	@author Maury Johnson
	*/
	CastleCheck(MyPiece);
	
	/**@method Enpassant
	 * Perform enpassant if valid
	 * @author Maury Johnson
	 */
	EnPassant(MyPiece,K,false);
	
	return 0;
	
	}
	/**
	 * My Piece not found, should never happen
	 * @author Maury Johnson
	 */
	else {
		System.out.println("ERROR, MY PIECE NOT FOUND");
		System.exit(-1);
	}
	
	/**
	 * return 0 for normal move done
	 * @author Maury Johnson
	 */
	return 0;
}

/**
 * Perform Castling move **ONly can be performed when not in check
 * @param MyPiece
 * Piece that I will use for castle
 * @param MyKing
 * Piece that is my king
 * @param KingTo
 * Piece that king will travel to
 * @param Attack
 * Position for rooke to attack
 * @author Maury Johnson
 */
private void Castle(Piece MyPiece, Piece MyKing, int[] KingTo, int[] Attack) {
	if(!(MyKing instanceof King<?,?,?>) || !(MyPiece instanceof Rooke<?,?,?>)) {
		System.out.println("Piece is neither king nor a rooke Castle1");
		return;
	}
	
	/**
	 * Move Rooke
	 * @author Maury Johnson
	 */
	Me.Board = 	Me.CopyNewBoard(MyPiece.CurrentPosition[0], MyPiece.CurrentPosition[1],Me.WhichBlock(MyPiece.CurrentPosition[0], MyPiece.CurrentPosition[1]));
	MyPiece.CurrentPosition[0] = Attack[0];
	MyPiece.CurrentPosition[1] = Attack[1];
	Me.Board = 	Me.CopyNewBoard(Attack[0], Attack[1],MyPiece.Piece);
	
	/**
	 * Move King
	 * @author Maury Johnson
	 */
	Me.Board = 	Me.CopyNewBoard(MyKing.CurrentPosition[0], MyKing.CurrentPosition[1],Me.WhichBlock(MyKing.CurrentPosition[0], MyKing.CurrentPosition[1]));
	MyKing.CurrentPosition[0] = KingTo[0];
	MyKing.CurrentPosition[1] = KingTo[1];
	Me.Board = 	Me.CopyNewBoard(KingTo[0], KingTo[1],MyKing.Piece);


	 // Finish Castle move
	  System.out.println("FINISHING Castle2...");
	 // @author Maury Johnson
	
	Me.PrintBoard(this);
	//*/
}

/**
 * For Kill/Attack Enemy functions
 * Check if it's pawn and also if EnPassent is active, then continue with EnPassent move
 * @param MyPiece
 * Piece that will perform enpassant move
 * @param Attack
 * Position to go to
 * @param Try
 * If this is a try move or not
@author Maury Johnson
*/
private void EnPassant(Piece MyPiece,int[] Attack, boolean Try) {
/**
	System.out.println("Try Enpassant1");
	
	Check if attack array is truly an enpassant array
	@author Maury Johnson
	*/
	if(Attack.length>=7) {
	/**
	 * Check if piece is pawn and Pawn can perform enpassantMove
	 * @author Maury Johnson
	 */
	if(MyPiece instanceof Pawn<?,?,?> || MyPiece.Piece=='p') {
		
		if(((Pawn<int[],int[],int[]>)MyPiece).EnPassantMove) {
			/**
			System.out.printf("ENPASSANT FROM: [%d,%d] TO: [%d,%d], KILL PIECE @ [%d,%d] EnPassant1",Attack[3],Attack[4],Attack[0],Attack[1],Attack[5],Attack[6]);
			@author Maury Johnson
			*/
			int[] AnyP = {Attack[1],Attack[1]};
			Piece AnyPiece = GetPiece(AnyP);
			if(AnyPiece!=null) {
				if(MyPiece.AllyPiece(AnyP)) {
					/**
					 * Ally piece to my piece!! NO!!
					 * @author Maury Johnson
					System.out.println("This position taken is ally piece EnPassant2!!!");
					*/
					return;
				}
			}
			
			/**
			 * Attack position and move to correct spot now
			 * 
			 * @author Maury Johnson
			 */
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

/**
 * Restore state before enpassant movement, good for checking if this puts you in check
 * @param MyPiece
 * Piece to restore position before enpassant was done
 * @param AttackedPiece
 * Attacked piece to restore it's position before enpassant
 * @param Attack
 * Position to restore MyPiece position and AttackedPiece position
 * @author Maury Johnson
 */
private void RestoreEnPassant(Piece MyPiece,Piece AttackedPiece,int[] Attack) {
	
	/**
	 * Validate attack array
	 * @author Maury Johnson
	 */
	if(Attack.length>=7) {	
		if(MyPiece instanceof Pawn<?,?,?> || MyPiece.Piece=='p') {
			if(((Pawn<int[],int[],int[]>)MyPiece).EnPassantMove) {
				/**System.out.printf("RESTORE BEFORE ENPASSANT TO: [%d,%d] FROM: [%d,%d], RESTORE KILLED PIECE @ [%d,%d] -->SEE ctrl+ KillPiece Previous\n",Attack[3],Attack[4],Attack[0],Attack[1],Attack[5],Attack[6]);
				@author Maury Johnson
				*/
				
				/**
				 * Restore all positions before enpassant performed
				 * 
				 * @author Maury Johnson
				 */
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

/**
 * If Pawn already moved, pawn cannot move two units any more
 * @param MyPiece
 * Piece that should be pawn
 * @author Maury Johnson
 */
private void PawnFirstMoveCheck(Piece MyPiece) {
	// TODO Auto-generated method stub
	if(MyPiece instanceof Pawn<?,?,?>) {
		((Pawn<int[],int[],int[]>) MyPiece).CanMoveUpTwice=false;
	}
	
	
}

/** 
 * Checks if king or rooke moved
 * If king moves, none of the pieces can castle with king
 *	Otherwise, the rooke that moved will no longer be able to castle with king
 * @param MyPiece
 * Piece that should be king or rooke
 * @author Maury Johnson
 */
private void CastleCheck(Piece MyPiece) {
	// TODO Auto-generated method stub
	if(MyPiece instanceof King<?,?,?>) {	
		//King Moved 
		((King<int[],int[],int[]>)(MyPiece)).CanCastle = false;
		//Set all rookes CanCastle to false
		NoneCanCastle();
	}
	
	if(MyPiece instanceof Rooke<?,?,?>){
		//Rooke Moved
		((Rooke<int[],int[],int[]>)(MyPiece)).CanCastle = false;
	}
	
}

/**
 * Set all of my rooke's CanCastle to false, because king moved
 * @author Maury Johnson
 */
private void NoneCanCastle() {
	// TODO Auto-generated method stub
	
	for(int i=0;i<Me.Pieces.size();i+=1) {
		if(Me.Pieces.get(i) instanceof Rooke<?,?,?>) {
			((Rooke<int[],int[],int[]>)(Me.Pieces.get(i))).CanCastle = false;
		}
	}
	
}

/**
 * Check if Player Me is in check
 * @return
 * boolean
 */
public boolean MeInCheck() {
	System.err.println("Am I in check? MeInCheck1");
	/**
	 * Iterate through all piece moves
	 * @author Maury Johnson
	 */
	/**
	 * See if ANY can attack king!
	 * @author Maury Johnson
	 */
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		/**System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %c^^^^^^^^^^^^\n",Opponent.Pieces.get(i).Piece);
		
		//Add all sets of possible moves to List
		 * @author Maury Johnson
		 */
		AddAllSets(R,Opponent.Pieces.get(i),false);
		
		/**Check if king is attacked
		 * 
		 * @author Maury Johnson
		 */
		if(KingAttacked(R)) {
			/**My King is attacked
			 * 
			 */
			System.err.printf("\n %c IS In Check MeInCheck2 \n PROOF:\n\n",Me.Player);
			Me.PrintBoard(this);
			//Opponent.PrintBoard(this);
			 //* * @author Maury Johnson
			 //*/			 
			return true;
		}
		/**
		 * THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
		 * @author Maury Johnson
		 */
	}
	
	/**
	*/
	System.err.printf("\n %c(Me) Not In Check Because of My move MeInCheck3 -- ctrl-f -> find next Restore\n PROOF:\n\n",Me.Player);
	Me.PrintBoard(this);
	//Opponent.PrintBoard(this);
	//Player Me is not in check, return false
	 // @author Maury Johnson
	 ///
	return false;	
}


/**
 * Check if opponent king is attacked given list of all positions that are attacked
 * @param R
 * Linked List of all moves
 * @return
 * boolean
 * @author Maury Johnson
 */
public boolean KingAttacked(LinkedList<int[]> R) {
	/**
	System.out.println("");
	@author Maury Johnson
	*/
	if(R==null) {
		return false;
	}
	
	// TODO Auto-generated method stub
	for(int i=0;i<R.size();i+=1) {
		if(R.get(i)==null) {
			continue;
		}
		/**
		if(R.get(i).length>=9) {
			continue;
		}
		@author Maury Johnson
		*/
		/**
		 * If Return status is valid IE a free area OR attacked area
		 * @author Maury Johnson
		 */
		if(R.get(i)[0]>=1 && R.get(i)[0]<=16) {
		
		/**
		 * Attacked position
		 * @author Maury Johnson	
		 */
		int[] Attack = {R.get(i)[1],R.get(i)[2]};
		
		/**method GetPiece
		 * Get piece that's attacked
		 * Piece attacked
		 * @author Maurt Johnson
		 */
		Piece Attacked = GetPiece(Attack);
		
		/**
		 * My Position
		 * @author Maury Johnson
		 */
		int [] MyPosition = new int[2];
		MyPosition[0]=R.get(i)[4];
		MyPosition[1]=R.get(i)[5];
		
		/**
		System.out.printf("Curr POSE AGAINN [%d,%d]", MyPosition[0],MyPosition[1]);
		@author Maury Johnson
		*/
		
		/**
		 * My Piece
		 * @author Maury Johnson
		 */
		Piece ME = GetPiece(MyPosition);
		
		/**
		 * Given a poor entry.. Nothing to worry about!!
		 * @author Maury Johnson
		 */
		if(ME==null) {
			/**
			System.out.printf("Error, my piece cannot be located @ [%d,%d]\n",MyPosition[0],MyPosition[1]);
			@author Maury Johnson
			*/
			continue;
		}
		
		/**
		 * IF Piece got is a king piece
		 * @author Maury Johnson
		 */
		if(Attacked instanceof King<?,?,?>) {
			/**
			 * If king got is not the opponent's king
			 * @author Maurt Johnson
			 */
			if(Attacked.Player!=Opponent.Player) {
				/**
				 * Opponent is attacking my king!
				 * @author Maury Johnson
				System.out.printf("\n%c%c is attacking %c king TO [%d,%d] KingAttacked1 \n",ME.Player,ME.Piece,Attacked.Player,Attacked.CurrentPosition[0],Attacked.CurrentPosition[1]);
				*/
				return true;
				}
			}
		
		}
		/**
		 * Not valid move from movesets
		 * @author Maury Johnson
		 */
		else {
			/**
			 * System.out.printf("King Attacked check Invalid move: [%d,%d] , STATUS:%d KingAttacked2 \n",R.get(i)[1],R.get(i)[2],R.get(i)[0]);
			 @author Maury Johnson
			 */
		}
		
	}
	
	/**
	 * Opponent's king is not attacked
	 * @author Maurt Johnson
	 
	System.out.println("Opponent King Not Attacked KingAttacked3");
	*/
	return false;
}

/**
 * Check if movement doesn't change check
 * @param R
 * Linked list of all returned status of tried moves
 * @return
 * boolean
 * @author Maury Johnson
 */
private boolean MoveStillCheck(LinkedList<int[]> R) {
	
	if(R==null) {
		return true;
	}
	/**
	 * Iterate through all movesets
	 * @author Maury Johnson
	 */
	for(int i=0;i<R.size();i+=1) {
		
		/**
		 * If moveset is null, continue
		 * @author Maury Johnson
		 */
		if(R.get(i)==null) {
			continue;
		}
		/**
		 * Don't want to include castling case, because ALREADY IN CHECK!
		 * @author Maury Johnson
		 */
		if(R.get(i).length>=9) {
			System.out.println("Already Checked");
			continue;
		}
		
		/**
		 * If move is valid
		 * @author Maury Johnson
		 */
		if(R.get(i)[0]>=1&&R.get(i)[0]<=16) {
			
			System.out.println("Board to look at");
			Opponent.PrintBoard(this);	
			
		/**
		 * My Position
		 */
		int[] MyPosition = {R.get(i)[4],R.get(i)[5]};
		
		/**
		 * Attacked Position
		 */
		int[] Attack = new int[R.get(i).length];
		for(int k=1;k<(R.get(i)).length;k+=1) {
			Attack[k-1]=R.get(i)[k];
		}
		
		/**My Piece
		 * 
		 * @author Maury Johnson
		 */
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
		
		/**
		 * There exists a piece to attack
		 * @author Maury Johnson
		 */
		if(AttackedPiece!=null) {
		
		
		/**
		 * Previous version
		//Set Board Attacked Position to MyType of Piece
		Opponent.Board=Opponent.CopyNewBoard(Attack[0],Attack[1],MyType);
		
		//Set Old Position to A Chess Space
		Opponent.Board=Opponent.CopyNewBoard(MyPosition[0],MyPosition[1],Opponent.WhichBlock(MyPosition[0],MyPosition[1]));

		//Set the memory of current position in Piece class to Attacked position
		MyPiece.CurrentPosition = Attack;
		
		//Set AttackedPiece Position to -1,-1, GONE
		int [] n = {-1,-1};
		AttackedPiece.CurrentPosition =n;
		@author Maury Johnson
		*/
			
		Attack(Opponent, MyType, MyPosition, MyPiece, AttackedPiece, Attack);
		
		/**
		 * Print Board after changes made
		 * @author Maury Johnson
		 */
		System.err.println("Board to look at MoveStillCheck1");
		Opponent.PrintBoard(this);
		
		/**
		 * IF after move opponent not in check
		 * @author Maury Johnson
		 */
		if(!OpponentInCheck()) {
			/**
			 * Found solution to get out of check
			 * @author Maury Johnson
			 */
			
			/**
			 * Restore original positions for MyPiece and AttackedPiece
			 * @author Maury Johnson
			 */
			Restore(Opponent, MyType, MyPosition, MyPiece, AttackedPiece, Attack);
			
			System.err.println("Board Restored And Can Get Out OF Check MoveStillCheck1");
			Opponent.PrintBoard(this);
			
			/**
			 * Found solution, king not still in check
			 * @author Maury Johnson
			 */
			return false;
		}
		else {
			/**
			 * Still in check, keep looking at each moveset for each piece
			 * @author Maury Johnson
			 */
			
			/**
			 * Restore previous board
			 * @author Maury Johnson
			 */
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

/**
 * After turn of next player done, loop through and remove piece status that just moved twice
 * @author Maury Johnson
 */
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

/**
 * Restore previous state of board
 * 
 * @param Opponent
 * Player object Opponent
 * @param OpponentType
 * Opponents piece type
 * @param MyPosition
 * Position of Mypiece
 * @param MyPiece
 * Piece object
 * @param AttackedPiece
 * Piece object AttackedPiece to restore if it exists
 * @param Attack
 * int[] position attacked
 */
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

/**
 *If not exists case when there is not a check mate for all opponent's piece moves, then opponent is in check mate 
 * @return
 * boolean
 *
@author Maury Johnson
*/
private boolean OpponentCheckMate() {
	System.out.println("Is Opponent in checkmate? OpponentCheckMate1");
	
	/**
	 * Iterate through all opponents moves, generate the new table, and check if
	 * @author Maury Johnson
	 */
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		/**
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %c^^^^^^^^^^^^\n",Opponent.Pieces.get(i).Piece);
		
		Add the movements of all moves for piece
		@author Maury Johnson
		*/
		AddAllSets(R,Opponent.Pieces.get(i),false);
		
		/**
		 * If movements gets out of check, found case to get out of check, return false.
		 * 
		 * @author Maury Johnson
		 */
		if(!MoveStillCheck(R)) {
			return false;
		}
		/**
		 * THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
		 * @author Maury Johnson
		 */
	}
	
	System.out.println("\nOpponent IS In CheckMate Because cannot find move to invalidate the check Opponent CheckMate3");
	//Checkmate if for all Pieces and moves for each of them, cannot find a case where one movement 
	//doesn't make king in check
	return true;	
}

/**
 * Add all possible movements for each piece
 * @param R
 * Linked list to store all piece all moves
 * @param P
 * Piece to move
 * @param InnerStack
 * Indicates of this method is called from a method that does not call this method again
 * @author Maury Johnson
 */
private void AddAllSets(LinkedList<int[]> R,Piece P,boolean InnerStack) {
			System.out.println("Add All Possible Movesets1");
	
			//IF Rooke
			if(P instanceof Rooke<?,?,?>) {
				
				/**Only run this if you are in inner stack, MeInCheck calls AddAllSets but so does function ApplyMove
				If both ran, infinite loop occurs
				In Piece abstract class
				 *@author Maury Johnson 
				 */
				
				if(InnerStack) {
				boolean Restore = ((Rooke<int[],int[],int[]>)P).CanCastle;
				R.add(((Rooke<int[],int[],int[]>)P).TryRookeLeftCastle());
				((Rooke<int[],int[],int[]>)P).CanCastle = Restore;
				//((Rooke<int[],int[],int[]>)P).CanCastle;
				R.add(((Rooke<int[],int[],int[]>)P).TryRookeRightCastle());
				((Rooke<int[],int[],int[]>)P).CanCastle = Restore;
				}
				
				for(int i=0;i<=7;i+=1)
				R.add(((Rooke<int[],int[],int[]>)P).TryUp(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Rooke<int[],int[],int[]>)P).TryDown(i));	
				
				for(int i=0;i<=7;i+=1)
				R.add(((Rooke<int[],int[],int[]>)P).TryLeft(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Rooke<int[],int[],int[]>)P).TryRight(i));
				
				//System.out.println("\nROOKE");
			}
			/**
			 * If Knight
			 * @author Maury Johnson
			 */
			else if(P instanceof Knight<?,?,?>) {
				
				R.add(((Knight<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((Knight<int[],int[],int[]>)P).TryUpLeft(0));	
				R.add(((Knight<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((Knight<int[],int[],int[]>)P).TryDownLeft(0));
				R.add(((Knight<int[],int[],int[]>)P).TryKnightRightUp());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightRightDown());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightLeftUp());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightLeftDown());
				
				//System.out.println("\nKNIGHT");
			}
			/**
			 * If Bishop
			 * @author Maury Johnson
			 */
			else if(P instanceof Bishop<?,?,?>) {
				
				for(int i=0;i<=7;i+=1)
				R.add(((Bishop<int[],int[],int[]>)P).TryUpRight(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Bishop<int[],int[],int[]>)P).TryUpLeft(i));	
				
				for(int i=0;i<=7;i+=1)
				R.add(((Bishop<int[],int[],int[]>)P).TryDownRight(i));
				
				for(int i=0;i<=7;i+=1)
				R.add(((Bishop<int[],int[],int[]>)P).TryDownLeft(i));
		
				//System.out.println("\nBISHOP");
			}
			/**
			 * If Queen
			 * @author Maury Johnson
			 */
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
				
		
				//System.out.println("\nQUEEN");
			}
			/**
			 * If King
			 * @author Maury Johnson
			 */
			else if(P instanceof King<?,?,?>) {
				
				R.add(((King<int[],int[],int[]>)P).TryUp(0));
				R.add(((King<int[],int[],int[]>)P).TryRight(0));	
				R.add(((King<int[],int[],int[]>)P).TryDown(0));
				R.add(((King<int[],int[],int[]>)P).TryLeft(0));

				R.add(((King<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((King<int[],int[],int[]>)P).TryUpLeft(0));	
				R.add(((King<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((King<int[],int[],int[]>)P).TryDownLeft(0));
		
				//System.out.println("\nKING");
			}
			/**
			 * If Pawn
			 * @author Maury Johnson
			 */
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
			
				//System.out.println("\nPAWN");
			}
			
			/**
			//System.out.printf("\nCurr Pose again: [%d,%d]\n",P.CurrentPosition[0], P.CurrentPosition[1]);
			
			System.out.println("Ends Adding All Possible Movesets2");
			@author Maury Johnson
			*/
}

/**
 * Check if opponent is in check
 * @return
 * boolean
 * @author Maury Johnson
 */
public boolean OpponentInCheck() {

	/**
	System.err.println("Is Opponent in check? OpponentInCheck1");
	@author Maury Johnson
	*/
	SwapPlayer();
	boolean OppInCheck = MeInCheck();
	
	if(OppInCheck) {
		/**
		System.err.println("Opponent in check OpponentInCheck2");
		@author Maury Johnson
		*/
	}
	else {
		/**
		 * 
		 
		System.err.println("Opponent Not in check OpponentInCheck3");
		@author Maury Johnson
		*/
	}
	/**@method SwapPlayer
	 * Swap player objects
	 * @author Maury Johnson
	 */
	SwapPlayer();
	/**
	 * return status of check of opponent
	 * @author Maury Johnson
	 */
	return OppInCheck;
}

}