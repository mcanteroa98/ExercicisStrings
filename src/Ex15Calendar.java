
import java.util.Calendar;

/*
15. Write a java program to print current date and time in the specified format.

Sample Output:

Current Date and Time :
June 19, 2017
3:13 pm
N.B. : The current date and time will change according to your system date and time.
 */

/**
 *
 * @author bataparato
 */
public class Ex15Calendar {
     public static void main(String[] args) { 
    Calendar c = Calendar.getInstance();
      System.out.println("Current Date and Time :"); 
      System.out.format("%tB %te, %tY%n", c, c, c);
      System.out.format("%tl:%tM %tp%n", c, c, c); 
   }
}
