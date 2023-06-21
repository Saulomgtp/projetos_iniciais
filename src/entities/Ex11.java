package entities;

public class Ex11 {

    private final int conta;
    private String nome;
    private double saldo;

// dois tipos de construtores, um que vai receber 3 argumentos e o outro 2 argumentos (sem o saldo, pois ele pode iniciar zerado)

    public Ex11(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }
// construtor com 2 argumentos /\
    public Ex11(int conta, String nome, double depositoInicial) {
        this.conta = conta;
        this.nome = nome;
        deposito(depositoInicial); // < está falando pra minha double assumir o deposito inicial (chamando a operação de deposito passando o "depositoInicial" como argumento
    }
    // construtor com 3 argumentos /\


    // Getters \/
    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters \/
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposito(double valor) {
        saldo += valor;
    }
    // deposito é o método e o valor é a variável
    // SEMPRE USAR O OBJETO "SALDO" JÁ CRIADO

    public void saque(double valor) {
        saldo -= valor + 5;
    }
    // saque é o método e o valor é a variável
    // SEMPRE USAR O OBJETO "SALDO" JÁ CRIADO


    public String toString() {
        return "Conta "
                + conta
                + ", Nome do titular: "
                + nome
                +", Saldo: R$"
                + String.format("%.2f", saldo);
    }
}
