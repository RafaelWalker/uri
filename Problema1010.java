
package uriproblems;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //System.out.print("Digite o Código da Primeira Peça: ");
        int cp1 = teclado.nextInt();
        //System.out.print("Digite a Quantidade: ");
        int qp1 = teclado.nextInt();
        //System.out.print("Digite o Valor da Primeira Peça: ");
        double vp1 = teclado.nextDouble();
        //System.out.print("Digite o Código da Segunda Peça 2: ");
        int cp2 = teclado.nextInt();
        //System.out.print("Digite a Quantidade: ");
        int qp2 = teclado.nextInt();
        //System.out.print("Digite o Valor da Segunda Peça 2: ");
        double vp2 = teclado.nextDouble();
        double TOTAL = (vp1*qp1) + (qp2*vp2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",TOTAL);
        
    }
}
