import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    ArrayList<Integer> numList = new ArrayList<Integer>(); //creates numlist which stores all the user inputs
     
     Scanner in = new Scanner(System.in);
     
     int num = 0;
     
     //loop to get input
        while (numoftimes > 0){
            num = in.nextInt();
            numoftimes -= 1;

            numList.add(num);
        }
	  
	int highest = 0;
        int mode = 0;
        for (int i = 0; i < numList.size(); i++)
	{
            int count = 0;

            for (int j=0; j < numList.size(); j++)
	    {
                if (numList.get(j) == numList.get(i))
		{
                    count += 1;
                }

                if (count > highest)
		{
                    highest = count;
                    mode = numList.get(i);
                }
            }
        }
     
     System.out.print(mode);
  }
}
