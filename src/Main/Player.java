package Main;

import Pieces.*;

//"Piece_NAME" is part of package
//Handles both players Black and White
public class Player extends Board{
char Player;

Piece[] Pieces;


public char[][] GetBoard(){
	return Board;
}


public Player(char Player) {
	this.Player = Player;
}

public void INIT() {
	//R = new Rooke<int[],int[],int[][]>(Player);
	//N = new Knight<int[],int[],int[][]>(Player);
	//B = new Bishop<int[],int[],int[][]>(Player);
	Piece[] P = {new Rooke<int[],int[],int[][]>(Player),
			new Knight<int[],int[],int[][]>(Player),
			new Bishop<int[],int[],int[][]>(Player)
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
	Pieces = P;
}

//Knight K<a,b,c>..
//...
//...


}
