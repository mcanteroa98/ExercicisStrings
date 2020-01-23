
import java.util.Scanner;

/*
9. Write a Java program to compare a given string to the specified character sequence.

Sample Output:

Comparing example.com and example.com: true
Comparing Example.com and example.com: false
 */

/**
 *
 * @author batman
 */
public class Ex9 {
        public static void main (String[] args){
        boolean r = false;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe la primera frase: ");
        String cadenaDondeBuscar = sc.nextLine();
        System.out.print("Escribe la segunda frase: ");
        String loQueQuieroBuscar = sc.nextLine();
        
        String[] palabras = loQueQuieroBuscar.split("\\s");
        
        for (String palabra : palabras) {
            
            if (cadenaDondeBuscar.contains(palabra)) {
            r = true;
            }
        }
        System.out.println(r);
    }
}
