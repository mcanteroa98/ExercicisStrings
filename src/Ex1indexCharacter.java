/*
1. Write a Java program to get the character at the given index within the String.
Sample Output:

Original String = Java Exercises!

The character at position 0 is J
The character at position 10 is i

https://javadesdecero.es/clases/string/ 
 */


import java.util.Scanner;

/**
 *
 * @author batman
 */
public class Ex1indexCharacter {
    char SacarLetra (int j, String frase){
        char letra;
        letra = frase.charAt(j);
        return letra;
    }
    public static void main(String[] args) {
        
        String frase = "La caracola que mola";
        int n;
        char respuesta;
         
        System.out.println(frase);
        System.out.println(" ");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero del indice");
        n = sc.nextInt();
        
        Ex1indexCharacter ob = new Ex1indexCharacter();
        
        respuesta = ob.SacarLetra(n, frase);
        System.out.println("The character at position " + n +  " is " + respuesta);
        
    }
}
