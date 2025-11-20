# Conceitos Avançados de Programação em Java

## Introdução

Este documento explora conceitos mais avançados de Java que permitem criar aplicações robustas, escaláveis e bem estruturadas.

## 1. Programação Orientada a Objetos (POO)

### 1.1 Classes e Objetos

A POO é um paradigma que organiza o código em **classes** (templates) que geram **objetos** (instâncias):

```java
// Definição de uma classe
public class Pessoa {
    // Atributos (propriedades)
    private String nome;
    private int idade;
    private double salario;
    
    // Construtor padrão
    public Pessoa() {
    }
    
    // Construtor com parâmetros
    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    
    // Getters e Setters (Encapsulamento)
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // Método
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

// Criação de um objeto (instância)
Pessoa pessoa1 = new Pessoa("João", 25, 5000.0);
pessoa1.apresentar(); // Olá, meu nome é João
```

### 1.2 Os Quatro Pilares da POO

#### 1.2.1 Encapsulamento

Protege os dados da classe, permitindo acesso controlado:

```java
public class ContaBancaria {
    // Atributo privado (não pode ser acessado diretamente de fora)
    private double saldo;
    
    // Acesso controlado através de método público
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
}
```

#### 1.2.2 Herança

Permite que uma classe herde propriedades e métodos de outra:

```java
// Classe pai (superclasse)
public class Animal {
    protected String nome;
    protected int idade;
    
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void fazer_som() {
        System.out.println("Som genérico de animal");
    }
}

// Classe filha (subclasse)
public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade); // Chama construtor da classe pai
    }
    
    @Override // Anotação indicando que estamos sobrescrevendo
    public void fazer_som() {
        System.out.println("Au au!");
    }
}

// Uso
Cachorro dog = new Cachorro("Rex", 3);
dog.fazer_som(); // Au au!
```

#### 1.2.3 Polimorfismo

Permite que objetos de classes diferentes respondام a mesma mensagem de formas diferentes:

```java
public class Gato extends Animal {
    @Override
    public void fazer_som() {
        System.out.println("Miau!");
    }
}

// Polimorfismo em ação
Animal animal1 = new Cachorro("Toby", 5);
Animal animal2 = new Gato("Whiskers", 3);

animal1.fazer_som(); // Au au!
animal2.fazer_som(); // Miau!
```

#### 1.2.4 Abstração

Simplifica a complexidade escondendo detalhes desnecessários:

```java
// Classe abstrata
public abstract class Veiculo {
    protected String marca;
    
    public abstract void acelerar();
    
    public abstract void frear();
    
    public void ligar() {
        System.out.println("Veículo ligado");
    }
}

// Implementação concreta
public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }
    
    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }
}
```

### 1.3 This e Super

```java
public class Funcionario extends Pessoa {
    private double salario;
    
    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade, 0);  // super: acessa construtor da classe pai
        this.salario = salario; // this: referencia atributo da classe atual
    }
    
    public void exibir() {
        System.out.println("Nome: " + this.nome);      // this (redundante neste caso)
        System.out.println("Salário: " + this.salario);
    }
}
```

## 2. Interfaces e Classes Abstratas

### 2.1 Interfaces

Contrato que define o que uma classe deve fazer:

```java
// Definição de interface
public interface Animal {
    void fazer_som();
    void mover();
}

// Implementação da interface
public class Cachorro implements Animal {
    @Override
    public void fazer_som() {
        System.out.println("Au au!");
    }
    
    @Override
    public void mover() {
        System.out.println("Correndo com 4 patas");
    }
}
```

### 2.2 Classes Abstratas

Não podem ser instanciadas diretamente, servem como base para outras classes:

```java
public abstract class Veiculo {
    protected String cor;
    
    // Método abstrato (obrigatório implementar nas subclasses)
    public abstract void acelerar();
    
    // Método concreto
    public void pintar(String novaCor) {
        cor = novaCor;
    }
}
```

## 3. Enumerações

Tipos que permitem apenas um conjunto específico de constantes:

```java
public enum Dia {
    SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
}

public enum Status {
    ATIVO("Ativo"),
    INATIVO("Inativo"),
    SUSPENSO("Suspenso");
    
    private String descricao;
    
    Status(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}

// Uso
Dia hoje = Dia.QUARTA;
Status status = Status.ATIVO;
System.out.println(status.getDescricao()); // Ativo
```

## 4. Generics (Genéricos)

Permitem criar classes, interfaces e métodos parametrizados por tipo:

