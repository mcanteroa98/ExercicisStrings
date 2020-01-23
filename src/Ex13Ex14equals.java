/*
13. Write a Java program to check whether two String objects contain the same data.

Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false
"Stephen Edwin King" equals "Mike Royko"? false

 */

/**
 *
 * @author bataparato
 */
public class Ex13Ex14equals {
    public static void main(String[] args) {
        String frase1 = "Hostia pilotes";
        String frase2 = "Hostia pilotes";
        String frase3 = "M'encanten";
        
        boolean equals1 = frase1.equals(frase2);
        boolean equals2 = frase2.equals(frase3);
        /*
        L'ignoreCase seria:
        boolean equals1 = frase1.equalsIgnoreCase(frase2);
        boolean equals2 = frase2.equalsIgnoreCase(frase3);
        */
        
        System.out.println("La frase '" + frase1 + "' es igual que '" +frase2+ "' ?");
        System.out.println(equals1);
        System.out.println(" ");
        System.out.println("La frase '" + frase2 + "' es igual que '" +frase3+ "' ?");
        System.out.println(equals2);
    }
}
