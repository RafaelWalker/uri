
package uriproblems;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        double MEDIA = (A*2.0 + B*3.0 + C*5.0)/ (10);
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}
