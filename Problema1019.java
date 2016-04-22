package uriproblems;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1019 {

        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        double horas = a/3600;
        a = a%3600;
        double minutos = a/60;
        a = a%60;
        double segundos = a;
        DecimalFormat deci = new DecimalFormat("0");
            System.out.printf(deci.format(horas)+ ":" + deci.format(minutos) + ":" + deci.format(segundos) + "\n");
    }
}
