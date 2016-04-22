
package uriproblems;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Problema1013 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int MaiorAB = (a+b+abs(a-b))/2;
        int maior=(MaiorAB+c+abs(MaiorAB-c))/2;
        System.out.println(maior + " eh o maior");
    }
}
