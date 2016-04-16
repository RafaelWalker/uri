
package uriproblems;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        double r;
        double A;
        
       r = teclado.nextDouble();
       
       A = pi * Math.pow(r, 2);
       
        System.out.printf("A=%.4f\n",A);
        
    }
}
