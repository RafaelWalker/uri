
package uriproblems;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        double TRIANGULO = ((A*C)/2);
        double CIRCULO = (3.14159*C*C);
        double TRAPEZIO = ((A+B)*C)/2;
        double QUADRADO = B*B;
        double RETANGULO = A*B;
        
        System.out.printf("TRIANGULO: %.3f\n",TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n",CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n",TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n",QUADRADO);
        System.out.printf("RETANGULO: %.3f\n",RETANGULO);
    }
}
