package uriproblems;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1017 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tempo gasto em horas: ");
        double tempo = teclado.nextDouble();
        System.out.print("Digite a velocidade média em km/h: ");
        double velocidade = teclado.nextDouble();
        double distancia = tempo * velocidade;
        DecimalFormat d = new DecimalFormat("0.000");
        System.out.println(d.format(distancia / 12));
        
    }
}
