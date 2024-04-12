import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosEmJava {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario01, salario02;
        String nome01, nome02;
        int idade;
        char sexo;

        System.out.println("Nome da primeira pessoa: ");
        nome01 = sc.nextLine();
        System.out.println("Salario da primeira pessoa: ");
        salario01 = sc.nextDouble();

        System.out.println("Nome da segunda pessoa: ");
        sc.nextLine();
        nome02 = sc.nextLine();
        System.out.println("Salario da segunda pessoa: ");
        salario02 = sc.nextDouble();

        System.out.println("Digite uma idade: ");
        idade = sc.nextInt();
        System.out.println("Digite um sexo (F/M): ");
        sexo = sc.next().charAt(0);

        System.out.println("Nome 1: " + nome01);
        System.out.println("Salario 1: " + String.format("%.2f", salario01));
        System.out.println("Nome 2: " + nome02);
        System.out.println("Salario 2: " + String.format("%.2f", salario02));
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

        sc.close();
    }
}
