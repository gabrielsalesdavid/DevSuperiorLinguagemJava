# 🚀 DevSuperior - Linguagem Java

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-11+-ED8B00?style=flat&logo=java)](https://www.java.com)
[![Status](https://img.shields.io/badge/Status-Ativo-brightgreen)](https://github.com/gabrielsalesdavid/DevSuperiorLinguagemJava)

Repositório educacional contendo exemplos práticos e exercícios de **Programação em Java** do curso **DevSuperior - Fundação de Programação**.

## 📚 Documentação

Este repositório possui documentação completa sobre Java:

- **[FUNDAMENTOS.md](./FUNDAMENTOS.md)** - Conceitos básicos essenciais para iniciantes
  - Variáveis e tipos de dados
  - Entrada e saída
  - Operadores
  - Estruturas condicionais e de repetição
  - Arrays e Strings
  - Casting e formatação

- **[CONCEITOS.md](./CONCEITOS.md)** - Tópicos avançados de Java
  - Programação Orientada a Objetos (POO)
  - Herança, Polimorfismo e Encapsulamento
  - Interfaces e Classes Abstratas
  - Genéricos (Generics)
  - Coleções (Collections)
  - Tratamento de Exceções
  - Expressões Lambda e Streams

## 📁 Estrutura do Projeto

```
devsuperior/
├── com/br/
│   ├── aulaIntro/                      # Aulas introdutórias
│   ├── helloword/                      # Primeiros passos
│   ├── entradadedados/                 # Entrada de dados com Scanner
│   ├── saidadedados/                   # Saída de dados com println
│   ├── estruturasequencial/            # Operadores e tipos básicos
│   ├── estruturacondicional/           # If, else, switch
│   ├── estruturadecontrole/            # Loops (for, while, do-while)
│   ├── matriz/                         # Matrizes e arrays multidimensionais
│   ├── vetores/                        # Vetores (arrays)
│   ├── processamentodedadosecasting/   # Casting e conversão de tipos
│   ├── problema/                       # Exercícios e desafios práticos
│   ├── classesatributosmtehodsstatics/ # Classes, atributos e métodos estáticos
│   ├── construtoresthissobrecargaencapsulamento/ # Construtores e encapsulamento
│   ├── herançapolimorfismo/            # Herança e polimorfismo
│   ├── interfaces/                     # Interfaces e classes abstratas
│   ├── enumeracaocomposicao/           # Enumerações e composição
│   ├── genericssetmap/                 # Genéricos, Set e Map
│   ├── tratamentoexcecoes/             # Try-catch e exceções personalizadas
│   ├── programacaofuncionalexpressoeslambda/ # Lambda e programação funcional
│   ├── trabalhandoarquivos/            # Leitura e escrita de arquivos
│   ├── datas/                          # Manipulação de datas
│   ├── memoriavetorelistas/            # Memória, vetores e listas
│   └── model/                          # Modelos de dados
│       ├── entities/                   # Entidades do domínio
│       ├── services/                   # Serviços de negócio
│       └── exceptions/                 # Exceções personalizadas
```

## 🎯 Tópicos Cobertos

### Fundamentos
- ✅ Variáveis e tipos primitivos
- ✅ Operadores aritméticos, lógicos e de comparação
- ✅ Estruturas condicionais (if/else, switch)
- ✅ Loops (for, while, do-while)
- ✅ Arrays e matrizes
- ✅ Strings e manipulação de texto
- ✅ Entrada/Saída de dados

### Programação Orientada a Objetos
- ✅ Classes e objetos
- ✅ Encapsulamento (private, public, protected)
- ✅ Herança
- ✅ Polimorfismo
- ✅ Abstração
- ✅ Interfaces
- ✅ Enumerações

### Tópicos Avançados
- ✅ Genéricos (Generics)
- ✅ Coleções (ArrayList, HashMap, HashSet)
- ✅ Tratamento de exceções
- ✅ Expressões Lambda
- ✅ Streams
- ✅ Manipulação de arquivos
- ✅ Programação funcional

## 🚀 Como Usar

### Pré-requisitos
- Java 11 ou superior instalado
- IDE recomendada: IntelliJ IDEA ou Eclipse

### Clone o repositório
```bash
git clone https://github.com/gabrielsalesdavid/DevSuperiorLinguagemJava.git
cd DevSuperiorLinguagemJava
```

### Compile e execute
```bash
# Navegar até a pasta do projeto
cd devsuperior

# Compilar
javac com/br/helloword/PrimeiroPassosEmJava.java

# Executar
java com.br.helloword.PrimeiroPassosEmJava
```

### Com IDE
1. Abra a pasta no IntelliJ IDEA ou Eclipse
2. Clique com botão direito no arquivo desejado
3. Selecione "Run"

## 📝 Exemplos de Código

### Olá Mundo
```java
public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }
}
```

### Entrada de Dados
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.print("Digite seu nome: ");
String nome = sc.nextLine();
System.out.println("Bem-vindo, " + nome);
sc.close();
```

### Classe e Objeto
```java
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

// Uso
Pessoa p = new Pessoa("João", 25);
p.apresentar();
```

### ArrayList
```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();
nomes.add("João");
nomes.add("Maria");

for (String nome : nomes) {
    System.out.println(nome);
}
```

## 📚 Recursos Externos

- [Documentação Oficial Java](https://docs.oracle.com/javase/)
- [Tutorial Java - Oracle](https://docs.oracle.com/javase/tutorial/)
- [DevSuperior - Cursos](https://www.devsuperior.com.br/)

## 👨‍💻 Autor

**Gabriel Sales David**
- GitHub: [@gabrielsalesdavid](https://github.com/gabrielsalesdavid)
- Estudante DevSuperior - Fundação de Programação

## 📄 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para:
1. Fork o projeto
2. Criar uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abrir um Pull Request

## 📞 Suporte

Se tiver dúvidas ou encontrar problemas:
- Abra uma issue no GitHub
- Verifique a documentação (FUNDAMENTOS.md e CONCEITOS.md)
- Consulte a [documentação oficial Java](https://docs.oracle.com/javase/)

## 🎓 Progresso do Aprendizado

- [x] Fundamentos de Java
- [x] Estruturas de Controle
- [x] Arrays e Matrizes
- [x] POO Básica
- [x] Encapsulamento
- [x] Herança e Polimorfismo
- [x] Interfaces
- [x] Genéricos
- [x] Coleções
- [x] Exceções
- [x] Expressões Lambda
- [x] Streams
- [ ] JPA/Hibernate
- [ ] Spring Boot
- [ ] Testes Unitários

## 📌 Últimas Atualizações

- **20 de novembro de 2025**: Adicionada documentação completa (FUNDAMENTOS.md e CONCEITOS.md)
- **20 de novembro de 2025**: Criado README.md com guia de uso

---

<div align="center">

**Feito com ❤️ para aprender Java**

[⬆ Voltar ao topo](#-devsuperior---linguagem-java)

</div>
