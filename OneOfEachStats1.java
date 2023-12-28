/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]); 
		boolean boy = false;
		boolean girl = false;
		int twoChilds = 0 ;
		int threeChilds = 0 ;
		int fourPlusChilds = 0 ;
		double totalChilds = 0;
		int count = 0 ;
		for (int t = 0; t < T ; t++ ) 		
		{
			while (!girl || !boy)
			{
				//random number between 0 to 0.5 means a girl
				//random number between 0.5 to 1 means a boy
				if (Math.random() > 0.5) 
				{
					boy = true;
					count++ ;
					totalChilds++ ; 
				}
				else
				{
					girl = true;
					count++ ;
					totalChilds++ ; 
				}
			}
			if (count == 2)
				twoChilds++;
			else if (count == 3)	
				threeChilds++;
			else if (count > 3)
				fourPlusChilds++; 	
			boy = false;
			girl = false;
			count = 0;
		}	
		String mode = "";
		if ((fourPlusChilds > threeChilds) && (fourPlusChilds > twoChilds))
			mode = "4 or more.";
		else if(threeChilds > twoChilds)
			mode = "3.";
		else 
			mode = "2.";
		System.out.println("Average: " + (double)(totalChilds / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChilds);
		System.out.println("Number of families with 3 children: " + threeChilds);
		System.out.println("Number of families with 4 or more children: " + fourPlusChilds);
		System.out.println("The most common number of children is "+ mode);

	}
}
