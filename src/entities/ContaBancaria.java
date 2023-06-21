package entities;

public class ContaBancaria {

    private Integer numeroConta;
    private String nomeConta;
    private Double saldoConta;
    private Double limiteSaque;

    public ContaBancaria () {

    }

    public ContaBancaria(Integer numeroConta, String nomeConta, Double saldoConta, Double limiteSaque) {
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
        this.saldoConta = saldoConta;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void depositoConta(Double valor) {
        saldoConta += valor;
    }
    public void saqueConta(Double valor) throws ContaBancariaExcecao {
        if (saldoConta < valor) {
            throw new ContaBancariaExcecao("Erro de saque: Saldo insuficiente.");
        } else if (valor > limiteSaque) {
            throw new ContaBancariaExcecao("Erro de saque: Valor de saque acima do limite.");
        } else {
            saldoConta -= valor;
        }
    }
    public String toString () {
        return nomeConta + ", Saldo: R$" + String.format("%.2f", saldoConta) + ", limite para saque: R$" + String.format("%.2f", limiteSaque);
    }
}