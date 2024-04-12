public class SaidaDeDadosEmJava {

    public static void main (String[] args) {

        int idade;
        double salario;
        String nome;
        char sexo;

        idade = 31;
        salario = 4000.0;
        nome = "Gabriel Sales David";
        sexo = 'I';

        System.out.println("O(A) funcionario(a) " + nome + ", sexo " + sexo + ", ganha "
                           + String.format("%.2f", salario) + " e tem " + idade + " anos");
    }
}
