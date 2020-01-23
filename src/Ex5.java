/*
5. Write a java program to compare two strings lexicographically.

Sample Output:

String 1: This is Exercise 1
String 2: This is Exercise 2
"This is Exercise 1" is less than "This is Exercise 2"
 */

/**
 *
 * @author batman
 */
public class Ex5 {
    public static void main(String[] args) {
        String frase1 = "Hola 1";
        String frase2 = "Hola 1";
        
        int resultat = frase1.compareTo(frase2);
        
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
