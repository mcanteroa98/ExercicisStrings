
import java.util.Scanner;

/*
12. Write a Java program to check whether a given string ends with the contents of another string.

Sample Output:

"Python Exercises" ends with "se"? false
"Python Exercise" ends with "se"? true
 */

/**
 *
 * @author bataparato
 */
public class Ex12endsWith {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str1, str2Com;
        
        System.out.println("Escribe una frase");
        str1 = sc.nextLine();
        System.out.println("En que letras quieres comprovar que termine");
        str2Com = sc.nextLine();
        
        boolean ends = str1.endsWith(str2Com);
        
        System.out.println(" '" + str1 + "' termina en '" + str2Com + "' ?");
        System.out.println(ends);
         
    }
}
