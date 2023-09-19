// PROGRAMA QUE RECEBE DOIS NÚMEROS DECIMAIS (DOUBLE/FLOAT) DIGITADOS PELO USUÁRIO E INFORMA O MAIOR ENTRE ELES

package JavaDeitel.Introducao;

import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double n1; // Armazena o primeiro número decimal
        double n2; // Armazena o segundo número decimal
        
        System.out.print("Informe o primeiro número:");
        n1 = scan.nextDouble(); // Lê o primeiro valor decimal digitado pelo usuário
        
        System.out.print("Informe o segundo número:");
        n2 = scan.nextDouble(); // Lê o segundo valor decimal digitado pelo usuário
        
        // Verificando qual número é maior utilizando o if
        if (n1 > n2) { // primeira comparação
            System.out.println("O primeiro número é maior!");
        }
        else if (n1 < n2) { // Segunda compração
            System.out.println("O segundo número é maior!");
        }
        else { // Caso nenhuma das duas comprações acima sejam satisfeitas, será executado o bloco else
            System.out.println("Os dois números são iguais");
        }
        
        // ----- Operadores relacionais -----
        // < menor
        // > maior
        // = igual
        // != diferente
        // <= menor ou igual
        // >= maior ou igual
    }
}
