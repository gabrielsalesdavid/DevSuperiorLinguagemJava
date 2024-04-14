package devsuperior.com.br.vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetoresEmJava {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
           System.out.println("Digite um numero: ");
           vet[i] = sc.nextDouble();
        }

        System.out.println("Numeros digitados: ");
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%.1f", vet[i]));
        }

        sc.close();
    }
}
