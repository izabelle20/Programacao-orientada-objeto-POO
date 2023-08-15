package lista1.atividade1;
/* 
----------------------------------------------------- Atividade 1 -----------------------------------------------------------------------
Instruções
Crie um programa em linguagem Java que implemente uma classe com método main e um método verificaNumeroPrimo(Integer n), retornando:

0 - se o número não for primo;

1 - se o número for primo.

No método main(), faça uma chamada ao método verificaNumeroPrimo e imprima no console o resultado.

O programa deve se chamar verificaNumeroPrimo.java e deve estar em uma pasta chamada atividade1 no repositório do github.

------------------------------------------------------------------------------------------------------------------------------------------*/
public class VerificaNumeroPrimo {
    public static void main(String[] args) {
        int numero = 2; 
        int resultado = verificaNumeroPrimo(numero);
        
        if (resultado == 0) {
            System.out.println(numero + " não é um número primo.");
        } else {
            System.out.println(numero + " é um número primo.");
        }
    }
    
    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        
        return 1;
    }
}
