
package uriproblems;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        System.out.println("DIFERENCA = " + (A*B-C*D));
    }
}
