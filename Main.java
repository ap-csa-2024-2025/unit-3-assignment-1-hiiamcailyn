import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(2, 4);
		Rectangle r2 = new Rectangle(4, 2);

		// Rotated if the length of 1 is equal to the width of 2 and vice versa
		boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth() == r2.getLength());

		// Congruent if they are either rotated, or exactly equal to each other; equals() from the Rectangle class will check
		// equality of rectangles for me
		boolean isCongruent = isRotated || r1.equals(r2);

		// Similar if they are either congruent, or if the ratio of the lengths is equal to the ratio of the widths
		boolean isSimilar = isCongruent || ( (r1.getLength() / r2.getLength()) == (r1.getWidth() / r2.getWidth()) ) ;
	}
}