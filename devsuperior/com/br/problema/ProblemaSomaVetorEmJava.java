package devsuperior.com.br.problema;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetorEmJava {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double somaVet, mediaVet;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < n; i++) {
           System.out.print("Digite um numero: ");
           vet[i] = sc.nextDouble();
        }

        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
           System.out.print(vet[i] + " ");
        }

        System.out.println();
        somaVet = 0;
        for (int i = 0; i < n; i++) {
           somaVet = somaVet + vet[i];
        }

        System.out.println("Soma = " + String.format("%.2f", somaVet));

        mediaVet = somaVet / n;
        System.out.println("Media = " + String.format("%.2f", mediaVet));

        sc.close();
    }
}