package lista1.atividade2;  // Declaração do pacote

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

import java.util.Scanner;

public class Exercicio1 {  // Declaração da classe

    private Integer a;  // Declaração dos atributos
    private Integer b;
    private String operador;

    public Integer getA() {  // Método getter para 'a'
        return this.a;
    }

    public void setA(Integer a) {  // Método setter para 'a'
        this.a = a;
    }

    public Integer getB() {  // Método getter para 'b'
        return this.b;
    }

    public void setB(Integer b) {  // Método setter para 'b'
        this.b = b;
    }

    public String getOperador() {  // Método getter para 'operador'
        return this.operador;
    }

    public void setOperador(String op) throws Exception {  // Método setter para 'operador'
        Boolean err = true;
        switch (op) {  // Verifica se o operador é válido
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

        if (err) {  // Lança exceção se o operador for inválido
            throw new Exception("Operador inválido");
        }

        this.operador = op;  // Atribui o operador
    }

    public Integer operar() {  // Método para realizar a operação
        Integer ret = 0;
        switch (this.operador) {  // Executa a operação conforme o operador
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
        return ret;  // Retorna o resultado
    }

    public static void main(String[] args) {  // Método main para iniciar o programa
        try (Scanner scanner = new Scanner(System.in)) {
            Exercicio1 calculadora = new Exercicio1();  // Criação de uma instância da classe

            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            calculadora.setA(numero1);  // Define o valor de 'a'

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            calculadora.setB(numero2);  // Define o valor d7e 'b'

            System.out.print("Digite a operação (+, -, *, /): ");
            String operacao = scanner.next();
            try {
                calculadora.setOperador(operacao);  // Define o operador
            } catch (Exception e) {
                System.out.println(e.getMessage());  // Trata exceção, se ocorrer
                return;  // Encerra o programa em caso de erro
            }

            int resultado = calculadora.operar();  // Realiza a operação
            System.out.println("Resultado: " + resultado);  // Exibe o resultado
        }
    }
}
