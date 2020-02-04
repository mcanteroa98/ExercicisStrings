/*
24. Write a Java program to replace all the 'd' characters with 'f' characters.
Sample Output:
Original string: The quick brown fox jumps over the lazy dog.
New String: The quick brown fox jumps over the lazy fog.
 */

/**
 *
 * @author bataparato
 */
public class Ex24Replace {
    public static void main(String[] args) {
        
        String str = "The quick brown fox jumps over the lazy dog.";
        
        String new_str = str.replace('d', 'f');
        
        System.out.println("Frase original " + str);
        System.out.println("");
        System.out.println("Frase cambiando 'd' por 'f': " + new_str);
    }
}
