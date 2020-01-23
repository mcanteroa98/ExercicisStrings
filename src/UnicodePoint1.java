/*
2. Write a Java program to get the character (Unicode code point) at the given index
within the String.

Sample Output:

Original String : w3resource.com
Character(unicode point) = 51
Character(unicode point) = 101

 */


/**
Encripta el char assignat
* str.codePointAt(1);
 */
public class UnicodePoint1 {
    public static void main(String[] args) {
        String frase = "Uep com anam";
        System.out.println(frase);
        
        int n1 = frase.codePointAt(1);
        int n2 = frase.codePointAt(5);
        
        System.out.println("La lletra '" + frase.charAt(1) + "' te l'unicode de " + n1);
        System.out.println("La lletra '" + frase.charAt(5) + "' te l'unicode de " + n2);
  }
}
