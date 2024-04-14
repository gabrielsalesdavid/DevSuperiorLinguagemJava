package devsuperior.com.br.problema;

import java.util.Scanner;

public class ProblemaCrescente {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int num01, num02;

        System.out.println("Digite dois numeros: ");
        num01 = sc.nextInt();
        num02 = sc.nextInt();

        do {
          if (num01 < num02) {
            System.out.println("Crescente!");
          } else {
                System.out.println("Decrescente!");
          }

          System.out.println("Digite outros dois numeros: ");
          num01 = sc.nextInt();
          num02 = sc.nextInt();

        } while (num01 != num02);
    }
}