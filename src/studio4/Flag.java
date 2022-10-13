package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setXscale(0,100);
		StdDraw.setYscale(0,100);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(50,50,50,30);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(50,72,5,5);
		StdDraw.filledRectangle(50,43,5,20);
	    
	}
}