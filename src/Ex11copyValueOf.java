/*
11. Write a Java program to create a new String object with the contents of a character array

Sample Output:

The book contains 234 pages.

 */

/**
 *
 * @author bataparato
 */
public class Ex11copyValueOf {
    public static void main(String[] args) {
        char [] str1 = {'2','3','4'};
        String str2 = "";
        str2 = str2.copyValueOf(str1);
        System.out.println("El libro tiene "+ str2 +" páginas");
    }
}
