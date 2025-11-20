# Fundamentos de Programação em Java

## Introdução

Este documento apresenta os fundamentos essenciais da programação em Java, cobrindo os conceitos básicos necessários para iniciantes nesta linguagem poderosa e versátil.

## 1. Primeiros Passos em Java

### 1.1 Estrutura Básica de um Programa Java

Toda aplicação Java começa com uma classe contendo o método `main`:

```java
public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }
}
```

- **Classe**: A unidade fundamental de organização em Java
- **Método main**: Ponto de entrada do programa
- **System.out.println()**: Exibe informações no console

### 1.2 Variáveis e Tipos de Dados

Java é uma linguagem **fortemente tipada**, ou seja, toda variável deve ter um tipo declarado:

#### Tipos Primitivos Básicos:

| Tipo | Tamanho | Descrição |
|------|---------|-----------|
| `int` | 32 bits | Números inteiros |
| `double` | 64 bits | Números decimais |
| `float` | 32 bits | Números decimais (menor precisão) |
| `char` | 16 bits | Um caractere Unicode |
| `boolean` | 1 bit | Verdadeiro ou falso |
| `long` | 64 bits | Números inteiros grandes |
| `byte` | 8 bits | Números inteiros pequenos |
| `short` | 16 bits | Números inteiros pequenos |

#### Exemplo de Declaração:

```java
int idade = 20;
double salario = 5800.50;
char genero = 'F';
String nome = "Maria Silva";
boolean ativo = true;
```

## 2. Entrada e Saída de Dados

### 2.1 Saída de Dados

A forma mais comum é usar `System.out.println()` ou `System.out.print()`:

```java
System.out.println("Texto com quebra de linha");
System.out.print("Texto sem quebra de linha");

// Concatenação de strings
System.out.println("Nome: " + nome + ", Idade: " + idade);

// Formatação com printf
System.out.printf("Salário: R$ %.2f%n", salario);
```

### 2.2 Entrada de Dados com Scanner

A classe `Scanner` permite ler dados do usuário:

```java
import java.util.Scanner;
import java.util.Locale;

Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US); // Define localização para US (usa ponto decimal)

System.out.print("Digite seu nome: ");
String nome = sc.nextLine(); // Lê uma linha inteira

System.out.print("Digite sua idade: ");
int idade = sc.nextInt(); // Lê um inteiro

System.out.print("Digite seu salário: ");
double salario = sc.nextDouble(); // Lê um número decimal

sc.close(); // Fecha o Scanner
```

**Importante**: Após usar `sc.nextInt()` ou `sc.nextDouble()`, use `sc.nextLine()` para consumir a quebra de linha restante.

## 3. Operadores

### 3.1 Operadores Aritméticos

```java
int a = 10;
int b = 3;

int soma = a + b;           // 13
int subtracao = a - b;      // 7
int multiplicacao = a * b;  // 30
int divisao = a / b;        // 3 (divisão inteira)
double divisaoExata = a / (double) b; // 3.333...
int resto = a % b;          // 1 (resto da divisão)
```

### 3.2 Operadores de Comparação

Retornam valores `true` ou `false`:

```java
int x = 5;
int y = 10;

x == y   // false (igualdade)
x != y   // true (diferença)
x < y    // true (menor que)
x > y    // false (maior que)
x <= y   // true (menor ou igual)
x >= y   // false (maior ou igual)
```

### 3.3 Operadores Lógicos

```java
boolean a = true;
boolean b = false;

a && b   // false (E lógico - ambos devem ser true)
a || b   // true (OU lógico - pelo menos um deve ser true)
!a       // false (NÃO lógico - inverte o valor)
```

### 3.4 Atribuição

```java
int x = 5;
x += 3;  // x = x + 3 → x = 8
x -= 2;  // x = x - 2 → x = 6
x *= 2;  // x = x * 2 → x = 12
x /= 3;  // x = x / 3 → x = 4
```

## 4. Estrutura Condicional

### 4.1 If-Else

A estrutura mais fundamental para decisões:

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade");
} else if (idade >= 16) {
    System.out.println("Você é quase maior de idade");
} else {
    System.out.println("Você é menor de idade");
}
```

### 4.2 Switch-Case

Útil quando há múltiplas condições baseadas em um valor:

```java
int diaSemana = 3;
String nomeDia;

switch (diaSemana) {
    case 1:
        nomeDia = "Segunda";
        break;
    case 2:
        nomeDia = "Terça";
        break;
    case 3:
        nomeDia = "Quarta";
        break;
    default:
        nomeDia = "Dia inválido";
}

System.out.println(nomeDia); // Quarta
```

### 4.3 Operador Ternário

Forma concisa de if-else em uma linha:

```java
int idade = 20;
String categoria = (idade >= 18) ? "Maior" : "Menor";
// Se idade >= 18, categoria = "Maior", senão categoria = "Menor"
```

## 5. Estruturas de Repetição

### 5.1 Loop For

Executa um bloco de código um número específico de vezes:

```java
// For tradicional
for (int i = 0; i < 5; i++) {
    System.out.println("Iteração: " + i);
}

