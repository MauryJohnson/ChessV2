package Pieces;

import Moves.*;

//Special unit, implements Four, but with the offeset associated with knight, which is
//Moving 2 units twice BEFORE implementing Right,Left for eight possible moves

//Special cases UpLeft, UpRight,DownLeft,DownRight
//Since have knight, will move twice then go, ignoring all pieces hopped over except for the final position

public class Knight<T,Q,R> extends Piece implements KnightLeftDown<T,Q,R>,KnightLeftUp<T,Q,R>,KnightRightDown<T,Q,R>,KnightRightUp<T,Q,R>{
	
	//IF EVER IF EVER THAT THIS IS CREATED WITHOUT PIECE CREATED, INITIALIZE PIECE CLASS
	public Knight(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public R TryKnightRightUp() {
		// TODO Auto-generated method stub
		//Create Position that will be knight right right up
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+2;
		P[1] = CurrentPosition[1]+1;
		
		ApplyMove(P);
		return null;
	}

	@Override
	public R TryKnightRightDown() {
		// TODO Auto-generated method stub
		int[] P = new int[2];
		
		P[0] = CurrentPosition[0]+2;
		P[1] = CurrentPosition[1]+1;
		
		ApplyMove(P);
		return null;
	}

	@Override
	public R TryKnightLeftUp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryKnightLeftDown() {
		// TODO Auto-generated method stub
		return null;
	}

}