/*
25. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
Sample string : "The quick brown fox jumps over the lazy dog."
In the above string replace all the fox with cat.
Sample Output:
Original string: The quick brown fox jumps over the lazy dog.
New String: The quick brown cat jumps over the lazy dog.
 */

/**
 *
 * @author bataparato
 */
public class Ex25replaceAll {
    
    public static void main(String[] args) {
        
        String str = "Hola a la caracola que mola";
        
        String new_str = str.replaceAll("Hola", "Uep");
        
        System.out.println(str);
        System.out.println(new_str);
    }
}