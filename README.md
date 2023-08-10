# Modelagem de Bolas

Este é um programa simples para modelar uma bola em Java, utilizando as classes `Bola` e `Programa`. O programa permite criar uma instância da classe `Bola`, definir suas propriedades como cor, raio e material, e também trocar a cor da bola.

## Classes

### Bola

A classe `Bola` representa uma bola com as seguintes propriedades:

- `cor`: A cor da bola.
- `circunferencia`: A circunferência da bola (raio).
- `material`: O material da bola.

#### Construtores

- `Bola()`: Construtor vazio.
- `Bola(String cor, Double circunferencia, String material)`: Construtor que inicializa a bola com cor, circunferência e material especificados.

#### Métodos

- `getCor()`: Retorna a cor da bola.
- `setCor(String cor)`: Define a cor da bola.
- `getCircunferencia()`: Retorna a circunferência da bola.
- `setCircunferencia(Double circunferencia)`: Define a circunferência da bola.
- `getMaterial()`: Retorna o material da bola.
- `setMaterial(String material)`: Define o material da bola.
- `trocaCor(String novaCor)`: Altera a cor da bola para a nova cor fornecida.
- `mostraCor()`: Retorna a cor atual da bola.
- `area(Double circunferencia)`: Calcula e retorna a área da bola com base na circunferência.
- `toString()`: Retorna uma representação em formato de string da bola, incluindo cor, área e material.

### Programa

A classe `Programa` contém o método `main` para executar o programa. Ele permite que o usuário insira informações sobre uma bola e, opcionalmente, troque a cor da bola.

## Uso

1. Execute o programa e siga as instruções para inserir a cor, circunferência (raio) e material da bola.
2. Se desejar, você pode optar por trocar a cor da bola.

## Exemplo de Uso

```java
Modelagem de Bolas
==================
Cor: Vermelho
Raio: 5.0
Material: Borracha
Bola [cor: Vermelho, circunferencia: 78.54, material: Borracha]
Deseja mudar a cor da bola(s/n)? s
Qual a nova cor: Azul
Bola [cor: Azul, circunferencia: 78.54, material: Borracha]
```

Lembre-se de que este é um exemplo simples e pode ser expandido com mais recursos e funcionalidades, se necessário.

---

**Programa de Modelagem de Bolas para Aprendizado Acadêmico**

Este programa simples de modelagem de bolas foi desenvolvido com a finalidade de fornecer uma abordagem prática para o aprendizado acadêmico. Ao explorar os conceitos fundamentais de programação orientada a objetos, a aplicação demonstra a criação e manipulação de objetos através da classe `Bola`.

Através deste projeto, os estudantes podem praticar a implementação de classes, construtores, métodos e atributos em Java, uma linguagem de programação amplamente utilizada no contexto acadêmico e profissional. A criação de uma instância da classe `Bola` permite explorar como os atributos como cor, circunferência e material podem ser definidos e manipulados.

Além disso, o programa apresenta uma interação simples com o usuário, permitindo que informações sobre a bola sejam inseridas e visualizadas. A opção de alterar a cor da bola oferece uma oportunidade de praticar a chamada de métodos e atualização de atributos de objetos.

Por meio deste projeto, os estudantes podem ganhar experiência prática na implementação de conceitos teóricos, reforçando seu entendimento da programação orientada a objetos. O programa serve como um recurso educativo valioso para auxiliar no desenvolvimento das habilidades necessárias para projetos acadêmicos e além.

---
