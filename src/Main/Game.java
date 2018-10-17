package Main;

import Pieces.*;

//When Game class created, game is started
public class Game {
public static void main(String[] args) {
	//This creates a board [8][8]
	Board B = new Board();
	//B.Board[7][7] = 'O';
	///System.out.println(B);
	//TTTTT
	
	Player P1 = new Player('B');
	P1.INIT();
	//Piece K = new Knight<int[],int[],int[][]>('W');
	/*
	System.out.println(K.GetBoard());
	*/
	P1.Board[7][7] = 'O';
	P1.K.ApplyMove(new int[2]);
	
}


	
	
}

