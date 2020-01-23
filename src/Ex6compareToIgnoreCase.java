/*
6. Write a java program to compare two strings lexicographically, ignoring case
differences.

Sample Output:

String 1: This is exercise 1
String 2: This is Exercise 1

"This is exercise 1" is equal to "This is Exercise 1"
 */

/**
 *
 * @author batman
 */
public class Ex6compareToIgnoreCase {
        public static void main(String[] args) {
        String frase1 = "Hola 1";
        String frase2 = "Hola 2";
        
        int resultat = frase1.compareToIgnoreCase(frase2);
        
        if (resultat == 0){
            System.out.println("Son iguals");
        }else{
        if (resultat < 0){
            System.out.println("La frase 1 es menor que la frase 2");
        }
        else{
            System.out.println("La frase 1 es major que la frase 2");
        }
        }
    }
}
