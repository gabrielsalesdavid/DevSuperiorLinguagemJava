package devsuperior.com.br.problema;

import java.util.Scanner;

public class ProblemaDiagonalNegativos {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, contaVet;

        System.out.println("Qual a ordem da matriz? ");
        n = sc.nextInt();

        int[][] vet = new int[n][n];
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
              System.out.print("Elemento [" + i + ", " + j + "]: ");
               vet[i][j] = sc.nextInt();
           }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i][i] + " ");
        }

        System.out.println();
        contaVet = 0;
        System.out.print("Quantidade de negativos = ");
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               if (vet[i][j] < 0) {
                 contaVet++;
               }
           }
        }
        System.out.print(contaVet);

        sc.close();
    }
}