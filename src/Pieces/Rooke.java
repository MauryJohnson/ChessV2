package Pieces;

import Moves.*;

public class Rooke<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R> {
	
	//Can castle initially
	public boolean CanCastle=true;
	
	//IF EVER IF EVER THAT THIS IS CREATED WITHOUT PIECE CREATED, INITIALIZE PIECE CLASS
	public Rooke(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public R TryRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryDown() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryUp() {
		// TODO Auto-generated method stub
		return null;
	}

}
