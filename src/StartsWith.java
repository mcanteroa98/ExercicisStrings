/*
26. Write a Java program to check whether a given string starts with the contents of another string.
Sample Output:
Red is favorite color. starts with Red? true
Orange is also my favorite color. starts with Red? false
 */

/**
 *
 * @author bataparato
 */
public class StartsWith {
    
    public static void main(String[] args) {
        
        String str1 = "Hola tomeu";
        String str2 = "Otra prueba";
        
        String palabraClave = "Hola";
        
        boolean res1 = str1.startsWith(palabraClave);
        boolean res2 = str2.startsWith(palabraClave);
        
        System.out.println(res1);
        System.out.println(res2);
    }
}
