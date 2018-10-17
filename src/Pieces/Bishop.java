package Pieces;

import Moves.*;

public class Bishop<T,Q,R> extends Piece implements UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	//IF EVER IF EVER THAT THIS IS CREATED WITHOUT PIECE CREATED, INITIALIZE PIECE CLASS
	public Bishop(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public R TryDownRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryDownLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryUpRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryUpLeft() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
