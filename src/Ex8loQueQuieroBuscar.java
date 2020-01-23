/*
8. Write a Java program to test if a given string contains the specified sequence of char
values.

Sample Output:

Original String: PHP Exercises and Python Exercises
Specified sequence of char values: and
true
 */

/**
 *
 * @author batman
 */
public class Ex8loQueQuieroBuscar {
    public static void main (String[] args){
        boolean r = false;
        
        String cadenaDondeBuscar = "Hola caracola";
        String loQueQuieroBuscar = "caracola";
        
        String[] palabras = loQueQuieroBuscar.split("\\s");
        
        for (String palabra : palabras) {
            
            if (cadenaDondeBuscar.contains(palabra)) {
            r = true;
            }
        }
        System.out.println(r);
    }
}
