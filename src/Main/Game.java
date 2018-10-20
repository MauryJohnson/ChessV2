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
	
	P1.PrintBoard(G);
	
	//Swap Player Test
	/*
	G.PrintPlayers();
	
	G.SwapPlayer();
	
	G.PrintPlayers();
	*/

	//////////
	int[] RET = {0};
	
	//G.SwapPlayer();
	
	//More advanced testing...
	//KNIGHT TRY MOVE TESTING ALL
	//PLAYER 2
	//G.ReturnStatusMove(((Knight<int[],int[],int[]>)P2.Pieces.get(1)).TryDownLeft());
	//G.Me.PrintBoard();
	
	/*
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryDownRight());
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryDownRight());
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryKnightRightDown());
	*/
	
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(9)).TryUp(1));
	G.SwapPlayer();
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryDown(1));
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryDown(0));
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryRight(0));
	G.FinishMoveTwice();
	
	//G.SwapPlayer();
	
	//G.FinishMoveTwice();
	
	/*
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryUp(1));
	G.ReturnStatusMove(((Pawn<int[],int[],int[]>)G.Me.Pieces.get(8)).TryRight(0));
	*/
	
	
	//G.Me.PrintBoard();
	
	//G.SwapPlayer();
	
	
	/*
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryUpRight());
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryUpRight());
	
	G.ReturnStatusMove(((Knight<int[],int[],int[]>)G.Me.Pieces.get(1)).TryKnightRightUp());
	*/
	
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
			int[] K = {R[1],R[2],R[3],R[4],R[5]};
			
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