```java
// Classe genérica
public class Caixa<T> {
    private T conteudo;
    
    public void guardar(T item) {
        this.conteudo = item;
    }
    
    public T obter() {
        return conteudo;
    }
}

// Uso
Caixa<String> caixaString = new Caixa<>();
caixaString.guardar("Olá");
System.out.println(caixaString.obter()); // Olá

Caixa<Integer> caixaInt = new Caixa<>();
caixaInt.guardar(42);
System.out.println(caixaInt.obter()); // 42
```

### 4.1 Método Genérico

```java
public class Utilitarios {
    public static <T> void imprimir(T valor) {
        System.out.println(valor);
    }
    
    public static <T> T primeiro(T[] array) {
        if (array.length > 0) {
            return array[0];
        }
        return null;
    }
}

// Uso
Utilitarios.imprimir("Java");   // Java
Utilitarios.imprimir(123);      // 123
String[] palavras = {"Olá", "Mundo"};
System.out.println(Utilitarios.primeiro(palavras)); // Olá
```

## 5. Coleções (Collections)

### 5.1 ArrayList

Lista dinâmica que cresce conforme necessário:

```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();

// Adicionar elementos
nomes.add("João");
nomes.add("Maria");
nomes.add("Pedro");

// Acessar elementos
System.out.println(nomes.get(0)); // João

// Iterar
for (String nome : nomes) {
    System.out.println(nome);
}

// Remover
nomes.remove(1); // Remove "Maria"

// Tamanho
System.out.println(nomes.size()); // 2

// Verificar existência
System.out.println(nomes.contains("Pedro")); // true
```

### 5.2 HashMap

Armazena pares chave-valor:

```java
import java.util.HashMap;

HashMap<String, Integer> notas = new HashMap<>();

// Adicionar
notas.put("João", 85);
notas.put("Maria", 92);
notas.put("Pedro", 78);

// Acessar
System.out.println(notas.get("João")); // 85

// Iterar
for (String chave : notas.keySet()) {
    System.out.println(chave + ": " + notas.get(chave));
}

// Remover
notas.remove("Pedro");

// Verificar existência
System.out.println(notas.containsKey("Maria")); // true
```

### 5.3 HashSet

Conjunto sem duplicatas:

```java
import java.util.HashSet;

HashSet<String> frutas = new HashSet<>();

frutas.add("Maçã");
frutas.add("Banana");
frutas.add("Laranja");
frutas.add("Maçã"); // Não será adicionada (duplicata)

System.out.println(frutas.size()); // 3

for (String fruta : frutas) {
    System.out.println(fruta);
}
```

### 5.4 Comparação Rápida

| Coleção | Tipo | Ordenada | Permite Nulos | Performance |
|---------|------|----------|---------------|-------------|
| ArrayList | Lista | Sim (por inserção) | Sim | Boa |
| LinkedList | Lista | Sim | Sim | Melhor p/ add/remove |
| HashMap | Mapa | Não | Sim (valores) | Muito boa |
| TreeMap | Mapa | Sim (ordenado) | Não (valores) | Boa |
| HashSet | Conjunto | Não | Sim | Muito boa |
| TreeSet | Conjunto | Sim | Não | Boa |

## 6. Tratamento de Exceções

### 6.1 Try-Catch

Captura e trata erros durante execução:

```java
try {
    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]); // Índice inválido
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Erro: índice inválido!");
    e.printStackTrace(); // Mostra o rastreamento da exceção
}
```

### 6.2 Try-Catch-Finally

Finally executa sempre, independente de exceção:

```java
try {
    System.out.println("Processando...");
    int resultado = 10 / 0; // Exceção!
} catch (ArithmeticException e) {
    System.out.println("Erro: divisão por zero!");
} finally {
    System.out.println("Limpando recursos..."); // Sempre executa
}
```

### 6.3 Try-Catch Múltiplo

```java
try {
    // Código que pode gerar exceção
} catch (IOException e) {
    System.out.println("Erro de I/O");
} catch (NumberFormatException e) {
    System.out.println("Número inválido");
} catch (Exception e) {
    System.out.println("Erro geral");
}
```

### 6.4 Exceções Personalizadas

```java
// Definir exceção personalizada
public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

// Usar
public void validarIdade(int idade) throws IdadeInvalidaException {
    if (idade < 0 || idade > 150) {
        throw new IdadeInvalidaException("Idade inválida!");
    }
}

// Tratar
try {
    validarIdade(-5);
} catch (IdadeInvalidaException e) {
    System.out.println(e.getMessage());
}
```

## 7. Métodos Estáticos

Pertencem à classe, não a objetos específicos:

