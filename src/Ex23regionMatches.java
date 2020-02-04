/*
23. Escriba un programa Java para encontrar si una región en la cadena actual coincide con una región en otra cadena.
Salida de muestra:
str1 [0 - 7] == str2 [28 - 35]? cierto
str1 [9 - 15] == str2 [9 - 15]? falso
 */

/**
 *
 * @author bataparato
 */
public class Ex23regionMatches {
    public static void main(String[] args) {
        
        String frase1 = "hola caracola";
        String frase2 = "Aqui no hay nada igual";
        
        boolean res1 = frase1.regionMatches(0, frase2, 0, 0);
        
        boolean res2 = frase1.regionMatches(9, frase2, 9, 8);
        
        System.out.println("str1[0 - 7] == str2[28 - 35]? " + res1);
        System.out.println("str1[9 - 15] == str2[9 - 15]? " + res2);
    }
}
