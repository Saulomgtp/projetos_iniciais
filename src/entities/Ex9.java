package entities;

public class Ex9 {

    private final int conta;
    private String nome;
    private double saldo;

    public Ex9(int conta, String nome, double depositoInicial) {
         this(conta, nome);
         this.saldo = depositoInicial;
    }

    public Ex9(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
        this.saldo = 0;
    }

    // criei dois construtores para as duas ocasiões, com saldo e sem saldo.
    // construtores constroem as "variáveis" que são criadas. Iniciam ela antes mesmo dela ser iniciada no programa

    // getters \/


    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // setters \/

    public void setNome(String nome) {
        this.nome = nome;
    }

    // começar a criar meus métodosssssssss
    // porque no exercício eles utilizaram void? vou testar sem o void e ver o que da
    // o método nesse caso não vai retornar nada, ele apenas vai fazer a conta, e depois eu tenho que fazer o print dele
    // acho que eu tenho que utilizar o void para já declarar a variável que será utilizada no método
    // se eu for utilizar uma variável que ainda será iniciada, preciso declarar ela no método dentro do parênteses
    // void não retorna nada

    public void deposito (double valor) {
        saldo += valor;
    }
    public void saque (double valor) {
        saldo -= valor + 5;
    }
    public String toString() {
        return "Account "
                + conta
                + ". Nome do propietário da conta: "
                + nome
                + ", Saldo: R$"
                + String.format("%.2f", saldo);
    }

}
