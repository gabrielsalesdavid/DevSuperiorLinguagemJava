package devsuperior.com.br.problema;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMenorDeTresEmJava {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num01, num02, num03, menorDeTres;

        System.out.print("Primeiro valor: ");
        num01 = sc.nextInt();
        System.out.print("Segundo valor: ");
        num02 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        num03 = sc.nextInt();

        if (num01 < num02 && num01 < num03) {
          menorDeTres = num01;
        } else if (num02 < num03) {
                 menorDeTres = num02;
        } else {
              menorDeTres = num03;
        }

        System.out.println("O menor é: " + menorDeTres);

        sc.close();
    }
}