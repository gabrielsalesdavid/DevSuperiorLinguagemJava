package devsuperior.com.br.problema;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaIdade {

    public static void main () {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade01, idade02;
        String nome01, nome02;
        double media;

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        nome01 = sc.nextLine();
        System.out.print("Idade: ");
        idade01 = sc.nextInt();
        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        nome02 = sc.nextLine();
        System.out.print("Idade: ");
        idade02 = sc.nextInt();

        media = (idade01 + idade02) / 2.0;

        System.out.println("A idade media de " + nome01 + " e " + nome02 + " eh de "
                                          + String.format("%.1f", media) + " anos");

        sc.close();
    }
}
