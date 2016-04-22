
package uriproblems;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //System.out.print("Digite o Valor do Raio: ");
        int raio = teclado.nextInt();
        double pi = 3.14159;
        double VOLUME = (4/3.0)*pi*Math.pow(raio,3);
        System.out.printf("VOLUME = %.3f\n",VOLUME);
    }
}
