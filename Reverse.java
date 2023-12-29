/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		for (int i = ( s.length() - 1 ) ; i >= 0 ; i-- ) {
			System.out.print(s.charAt(i));			
		}
		System.out.println();
		int middleindex = ( s.length() - 1 ) / 2; 
		char middlechar = s.charAt(middleindex);
		System.out.println( "The middle character is " + middlechar);
		
	}
}
