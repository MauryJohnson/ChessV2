package Main;

import Pieces.*;

//"Piece_NAME" is part of package
//Handles both players Black and White
public class Player extends Board{
char Player;

public Piece[] Pieces;

public char[][] GetBoard(){
	return Board;
}

public Player(char Player) {
	this.Player = Player;
}

public  void INIT() {
	//R = new Rooke<int[],int[],int[][]>(Player);
	//N = new Knight<int[],int[],int[][]>(Player);
	//B = new Bishop<int[],int[],int[][]>(Player);
	Piece [] P;
	if(Player=='W') {
	 Piece[] P2 = {new Rooke<int[],int[],int[]>(Player),
			new Knight<int[],int[],int[]>(Player),
			new Bishop<int[],int[],int[]>(Player)
			//
			//
			//
			//
			//
			//
			//
			//
			//
			//
			//
			//
			//
			//
			//
			/* ADD MORE PIECES LATER */};
	P = P2;
	}
	else {
		 Piece[] P2 = {new Rooke<int[],int[],int[]>(Player),
					new Knight<int[],int[],int[]>(Player),
					new Bishop<int[],int[],int[]>(Player)
					//
					//
					//
					//
					//
					//
					//
					//
					//
					//
					//
					//
					//
					//
					//
					/* ADD MORE PIECES LATER */};	
	P = P2;	
	}
	
	//P =P2;
	//Set correct player for piece
	//P[i].Pieces = P;
	for(int i=0;i<P.length;i+=1) {
		P[i].SetPlayer(Player);
		P[i].Pieces = P;
		if(Player == 'B') {
		if(i<=7) {

			System.out.printf("Set Piece %d Position to: [%d,%d]",i,0,i);	
		P[i].CurrentPosition[0] = 0;
		P[i].CurrentPosition[1] = i;
		}
		else {

			System.out.printf("Set Piece %d Position to: [%d,%d]",i,1,i);	
		P[i].CurrentPosition[0] = 1;
		P[i].CurrentPosition[1] = i;	
		}
		}
		
		else {
		if(i<=7) {
			System.out.printf("Set Piece %d Position to: [%d,%d]",i,7,i);	
		P[i].CurrentPosition[0] = 7;
		P[i].CurrentPosition[1] = i;
		}
		else {

			System.out.printf("Set Piece %d Position to: [%d,%d]",i,6,i);	
		P[i].CurrentPosition[0] = 6;
		P[i].CurrentPosition[1] = i;
		}
		
		}
	}
	this.Pieces = P;
}

//Knight K<a,b,c>..
//...
//...


}
