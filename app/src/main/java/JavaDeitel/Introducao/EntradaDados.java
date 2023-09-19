// PROGRAMA QUE RECEBE DOIS NÚMEROS E EXIBE A SOMA DELES

package JavaDeitel.Introducao;

// Este programa irá utilizar a classe Scanner para leitura de dados do teclado
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        
        // Cria um scanner para obter o que o usuário digitar
        Scanner scan = new Scanner(System.in);
        
        int n1; // Primeiro número a somar
        int n2; // Segundo número a somar
        int soma; // Resultado da soma
        
        System.out.print("Informe o primeiro número: ");
        n1 = scan.nextInt(); // Lê o primeiro número informado pelo usuário
        
        System.out.print("Informe o segundo número: ");
        n2 = scan.nextInt(); // Lê o segundo número informado pelo usuário
        
        soma = n1 + n2; // Somando os dois números informados pelo usuário
        
        System.out.printf("Resultado da soma é %d", soma);
        System.out.printf("\nOutra forma de realizar a soma é %d", (n1 + n2));
        
        // ----- Expressões aritméticas ----- 
        // + soma
        // - subtração
        // * multiplicação
        // / divisão
        // % resto da divisão
    }
}
