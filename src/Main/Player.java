package Main;

import java.util.LinkedList;

import Pieces.*;

//"Piece_NAME" is part of package
//Handles both players Black and White
public class Player extends Board{
char Player;
//LinkedList of Pieces
public LinkedList<Piece> Pieces = new LinkedList<Piece>();

public char[][] GetBoard(){
	return Board;
}

public Player(char Player) {
	this.Player = Player;
}

public  void INIT() {
	//LinkedList<Piece> P;
	
	 LinkedList<Piece> P = new LinkedList<Piece>();
	    P.add(new Rooke<int[],int[],int[]>(Player));
	    P.add(new Knight<int[],int[],int[]>(Player));
	    P.add(new Bishop<int[],int[],int[]>(Player));
		P.add(new Queen <int[],int[],int[]>(Player));
		P.add(new King <int[],int[],int[]>(Player));
		
		P.add(new Bishop<int[],int[],int[]>(Player));
		P.add(new Knight<int[],int[],int[]>(Player));
		P.add(new Rooke<int[],int[],int[]>(Player));
		
		
		P.add(new Pawn<int[],int[],int[]>(Player));
		P.add(new Pawn<int[],int[],int[]>(Player));
		P.add(new Pawn<int[],int[],int[]>(Player));
		P.add(new Pawn<int[],int[],int[]>(Player));
		P.add(new Pawn<int[],int[],int[]>(Player));
		P.add(new Pawn<int[],int[],int[]>(Player));
		P.add(new Pawn<int[],int[],int[]>(Player));
		P.add(new Pawn<int[],int[],int[]>(Player));
		
		
		
		/* ADD MORE PIECES LATER */
	//Set correct player for piece
	//P[i].Pieces = P;
	//int k=0;
	for(int i=0;i<P.size();i+=1) {
		P.get(i).SetPlayer(Player);
		P.get(i).Pieces = P;
		
		//////////////////////////////////// LINKED LIST OF PIECES!!! IMPORTANT!!!!!!!
		this.Pieces.add(P.get(i));
		////////////////////////////////////
		if(Player == 'B') {
		if(i<=7) {

		System.out.printf("Set Piece %d Position to: [%d,%d]\n",i,0,i);	
		P.get(i).CurrentPosition[0] = 0;
		P.get(i).CurrentPosition[1] = i;
		P.get(i).SetPiece(Board[0][i]);
		}
		else {

			System.out.printf("Set Piece %d Position to: [%d,%d]\n",i,1,Math.abs(i-P.size()+8));	
		P.get(i).CurrentPosition[0] = 1;
		P.get(i).CurrentPosition[1] = Math.abs(i-P.size()+8);
		P.get(i).SetPiece(Board[1][(i-P.size())+8]);
		}
		}
		
		else {
		if(i<=7) {
			System.out.printf("Set Piece %d Position to: [%d,%d]\n",i,7,i);	
		P.get(i).CurrentPosition[0] = 7;
		P.get(i).CurrentPosition[1] = i;
		P.get(i).SetPiece(Board[7][i]);
		}
		else {

			System.out.printf("Set Piece %d Position to: [%d,%d]\n",i,6,Math.abs((i-P.size())+8));	
		P.get(i).CurrentPosition[0] = 6;
		P.get(i).CurrentPosition[1] = Math.abs(i-P.size()+8);
		P.get(i).SetPiece(Board[6][(i-P.size())+8]);
		}
		
		}
	}
	System.out.println();
}
}
