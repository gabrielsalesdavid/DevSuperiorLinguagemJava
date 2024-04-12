import java.util.Scanner;

public class EstruturaDeControleEmJava {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i, x, soma;

        System.out.println("Quantos numeros serao digitados? ");
        n = sc.nextInt();

        soma = 0;
        for (i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            x  = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("Soma = " + soma);

        sc.close();
    }
}
