
package uriproblems;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //System.out.print("Digite o Número do Funcionário: ");
        int NUMBER = teclado.nextInt();
        //System.out.print("Digite o Número de Horas Trabalhadas: ");
        int HORAS = teclado.nextInt();
        //System.out.print("Digite o valor R$ que recebe por hora: ");
        double VHORA = teclado.nextDouble();
        double SALARY = (VHORA * HORAS);
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
    }
}
