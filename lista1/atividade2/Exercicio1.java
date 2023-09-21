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

public class Exercicio1 {  

    private Integer a;  
    private Integer b;
    private String operador;

    public Integer getA() {  
        return this.a;
    }

    public void setA(Integer a) {  
        this.a = a;
    }

    public Integer getB() {  
        return this.b;
    }

    public void setB(Integer b) {  
        this.b = b;
    }

    public String getOperador() {  
        return this.operador;
    }

    public void setOperador(String op) throws Exception {  
        Boolean err = true;
        switch (op) {  
            case "+":
                err = false;
                break;
            case "-":
                err = false;
                break;
            case "*":
                err = false;
                break;
            case "/":
                err = false;
                break;
        }

        if (err) {  
            throw new Exception("Operador inválido");
        }

        this.operador = op;  
    }

    public Integer operar() { 
        Integer ret = 0;
        switch (this.operador) {  
            case "+":
                ret = this.a + this.b;
                break;
            case "-":
                ret = this.a - this.b;
                break;
            case "*":
                ret = this.a * this.b;
                break;
            case "/":
                ret = this.a / this.b;
                break;
        }
        return ret;  
    }

    public static void main(String[] args) {  
        try (Scanner scanner = new Scanner(System.in)) {
            Exercicio1 calculadora = new Exercicio1(); 

            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            calculadora.setA(numero1);  

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            calculadora.setB(numero2);  

            System.out.print("Digite a operação (+, -, *, /): ");
            String operacao = scanner.next();
            try {
                calculadora.setOperador(operacao);  
            } catch (Exception e) {
                System.out.println(e.getMessage());  
                return;  
            }

            int resultado = calculadora.operar();  
            System.out.println("Resultado: " + resultado);  
        }
    }
}