```java
public class Calculadora {
    // Método estático
    public static int somar(int a, int b) {
        return a + b;
    }
    
    // Constante estática
    public static final double PI = 3.14159;
}

// Uso (sem criar objeto)
int resultado = Calculadora.somar(5, 3); // 8
System.out.println(Calculadora.PI);      // 3.14159
```

## 8. Sobrecarga de Métodos

Métodos com mesmo nome mas parâmetros diferentes:

```java
public class Operacao {
    // Sobrecarga: diferentes tipos de parâmetro
    public static int somar(int a, int b) {
        return a + b;
    }
    
    public static double somar(double a, double b) {
        return a + b;
    }
    
    // Sobrecarga: diferentes quantidade de parâmetros
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
}

// Uso
System.out.println(Operacao.somar(5, 3));           // 8
System.out.println(Operacao.somar(5.5, 3.2));       // 8.7
System.out.println(Operacao.somar(5, 3, 2));        // 10
```

## 9. Lambda (Expressões Lambda)

Sintaxe concisa para implementar interfaces funcionais:

```java
import java.util.ArrayList;
import java.util.function.Predicate;

ArrayList<Integer> numeros = new ArrayList<>();
numeros.addAll(java.util.Arrays.asList(1, 2, 3, 4, 5, 6));

// Lambda: (parâmetros) -> {corpo}
numeros.forEach(n -> System.out.println(n));

// Filtrando com predicado
Predicate<Integer> ehPar = n -> n % 2 == 0;
numeros.stream()
       .filter(ehPar)
       .forEach(System.out::println); // 2, 4, 6
```

## 10. Streams (Processamento Funcional)

Processamento de coleções de forma funcional e declarativa:

```java
import java.util.ArrayList;
import java.util.Arrays;

ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

// Filter: pega apenas pares
// Map: multiplica cada número por 2
// Reduce: soma todos os resultados
int resultado = numeros.stream()
    .filter(n -> n % 2 == 0)      // Pega pares
    .map(n -> n * 2)               // Multiplica por 2
    .reduce(0, Integer::sum);       // Soma

System.out.println(resultado); // 60 (2*2 + 4*2 + 6*2 + 8*2 + 10*2)

// Encontrar primeiro elemento que atende critério
numeros.stream()
       .filter(n -> n > 5)
       .findFirst()
       .ifPresent(System.out::println); // 6

// Contar elementos
long quantidade = numeros.stream()
                         .filter(n -> n % 2 == 0)
                         .count();
System.out.println(quantidade); // 5
```

## 11. Optional

Alternativa segura para valores que podem ser nulos:

```java
import java.util.Optional;

Optional<String> nome = Optional.of("João");

// Verificar se tem valor
if (nome.isPresent()) {
    System.out.println("Valor: " + nome.get());
}

// Usar ifPresentOrElse
nome.ifPresentOrElse(
    n -> System.out.println("Olá " + n),
    () -> System.out.println("Nome não fornecido")
);

// Usar orElse
String resultado = nome.orElse("Anônimo");

// Optional vazio
Optional<String> vazio = Optional.empty();
System.out.println(vazio.orElse("Padrão")); // Padrão
```

## 12. Anotações

Metadados que fornecem informações sobre o código:

```java
public class MinhaClasse {
    // @Override: indica que estamos sobrescrevendo um método
    @Override
    public String toString() {
        return "MinhaClasse";
    }
    
    // @Deprecated: indica que este método é obsoleto
    @Deprecated
    public void metodoAntigo() {
        System.out.println("Este método é antigo!");
    }
    
    // @SuppressWarnings: suprime avisos do compilador
    @SuppressWarnings("unchecked")
    public void metodoGenerico() {
        // Código aqui
    }
}
```

## Comparação: Classe Abstrata vs Interface

| Aspecto | Classe Abstrata | Interface |
|---------|-----------------|-----------|
| Métodos concretos | Pode ter | Só métodos padrão (Java 8+) |
| Atributos | Pode ter de qualquer tipo | Só constantes (public static final) |
| Modificadores | Pode usar private, protected | Implicitamente public |
| Herança múltipla | Não (uma classe) | Sim (múltiplas interfaces) |
| Construtor | Pode ter | Não pode ter |
| Uso | Quando há relacionamento "é um" | Quando implementa um contrato |

## Resumo

Os conceitos avançados permitem criar código mais modular, reutilizável e fácil de manter. A compreensão destes princípios é fundamental para desenvolvimento profissional em Java.

---

**Última atualização**: 20 de novembro de 2025