// For-each (para coleções e arrays)
int[] numeros = {1, 2, 3, 4, 5};
for (int num : numeros) {
    System.out.println(num);
}
```

### 5.2 Loop While

Executa enquanto uma condição for verdadeira:

```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

### 5.3 Loop Do-While

Executa pelo menos uma vez, depois verifica a condição:

```java
int contador = 0;
do {
    System.out.println("Contador: " + contador);
    contador++;
} while (contador < 5);
```

### 5.4 Comandos de Controle

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;      // Sai do loop
    }
    if (i % 2 == 0) {
        continue;   // Pula para a próxima iteração
    }
    System.out.println(i);
}
```

## 6. Arrays (Vetores)

### 6.1 Declaração e Inicialização

```java
// Declaração com tamanho definido
int[] numeros = new int[5];

// Inicialização com valores
int[] numeros = {1, 2, 3, 4, 5};

// Acessar elementos
System.out.println(numeros[0]); // 1 (primeiro elemento)

// Modificar elementos
numeros[2] = 10;
```

### 6.2 Propriedade length

```java
int[] numeros = {1, 2, 3, 4, 5};
System.out.println(numeros.length); // 5

// Percorrer o array
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

### 6.3 Arrays Multidimensionais (Matrizes)

```java
// Matriz 3x3
int[][] matriz = new int[3][3];

// Inicialização
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Acessar elemento
System.out.println(matriz[1][2]); // 6

// Percorrer matriz
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

## 7. Strings

### 7.1 Características Básicas

```java
String texto = "Olá Mundo";

// Concatenação
String saudacao = "Olá " + "Mundo";

// Propriedades e métodos úteis
System.out.println(texto.length());          // 9
System.out.println(texto.charAt(0));         // O
System.out.println(texto.toLowerCase());     // olá mundo
System.out.println(texto.toUpperCase());     // OLÁ MUNDO
System.out.println(texto.contains("Mundo")); // true
System.out.println(texto.startsWith("Olá")); // true
System.out.println(texto.endsWith("Mundo")); // true
System.out.println(texto.indexOf("Mundo"));  // 4
System.out.println(texto.substring(0, 3));   // Olá
```

### 7.2 Comparação de Strings

```java
String texto1 = "Java";
String texto2 = "Java";
String texto3 = new String("Java");

// Comparar conteúdo
System.out.println(texto1.equals(texto2));           // true
System.out.println(texto1.equalsIgnoreCase("JAVA")); // true
System.out.println(texto1.compareTo(texto2));        // 0

// Não use == para comparar strings
System.out.println(texto1 == texto3); // false (compara referência, não conteúdo)
```

## 8. Casting

### 8.1 Conversão de Tipos

```java
// Casting implícito (widening)
int numero = 10;
double resultado = numero; // Automático, sem perda de dados

// Casting explícito (narrowing)
double valor = 10.5;
int inteiro = (int) valor; // Explícito, pode haver perda de dados (10)

// Conversão de String para número
String texto = "123";
int num = Integer.parseInt(texto);       // 123
double num2 = Double.parseDouble("10.5"); // 10.5

// Conversão de número para String
int numero = 42;
String texto = String.valueOf(numero);  // "42"
String texto2 = Integer.toString(numero); // "42"
String texto3 = "" + numero;             // "42" (concatenação)
```

## 9. Localização e Formatação

### 9.1 Locale

```java
import java.util.Locale;

// Define o locale para US (usa ponto como separador decimal)
Locale.setDefault(Locale.US);

// Agora números decimais usarão ponto (10.5)
double valor = 10.5;
System.out.println(valor);
```

### 9.2 Formatação com printf

```java
double valor = 123.456;
String nome = "João";
int idade = 25;

System.out.printf("Nome: %s%n", nome);           // String
System.out.printf("Idade: %d anos%n", idade);   // Inteiro
System.out.printf("Valor: R$ %.2f%n", valor);   // 2 casas decimais
System.out.printf("Valor: R$ %10.2f%n", valor); // Com espaço
```

## 10. Boas Práticas

1. **Nomeação**: Use `camelCase` para variáveis e métodos, `PascalCase` para classes
2. **Comentários**: Use `//` para comentários de uma linha e `/* */` para múltiplas linhas
3. **Indentação**: Mantenha código bem indentado para legibilidade
4. **Variáveis**: Declare variáveis o mais próximo possível de seu uso
5. **Recursos**: Sempre feche recursos como `Scanner` e arquivo após uso
6. **Nomes significativos**: Use nomes claros que descrevam a finalidade da variável

## Resumo

Os fundamentos aqui apresentados formam a base para programação em Java. A compreensão desses conceitos é essencial para avançar para tópicos mais complexos como Orientação a Objetos, exceções e coleções.

---

**Última atualização**: 20 de novembro de 2025
