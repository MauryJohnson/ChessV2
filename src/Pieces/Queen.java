package Pieces;

import Moves.*;

public class Queen<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R>,UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	public Queen(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public R TryDownRight(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryDownLeft(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryUpRight(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryUpLeft(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryRight(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryLeft(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryDown(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R TryUp(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
