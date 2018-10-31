package Main;

import Pieces.Piece;

/**
 * Class For Board
 * @author Maury Johnson
 *
 */
public class Board extends Game {
    /**
     *8 by 8 char board
     */
	public static char[][] Board = new char[8][8];
    
	/**
	 * Create the board
	 */
	public Board() {
		super(Me,Opponent);
		
		if(Board[0][0]!='\u0000') {
			//Board already Initialized... STATIC
			System.out.println("Already Initialized Board, Continue");
			return;
		}
		//Create new Board
		//Later on create Board of classes, each position either has a piece or does not
				//Each piece will be classified like this, each char pertains to a different type of piece. Char used to name a piece
		
				//*********** THIS IS RAW BOARD, NO PLAYERS IMPLEMENTED YET, SO THIS WILL REPRESENT THE BOARD WITHOUT PLAYERS
		
				char [] R1 = {'R','N','B','Q','K','B','N','R'};	
				char [] R2 = {'p','p','p','p','p','p','p','p'};	
				
				char [] R3 = {'p','p','p','p','p','p','p','p'};	
				char [] R4 = {'R','N','B','Q','K','B','N','R'};	
				
				char []RN1 = {' ','#',' ','#',' ','#',' ','#'};	
				char []RN2 = {'#',' ','#',' ','#',' ','#',' '};	
				
				System.out.printf("Board Rows Length:%d\n",Board.length);
				System.out.printf("Board Columns Length:%d\n",Board[0].length);
				//System.out.printf("Board outskirt Length:%d\n",Board[0][0].length);
				
				int i=0;
				
				for(i=0;i<Board.length;i++) {
					if(i==0) {
						Board[i]=R1;
					}
					
					else if(i==1) {
						Board[i]=R2;
					}
					
					else if(i==6) {
						Board[i]=R3;
					}
					
					else if(i==7) {
						Board[i]=R4;
					}else {
						if(i%2==0) {
						Board[i]=RN1;
						}
						else {
						Board[i] = RN2;
						}
					}
				}
	
	}
	/**
	 * Print the board
	 * @param G
	 * Given object game
	 */
	public static void PrintBoard(Game G) {
		System.out.println("___PRINT BOARD___");
		for(int i=0; i<Board.length;i+=1) {
			for(int j=0; j<Board[i].length;j+=1) {
				int [] Pose = {i,j};
				Piece p = G.GetPiece(Pose);
				if(p!=null)
				System.out.printf("%c%c ",Character.toLowerCase(p.Player),Board[i][j]);
				else
				System.out.printf("%c%c ", Board[i][j],Board[i][j]);
			}
				System.out.printf("%d",Board.length-i);
				System.out.println();
		}
		
		char[] abc = {'a','b','c','d','e','f','g','h'};
		
		for(int i=0; i<Board.length;i+=1) {
			System.out.printf(" %c ",abc[i]);
		}
		System.out.println();
	}
	/**
	 * Copy the board
	 * @param row
	 * ...
	 * @param column
	 * ...
	 * @return
	 * char[][]
	 */
	public char[][] CopyBoard(int row, int column){
		char [][]CP = new char[8][8];
		for(int i=0;i<Board.length;i+=1) {
			for(int j=0; j<Board[i].length;j+=1) {
				CP[i][j] = Board[i][j];
			}
		}
		return CP;
	}
	/**
	 * Copies new board with new position for type
	 * @param row
	 * Which row will receive the type
	 * @param column
	 * Which column will receive the type
	 * @param type
	 * Type to place on board
	 * @return
	 * new board char[][]
	 */
	public char[][] CopyNewBoard(int row, int column,char type){
		char [][]CP = new char[8][8];
		for(int i=0;i<Board.length;i+=1) {
			for(int j=0; j<Board[i].length;j+=1) {
				if(i==row && j==column) {
					CP[i][j]=type;
					continue;
				}
				CP[i][j] = Board[i][j];
			}
		}
		return CP;
	}
	
	/**
	 * Chooses which block to insert for a free space!
	 * @param i
	 * row
	 * @param j
	 * column
	 * @return
	 * char corresponding to the block on board
	 */
	public char WhichBlock(int i, int j) {
		// TODO Auto-generated method stub
		if(i%2==0) {
			//Even row
			if(j%2!=0) {
				//Even row, odd column
				return '#';
			}
			else {
				//Even row, even column
				return ' ';
			}
		}
		else {
			//Odd Row
			if(j%2!=0) {
				//Odd row, odd column
				return ' ';
			}
			else {
				//Odd row, even column
				return '#';
			}
			
		}
	}
	/**
	 * For Printing out Board
	 * @return
	 * String
	 */
	public String toString() {
		String s ="";
		int i = 0;
		int j = 0;
		for(i=0;i<Board.length;i+=1) {
			for(j=0;j<Board[i].length;j+=1) {
				s+=Board[i][j];
				s+=" ";
			}
			s+="\n";
		}
		return s;
	}
	
}
