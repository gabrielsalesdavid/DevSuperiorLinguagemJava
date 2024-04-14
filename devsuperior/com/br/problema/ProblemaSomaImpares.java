package devsuperior.com.br.problema;

import java.util.Scanner;

public class ProblemaSomaImpares {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int num01, num02, trocaNum, somaNum;

        System.out.println("Digite dois numeros: ");
        num01 = sc.nextInt();
        num02 = sc.nextInt();

        if (num01 > num02) {
          trocaNum = num01;
          num01 = num02;
          num02 = trocaNum;
        }

        somaNum = 0;
        for (int i = num01 + 1; i < num02; i++) {
           if (i % 2 != 0) {
             somaNum = somaNum + i;
           }
        }

        System.out.println("Soma dos impares = " + somaNum);

        sc.close();
    }
}