package entities;

public class ContaHeranca {

    private Integer numeroConta;
    private String titularConta;
    protected Double saldoConta;

    public ContaHeranca(){

    }

    public ContaHeranca(Integer numeroConta, String titularConta, Double saldoConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void saqueConta(Double valor) {
        saldoConta -= valor + 5;
    }
    public void depositoConta(Double valor) {
        saldoConta += valor;
    }
}