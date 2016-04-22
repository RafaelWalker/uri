
package uriproblems;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X = teclado.nextInt();
        double Y = teclado.nextDouble();
        double result = (X/Y);
        DecimalFormat deci = new DecimalFormat("0.000"); 
        System.out.println(deci.format(result)+ " km/l");
    }
}
