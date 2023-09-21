package lista1.atividade2;

import java.util.Scanner;

/* 
------------------------------------------------------ Atividade 2 ----------------------------------------------------------------
Instruções
No se repositório de atividades da disciplina, crie uma pasta atividade2. Dentro dessa pasta, crie os arquivos/classes Exercicio1.java 
e Exercicio2.java. Essas classes devem possuir o método main() e serem executáveis. Casa classe deve implementar a solução do exercício equivalente:

Exercício 1: Calculadora Simples Crie um programa Java que funcione como uma calculadora simples. Peça ao usuário para inserir 
dois números e uma operação (+, -, *, /). Realize a operação escolhida e exiba o resultado.
Exercício 2: Conversor de Temperatura Crie um conversor de temperatura que permita ao usuário converter entre Celsius e Fahrenheit. 
Peça ao usuário para escolher a direção da conversão e, em seguida, faça a conversão e exiba o resultado.

*/
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt(); 

        if (escolha == 1) { 
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble(); 

            double fahrenheit = (celsius * 9/5) + 32; 
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (escolha == 2) {  
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();  
            double celsius = (fahrenheit - 32) * 5/9; 
            System.out.println("A temperatura em Celsius é: " + celsius);
        } else {
            System.out.println("Escolha inválida!");  
        }

        scanner.close();  
    }
}
