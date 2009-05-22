package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//the rook may move or attack any distance in either a vertical or horizontal line
//see king for rules about rook castling

public class Rook extends ChessPiece {

	public Rook(int color, ChessBoard cb) {
		super(color,cb);
		if (getColor() == ChessPiece.BLACK) {
			loadImage(R.drawable.black_rook);
		}
		else if (getColor() == ChessPiece.WHITE) {
			loadImage(R.drawable.white_rook);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> moves = new ArrayList<Location>();
		Location loc = getLoc();
		for (int index=0; index < 8; index++)
		{
			if ( loc.getSpaceInDir(loc, 0).isValid() ){
				moves.add(loc.getSpaceInDir(loc, 0));
			}
			loc = loc.getSpaceInDir(loc, 0);
		}
		for (int index=0; index < 8; index++)
		{
			if ( loc.getSpaceInDir(loc, 2).isValid() ){
				moves.add(loc.getSpaceInDir(loc, 2));
			}
			loc = loc.getSpaceInDir(loc, 2);
		}
		for (int index=0; index < 8; index++)
		{
			if ( loc.getSpaceInDir(loc, 4).isValid() ){
				moves.add(loc.getSpaceInDir(loc, 4));
			}
			loc = loc.getSpaceInDir(loc, 4);
		}
		for (int index=0; index < 8; index++)
		{
			if ( loc.getSpaceInDir(loc, 6).isValid() ){
				moves.add(loc.getSpaceInDir(loc, 6));
			}
			loc = loc.getSpaceInDir(loc, 6);
		}
		return moves;
	}

}
