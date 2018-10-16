package Pieces;

import Main.*;
import Moves.*;

public class Bishop<T,Q,R> extends Board implements UpLeft<T,Q,R>,UpRight<T,Q,R>,DownLeft<T,Q,R>,DownRight<T,Q,R>{

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
