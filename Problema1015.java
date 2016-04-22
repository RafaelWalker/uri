package uriproblems;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1015 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();
        double x = (x2-x1);
        double y = (y2-y1); 
        x = Math.pow(x, 2);
        y = Math.pow(y, 2);
        double distancia = Math.sqrt(x+y);
        DecimalFormat deci = new DecimalFormat(".0000");
        System.out.println(deci.format(distancia));
        
        
    }
}
