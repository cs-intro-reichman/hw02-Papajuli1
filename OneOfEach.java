
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int count = 0;
		boolean boy = false;
		boolean girl = false;
		while(!girl || !boy)
		{
			//random number between 0 to 0.5 means a girl
			//random number between 0.5 to 1 means a boy
			if(Math.random() > 0.5) 
			{
				boy = true;
				System.out.print("b ");
			}
			else
			{
				girl = true;
				System.out.print("g ");
			}
			count++;
		}	
		System.out.println("You made it... and you have " + count + " children");

	}
}
