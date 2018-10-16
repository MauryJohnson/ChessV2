package Main;

import Pieces.*;

//"Piece_NAME" is part of package
//Handles both players Black and White
public class Player extends Board{
char Player;

Piece R;
Piece K;
Piece B;

public char[][] GetBoard(){
	return Board;
}


public Player(char Player) {
	this.Player = Player;
}

public void INIT() {
	R = new Rooke<int[],int[],int[][]>(Player);
	K = new Knight<int[],int[],int[][]>(Player);
	B = new Bishop<int[],int[],int[][]>(Player);
		
}

//Knight K<a,b,c>..
//...
//...


}
