package Main;

import Pieces.*;

//When Game class created, game is started
//GAME CONTROLS PLAYERS,PIECES,BOARD,..
public class Game {
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
	P2.Pieces[1].ApplyMove(new int[2]);
	P2.Board[7][7] = 'N';
	P1.Pieces[1].ApplyMove(new int[2]);
	P1.Board[7][7] = 'P';
	P2.Pieces[0].ApplyMove(new int[2]);
	//////////////////////////
	
	P1.Board[7][7] = 'Y';
	
	//More advanced testing...
	((Knight<int[],int[],int[][]>)P2.Pieces[1]).TryKnightRightUp();
	P1.Board[7][7] = 'Z';
	((Bishop<int[],int[],int[][]>)P2.Pieces[2]).TryDownLeft();
	/////////////////////////
	
}

}

