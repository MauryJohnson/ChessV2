package Main;

public class Board extends Game {
    
	public static char[][] Board = new char[8][8];
    
	//
	public Board() {
		if(Board[0][0]!='\u0000') {
			//Board already Initialized... STATIC
			System.out.println("Already Initialized Board, Continue");
			return;
		}
		//Create new Board
		//Later on create Board of classes, each position either has a piece or does not
				//Each piece will be classified like this, each char pertains to a different type of piece. Char used to name a piece
		
				//*********** THIS IS RAW BOARD, NO PLAYERS IMPLEMENTED YET, SO THIS WILL REPRESENT THE BOARD WITHOUT PLAYERS
		
				char [] R1 = {'r','N','b','Q','K','b','N','r'};	
				char [] R2 = {'p','p','p','p','p','p','p','p'};	
				
				char [] R3 = {'p','p','p','p','p','p','p','p'};	
				char [] R4 = {'r','N','b','Q','K','b','N','r'};	
				
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
	
	public static void PrintBoard() {
		for(int i=0; i<Board.length;i+=1) {
			for(int j=0; j<Board[i].length;j+=1) {
				System.out.printf("%c",Board[i][j]);
			}
				System.out.println();
		}
		
	}
	
	//For Printing out Board
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
