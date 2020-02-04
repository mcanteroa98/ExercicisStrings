/*
27. Write a Java program to get a substring of a given string between two specified positions.
Sample Output:
old = The quick brown fox jumps over the lazy dog.
new = brown fox jumps
 */

/**
 *
 * @author bataparato
 */
public class Ex27CogerCadenaDefinida {
    
    public static void main(String[] args) {
        
        String str1 = "El coche rojo mola";
        
        String new_str = str1.substring(3, 8);
        
        System.out.println(new_str);
    }
}
