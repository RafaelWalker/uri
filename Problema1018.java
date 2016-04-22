package uriproblems;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int n100, n50, n20, n10, n5, n2, n1, sobra;
        System.out.println(n);
        n100 = n/100;
        sobra = n%100;
        System.out.print(n100 + " nota(s) de R$ 100,00\n");
        n50 = sobra/50;
        sobra = sobra%50;
        System.out.print(n50 + " nota(s) de R$ 50,00\n");
        n20 = sobra/20;
        sobra = sobra%20;
        System.out.print(n20 + " nota(s) de R$ 20,00\n");
        n10 = sobra/10;
        sobra = sobra%10;
        System.out.print(n10 + " nota(s) de R$ 10,00\n");
        n5 = sobra/5;
        sobra = sobra%5;
        System.out.print(n5 + " nota(s) de R$ 5,00\n");
        n2 = sobra/2;
        sobra = sobra%2;
        System.out.print(n2 + " nota(s) de R$ 2,00\n");
        n1 = sobra;
        System.out.print(n1 + " nota(s) de R$ 1,00\n");
        
    }
}
