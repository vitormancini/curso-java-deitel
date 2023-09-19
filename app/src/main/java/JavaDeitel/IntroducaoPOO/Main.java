// PROGRAMA QUE CRIA A MANIPULA UM OBJETO DO TIPO ContaBancaria

package JavaDeitel.IntroducaoPOO;

// Usando JOptionPane para exibir múltiplas linhas em uma caixa de diálogo.
import javax.swing.JOptionPane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Exibe uma caixa de diálogo com uma mensagem
        // O método showMessageDialog é um método static, ou seja, não preciso instanciar um objeto da classe JOptionPane para chama-lo
        JOptionPane.showMessageDialog(null, "Introdução a PPO!");
        
        Scanner scan = new Scanner(System.in);
        String nome;
        
        // Instancia um objeto ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria();
        
        // Exibe o valor inicial de nome
        System.out.printf("Valor inicila da variável nome: %s", minhaConta.getNome());
        
        // Solicitando um nome para o usuário através da interface gráfica e atribuindo a variável nome
        nome = JOptionPane.showInputDialog("Informe o nome da conta");
        
        // Atribui o valor que o usuário digitou na variável nome
        minhaConta.setNome(nome);
        
        // Exibe o valor final de nome
        System.out.printf("\nValor inicila da variável nome: %s", minhaConta.getNome());
        
        // Instancia outra conta passando parâmetros ao construtor (nome e saldo)
        ContaBancaria novaConta = new ContaBancaria("José", 1000.00);
        
        // Exibe o valor de nome da conta instanciada com construtor
        System.out.printf("\nValor de nome de nova conta: %s", novaConta.getNome());
        System.out.printf("\nSaldo na nova conta: %.2f", novaConta.getSaldo()); // %.2f define duas casas decimais
        
        // ----- Tipos primitivos VS tipos por referência -----
        // Tipos primitivos: char, int, double, float, double, boolean, long, short, byte   
        // Tipos por referência: objetos de classes
    }
}
