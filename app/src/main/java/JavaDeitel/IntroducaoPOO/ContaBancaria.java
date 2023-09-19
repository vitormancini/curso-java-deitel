package JavaDeitel.IntroducaoPOO;

public class ContaBancaria {
    
    private String nome; // Variável de instância (privada)
    private double saldo; // Variável de instância
    
    // Construtor sem parâmetros (método executado assim que a classe é instanciada, não podem retorna valores)
    public ContaBancaria() {}
    
    // Construtor com parâmetros (atribuímos o valor de nome recebido no construtor e passamos para a variável nome). Estamos fazendo uma sobrecarga de construtores
    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        
        // Valida se saldo é maior que 0 para que seja atribuído na variável de instância
        if (saldo > 0.0) {
            this.saldo = saldo;
        }
    }

    // Método para leitura da variável nome (encapsulamento)
    public String getNome() {
        return nome; // retorna o valor da variável nome para o método que chamar getNome()
    }

    // Método de escrita da variável nome (encapsulamento)
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Método que não retorna nenhum valor (void) responsável por adicionar saldo na conta
    public void Deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor; // Se valor for maior que 0, adicionamos o valor em saldo (+=)
        }
    }
    
    // Método que retorna o saldo da conta
    public double getSaldo() {
        return this.saldo;
    }
    
    // ----- Modificadores de acesso -----
    // public - em qualquer ponto do código da aplicação a classe / variável / método poderá ser acessado
    // private - podemos acessar a variável / método apenas dentro da classe que foi criada
}
