package Pieces;

import Moves.*;

public class Rooke<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R> {
	
	public Rooke(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
	}

	//Position of piece, can be used to calculate where all pieces are on board
	int [] Position;
	
	//Test Rooke
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rooke<int[],int[],int[][]> R = new Rooke<int[],int[],int[][]>();
		
	}

	@Override
	public R apply(T Start_Position, Q End_Position) {
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