//Destroy piece in board
private int KillPiece(int[] K) {
	// TODO Auto-generated method stub
	System.out.printf("Try Kill Piece in Position: [%d,%d] FROM: [%d,%d]\n",K[0],K[1],K[3],K[4]);
	//Iterate through all opponent's pieces
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		System.out.printf("IF [%d,%d] == [%d,%d]\n",K[0],K[1],Opponent.Pieces.get(i).CurrentPosition[0],Opponent.Pieces.get(i).CurrentPosition[1]);
		//If coordinate to kill piece matches a piece in opponent list
		if(K[0]==Opponent.Pieces.get(i).CurrentPosition[0] && K[1]==Opponent.Pieces.get(i).CurrentPosition[1]) {
			
			//Kill Opponent Piece Found
			System.out.printf("Kill Opponent Piece:%c @[%d,%d]",
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
			
			//Attack opponent piece	
			Attack(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
	
			//Check if this leads to a check on your end...
			if(MeInCheck()){
				System.out.println("Invalid Move, puts yourself in check, restoring original spot");
				
				//Restore Opponent piece and My Piece
				Restore(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
				
				//Return status -1 indicating invalid movement
				return -1;
			}
			
			else if(OpponentInCheck()){
				System.out.println("Opponent is in check");
				//Return status 1 indicating opponent is in check
				
				//If king or Rooke Moved, can no longer castle
				CastleCheck(MyPiece);				
				
				//IF pawn moved in first turn, this invalidates its option to move twice
				PawnFirstMoveCheck(MyPiece);
				
				return 1;
			}
			
				//IF pawn moved in first turn, this invalidates its option to move twice
				PawnFirstMoveCheck(MyPiece);
				
				//If king or Rooke Moved, can no longer castle
				CastleCheck(MyPiece);
				
			}//End case MyPiece Found
			//My Piece not found
			else {
				System.out.println("ERROR, MY PIECE NOT FOUND");
				System.exit(-1);
			}
		
		}//End case kill
	}//End For
	
	System.out.println("\n Found Free Space #/' '");
	
	//Set My Position
	int [] MyPosition = {K[3],K[4]};
	Piece MyPiece = GetPiece(MyPosition);
	//My Type
	char MyType = MyPiece.Piece;
	//Attack this position
	int []Attack = {K[0],K[1]};
	//No Piece to attack, no piece found to attack in that position
	Piece AttackedPiece=null;
	
	//My Piece exists
	if(MyPiece!=null) {
	
	//Traverse to the empty position
	Attack(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
	
	//Check if this leads to a check on your end...
	if(MeInCheck()){
		System.out.println("Invalid Move, puts yourself in check");
		
		//Restore old positions board and MyPiece
		Restore(Me,MyType,MyPosition,MyPiece,AttackedPiece,Attack);
		
		return -1;
	}
	
	//If opponent is in check because of my move
	else if(OpponentInCheck()){
		System.out.println("Opponent is in check");
		//Return status 1 indicating opponent is in check
		
		//IF pawn moved in first turn, this invalidates its option to move twice
		PawnFirstMoveCheck(MyPiece);
		
		//If king or Rooke Moved, can no longer castle
		CastleCheck(MyPiece);
		
		return 1;
	}
	
	//IF pawn moved in first turn, this invalidates its option to move twice
	PawnFirstMoveCheck(MyPiece);
	
	//If king or Rooke Moved, can no longer castle
	CastleCheck(MyPiece);
	
	}
	//My Piece not found
	else {
		System.out.println("ERROR, MY PIECE NOT FOUND");
		System.exit(-1);
	}
	
	return 0;
	
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
private boolean MeInCheck() {
	System.out.println("Am I in check?");
	//Iterate through all piece moves
	//See if ANY can attack king!
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %c^^^^^^^^^^^^\n",Opponent.Pieces.get(i).Piece);
		
		//Add all sets of possible moves to List
		AddAllSets(R,Opponent.Pieces.get(i));
		//Check if king is attacked
		if(KingAttacked(R)) {
			//My King is attacked
			return true;
		}
		//THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
	}
	
	System.out.printf("\n %c(Me) Not In Check Because of My move \n",Me.Player);
	//Player Me is not in check
	return false;	
}


//Check if king is attacked given list of all positions that are attacked
private boolean KingAttacked(LinkedList<int[]> R) {
	
	System.out.println("");
	
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
		
		//Attacked position	
		int[] Attack = {R.get(i)[1],R.get(i)[2]};
		
		//Piece attacked
		Piece Attacked = GetPiece(Attack);
		
		//My Position
		int [] MyPosition = {R.get(i)[4],R.get(i)[5]};
		//My Piece
		Piece ME = GetPiece(MyPosition);
		
		//IF Piece got is a king piece
		if(Attacked instanceof King<?,?,?>) {
			//If king got is not the opponent's king
			if(Attacked.Player!=Opponent.Player) {
				//Opponent is attacking my king!
				System.out.printf("\n%c is attacking %c king TO [%d,%d]\n",ME.Player,Attacked.Player,Attacked.CurrentPosition[0],Attacked.CurrentPosition[1]);
				return true;
				}
			}
		
		}
		//Not valid move from movesets
		else {
			System.out.printf("King Attacked check Invalid move: [%d,%d] , STATUS:%d\n",R.get(i)[1],R.get(i)[2],R.get(i)[0]);
		}
		
	}
	//Opponent's king is not attacked
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
		//If move is valid
		if(R.get(i)[0]>=1&&R.get(i)[0]<=16) {
			/*
			System.out.println("Board to look at");
			Opponent.PrintBoard();	
			*/
		//My Position
		int[] MyPosition = {R.get(i)[4],R.get(i)[5]};
		//Attacked Position
		int[] Attack = {R.get(i)[1],R.get(i)[2]};
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
		
		//Set Board Attacked Position to MyType of Piece
		Opponent.Board=Opponent.CopyNewBoard(Attack[0],Attack[1],MyType);
		
		//Set Old Position to A Chess Space
		Opponent.Board=Opponent.CopyNewBoard(MyPosition[0],MyPosition[1],Opponent.WhichBlock(MyPosition[0],MyPosition[1]));

		//Set the memory of current position in Piece class to Attacked position
		MyPiece.CurrentPosition = Attack;
		
		//Set AttackedPiece Position to -1,-1, GONE
		int [] n = {-1,-1};
		AttackedPiece.CurrentPosition =n;
		
		//Print Board after changes made
		System.out.println("Board to look at");
		Opponent.PrintBoard(this);
		
		//If, after changes made, opponent is not in check
		if(!OpponentInCheck()) {
			//Found solution to get out of check
			
			//Restore original positions for MyPiece and AttackedPiece
			Restore(Opponent, MyType, MyPosition, MyPiece, AttackedPiece, Attack);
			System.out.println("Board Restored");
			Opponent.PrintBoard(this);
			
			//Found solution, king not still in check
			return false;
		}
		else {
			//Still in check, keep looking at each moveset for each piece
			
			//Restore previous board
			Restore(Opponent, MyType, MyPosition, MyPiece,AttackedPiece, Attack);
			System.out.println("Board Restored");
			Opponent.PrintBoard(this);
			
		}

		}
		
		//Movement to free space
		else {
			//Traverse to free space
			Attack(Opponent, MyType, MyPosition, MyPiece, AttackedPiece, Attack);
			
			//Print the new board
			System.out.println("Board to look at");
			Opponent.PrintBoard(this);
			
			//Movement to free space succeeds
			if(!OpponentInCheck()) {
				//Restore(Opponent,MyType,MyPosition,A)
				//Restore previous board
				Restore(Opponent, MyType, MyPosition, MyPiece,AttackedPiece, Attack);
				System.out.println("Board Restored");
				Opponent.PrintBoard(this);
				//Found case where can get out of check
				return false;
			}
			//Movement to free space fails. Have not found case where out of check 
			else {
				//Restore previous board
				Restore(Opponent, MyType, MyPosition, MyPiece, AttackedPiece, Attack);
				System.out.println("Board Restored");
				Opponent.PrintBoard(this);
			}
		
		}
		
		
		}
		//An invalid movement caught
		else {
			
			System.out.printf("Invalid return type for movement:%d\n",i);	
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
			if(((Pawn<int[],int[],int[]>)Me.Pieces.get(i)).JustMovedTwice) {
				System.out.printf("Pawn for %c Just moved twice, revert to norm",Opponent.Player);
			((Pawn<int[],int[],int[]>)Opponent.Pieces.get(i)).JustMovedTwice = false;
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
	System.out.println("Is Opponent in checkmate?");
	//Iterate through all opponents moves, generate the new table, and check if
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %c^^^^^^^^^^^^\n",Opponent.Pieces.get(i).Piece);
		
		//Add the movements of all moves for piece
		AddAllSets(R,Opponent.Pieces.get(i));
		
		//If movements gets out of check, found case, return false.
		if(!MoveStillCheck(R)) {
			return false;
		}
		//THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
	}
	
	System.out.println("\nOpponent IS In CheckMate Because cannot find move to invalidate the check");
	//Checkmate if for all Pieces and moves for each of them, cannot find a case where one movement 
	//doesn't make king in check
	return true;	
}

