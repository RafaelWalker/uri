
package uriproblems;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double MEDIA = (A*3.5 + B*7.5)/(11);
        System.out.printf("MEDIA = %.5f\n",MEDIA);
        
    }
}
