package uriproblems;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1020 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        double anos = valor/365;
        double meses = (valor%365)/30;
        double dias = (valor%365)%30;
        DecimalFormat d = new DecimalFormat("0");
        System.out.printf(d.format(anos) + " ano(s)\n");
        System.out.printf(d.format(meses) + " mes(es)\n");
        System.out.printf(d.format(dias) + " dia(s)\n");
    }
}
