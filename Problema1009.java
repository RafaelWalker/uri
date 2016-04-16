
package uriproblems;

import java.util.Scanner;

public class Problema1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String NOME = teclado.nextLine();
        double SALARIOF = teclado.nextDouble();
        double VENDAS = teclado.nextDouble();
        double TOTAL = (SALARIOF + VENDAS * 15 / 100);
        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
    }
}
