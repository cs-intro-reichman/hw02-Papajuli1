/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		System.out.print(x);
		while (y >= x)
		{
			System.out.print(" " + y);
			x = y;
			y = (int) (Math.random() * 10);
		}
	}
}