//Add all possible movements for each piece
private void AddAllSets(LinkedList<int[]> R,Piece P) {
			//IF Rooke
			if(P instanceof Rooke<?,?,?>) {
				R.add(((Rooke<int[],int[],int[]>)P).TryUp(0));
				R.add(((Rooke<int[],int[],int[]>)P).TryDown(0));	
				R.add(((Rooke<int[],int[],int[]>)P).TryLeft(0));
				R.add(((Rooke<int[],int[],int[]>)P).TryRight(0));
			}
			//If Knight
			if(P instanceof Knight<?,?,?>) {
				
				R.add(((Knight<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((Knight<int[],int[],int[]>)P).TryUpLeft(0));	
				R.add(((Knight<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((Knight<int[],int[],int[]>)P).TryDownLeft(0));
				R.add(((Knight<int[],int[],int[]>)P).TryKnightRightUp());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightRightDown());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightLeftUp());
				R.add(((Knight<int[],int[],int[]>)P).TryKnightLeftDown());
				
				
			}
			//If Bishop
			if(P instanceof Bishop<?,?,?>) {
				
				R.add(((Bishop<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((Bishop<int[],int[],int[]>)P).TryUpLeft(0));	
				R.add(((Bishop<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((Bishop<int[],int[],int[]>)P).TryDownLeft(0));
		
				
			}
			//If Queen
			if(P instanceof Queen<?,?,?>) {
				R.add(((Queen<int[],int[],int[]>)P).TryUp(0));
				R.add(((Queen<int[],int[],int[]>)P).TryRight(0));	
				R.add(((Queen<int[],int[],int[]>)P).TryDown(0));
				R.add(((Queen<int[],int[],int[]>)P).TryLeft(0));

				R.add(((Queen<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((Queen<int[],int[],int[]>)P).TryUpLeft(0));	
				R.add(((Queen<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((Queen<int[],int[],int[]>)P).TryDownLeft(0));
		
			}
			//If King
			if(P instanceof King<?,?,?>) {
				
				R.add(((King<int[],int[],int[]>)P).TryUp(0));
				R.add(((King<int[],int[],int[]>)P).TryRight(0));	
				R.add(((King<int[],int[],int[]>)P).TryDown(0));
				R.add(((King<int[],int[],int[]>)P).TryLeft(0));

				R.add(((King<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((King<int[],int[],int[]>)P).TryUpLeft(0));	
				R.add(((King<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((King<int[],int[],int[]>)P).TryDownLeft(0));
		
				
			}
			//If Pawn
			if(P instanceof Pawn<?,?,?>) {
				
				R.add(((Pawn<int[],int[],int[]>)P).TryUp(0));
				R.add(((Pawn<int[],int[],int[]>)P).TryDown(0));
				R.add(((Pawn<int[],int[],int[]>)P).TryUpRight(0));
				R.add(((Pawn<int[],int[],int[]>)P).TryUpLeft(0));	
				
				R.add(((Pawn<int[],int[],int[]>)P).TryDownRight(0));
				R.add(((Pawn<int[],int[],int[]>)P).TryDownLeft(0));	
			
			}
}

//Check if opponent is in check
private boolean OpponentInCheck() {
	
	//Swap player, opponent is now me, me is now opponent
	SwapPlayer();
	
	System.out.println("Is Opponent in check?");
	//Iterate through all piece moves
	//See if ANY can attack king!
	//Iterate through opponent's pieces
	for(int i=0;i<Opponent.Pieces.size();i+=1) {
		LinkedList<int[]> R = new LinkedList<int[]>();
		System.out.printf("\n\n^^^^^^^^^^^^CHECK TEST PIECE %d^^^^^^^^^^^^\n",i);
		//Add all sets of moves from piece depending on type
		AddAllSets(R,Opponent.Pieces.get(i));
		//Check if king is attacked given sets of moves
		if(KingAttacked(R)) {
			//Swap back to original players
			SwapPlayer();
			return true;
		}
		//THEN HANDLE EVERY TRY MOVE FOR EACH, see if they hit king's Position
	}
	
	
	//Opponent is not n check
	System.out.printf("\n %c Not In Check Because of %c move \n",Me.Player,Opponent.Player);
	
	//Swap back to original players
	SwapPlayer();
	return false;	
}

}