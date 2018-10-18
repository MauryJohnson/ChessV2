package Pieces;

import Moves.*;

public class King<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R>,UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	public King(char Player) {
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
