package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//The Kinght must move/attack by moving two squares in any horizontal or vertical fashion followed by one square to the left or right thus making an L shape
//the knight is the only piece that is able to move/attack regardless of pieces in its way.

public class Knight extends ChessPiece {

	public Knight(int color, ChessBoard cb) {
		super(color,cb);
		if (getColor() == ChessPiece.BLACK) {
			image = new BitmapDrawable( 
					BitmapFactory.decodeResource(cb.getView().getResources(),
							R.drawable.black_knight)
						);
		}
		else if (getColor() == ChessPiece.WHITE) {
			image = new BitmapDrawable( 
					BitmapFactory.decodeResource(cb.getView().getResources(),
							R.drawable.white_knight)
					);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}
