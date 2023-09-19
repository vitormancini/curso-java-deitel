// PROGRAMA DE IMPRESSÃO DE TEXTO

package JavaDeitel.Introducao;

// Declarando uma classe
public class PrimeiroPrograma {
    
    // O método main inicia a execução  do programa Java. É o ponto de partida
    public static void main(String[] args) {
        
        System.out.println("Bem-vindo ao mundo Java!"); // Comando de saída de texto no console (terminal)  
        
        // Podemos quebrar linha através do \n
        System.out.println("\nBem-vindo\nao\nmundo\nJava!");
        
        // Exbindo textos com printf (exibe os dados formatados)
        System.out.printf("\n%s %s", "Bem-vindo", "ao Java!");
        
    } // Fim do método main
} // Fim da classe


// Compilando o programa via terminal:
// * javac PrimeiroPrograma.java
// Caso o código não tenha nenhum erro, um novo arquivo chamado PrimeiroPrograma.class será criado, que contém os bytecodes Java independente do SO utilizado
// Para executar o programa, usamos java PrimeiroPrograma.class