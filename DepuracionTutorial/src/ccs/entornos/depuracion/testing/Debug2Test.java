package ccs.entornos.depuracion.testing;
import java.util.Scanner;



public class Debug2Test{


    /**
     * Main program to test methods. 
     * 
     * @bugs none.
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String str = stdin.next();
        
        System.out.println("Enter a char: ");
        char ch = stdin.next().charAt(0);
        
        System.out.println("Character " + ch + " occurs "
                           + countOccurrences(str, ch) + " times in string \""
                           + str + "\".");
        
        System.out.println("\n\nEnter another String: ");
        str = stdin.next();
        
        System.out.println("The reverse of string \""
                            + str + "\" is " + reverseString(str));
    }   

    /**
     * Cuenta el numero de ocurrencias del char ch en la cadena str.
     * 
     * @param s - String to search for ch 
     * @param c - char whose occurrence should be counted 
     * @return int - the number of occurrences
     * 
     * @bugs Hay dos errores. Resuelvelos
     */
    public static int countOccurrences(String s, char c) {
        int count = 0;
        if (s != null) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Invierte un String.
     * 
     * @param s - String to reverse 
     * @return String - the reversed String
     * 
     * @bugs Hay dos errore. Resuelvelos
     */
    public static String reverseString(String s) {
        //toCharArray cconvierte una cadena s a un array de caracteres
        char[] swap = s.toCharArray();

        //Los errores estan en el bucle
        for (int i = 0; i < swap.length/2; i++) {
            char cTmp = swap[i];
            swap[i] = swap[swap.length-i-1];
            swap[swap.length-i-1] = cTmp;
        }

	//convierte el array swap de nuevo en un String
        return new String(swap);
    }

}
