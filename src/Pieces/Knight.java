package Pieces;

import Main.*;
import Moves.*;

//Special unit, implements Four, but with the offeset associated with knight, which is
//Moving 2 units twice BEFORE implementing Right,Left for eight possible moves

//Special cases UpLeft, UpRight,DownLeft,DownRight
//Since have knight, will move twice then go, ignoring all pieces hopped over except for the final position

public class Knight<T,Q,R> extends Board implements KnightLeftDown<T,Q,R>,KnightLeftUp<T,Q,R>,KnightRightDown<T,Q,R>,KnightRightUp<T,Q,R>{
	//Position of piece, can be used to calculate where all pieces are on board
	int [] Position;
	
	@Override
	public R apply(T arg0, Q arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public R TryKnightRightUp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryKnightRightDown() {
		// TODO Auto-generated method stub
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