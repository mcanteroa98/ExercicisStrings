/*
3. Write a Java program to get the character (Unicode code point) before the specified
index within the String.

Sample Output:

Original String : w3resource.com
Character(unicode point) = 119
Character(unicode point) = 99
 */


/**
 * 
El codePointBefore agafa el index anterior al marcat
* 
 */
public class Ex3CodePointBefore {
        public static void main(String[] args) {
        String frase = "Uep com anam";
        System.out.println(frase);
        
        int n1 = frase.codePointAt(1);
        int n2 = frase.codePointAt(5);
        
        int n3 = frase.codePointBefore(1);
        int n4 = frase.codePointBefore(5);
        
        System.out.println("La lletra '" + frase.charAt(1) + "' te l'unicode de " + n1);
        System.out.println("La lletra '" + frase.charAt(5) + "' te l'unicode de " + n2);
        
        System.out.println("La lletra '" + frase.charAt(0) + "' te l'unicode de " + n3);
        System.out.println("La lletra '" + frase.charAt(4) + "' te l'unicode de " + n4);
  }
}
