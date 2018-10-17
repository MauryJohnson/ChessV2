package Pieces;

import Main.*;

public abstract class Piece extends Player {

	//Have to know what player piece has
	char Player;
	//Have to have current position of piece
	int[] CurrentPosition = new int[2];

	//Constructs Player IF YOU EVER CREATED PIECE W/O PLAYER
	public Piece(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}
	
	public void SetPlayer(char c) {
		this.Player = c;
	}
	
	public int ApplyMove(int[] P2) {
		//Bounds check
		if(P2[0]<0||P2[0]>7||P2[1]<0||P2[1]>7) {
			System.out.println("Position out of bounds");
			return -1;
		}
		//Collision check Enemy
		char OOO = GetBoard()[7][7];
		
		//Board B;
		
		//System.out.println(B);
		
		System.out.printf("\nIS OO THERE?? -> %c\n", OOO);
		
		//Collisin check Ally

		return Player;
	}
	
}
