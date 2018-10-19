package Pieces;

import Moves.*;

public class Rooke<T,Q,R> extends Piece implements Up<T,Q,R>,Down<T,Q,R>,Left<T,Q,R>,Right<T,Q,R>,RookeRightCastle<T,Q,R>,RookeLeftCastle<T,Q,R> {
	
	//Can castle initially
	public boolean CanCastle=true;
	
	//IF EVER IF EVER THAT THIS IS CREATED WITHOUT PIECE CREATED, INITIALIZE PIECE CLASS
	public Rooke(char Player) {
		super(Player);
		// TODO Auto-generated constructor stub
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

	@Override
	public R TryRookeLeftCastle() {
		// TODO Auto-generated method stub
		//Check if this piece can castle
		if(!CanCastle) {
			System.out.printf("\nThis Rooke cannot castle @ [%d,%d]\n",super.CurrentPosition[0],super.CurrentPosition[1]);
			return null;
		}
		
		
		return null;
	}

	@Override
	public R TryRookeRightCastle() {
		// TODO Auto-generated method stub
		//Check if this piece can castle
		if(!CanCastle) {
			System.out.printf("\nThis Rooke cannot castle @ [%d,%d]\n",super.CurrentPosition[0],super.CurrentPosition[1]);
			return null;
		}
		
		return null;
	}

}
