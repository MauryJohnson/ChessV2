package Pieces;

import Moves.*;

public class Bishop<T,Q,R> extends Piece implements UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

	public Bishop(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}

	//Position of piece, can be used to calculate where all pieces are on board
	int [] Position;
	
	public static void main(String[] args) {
		
	}

	@Override
	public R apply(T arg0, Q arg1) {
		// TODO Auto-generated method stub
		return null;
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
