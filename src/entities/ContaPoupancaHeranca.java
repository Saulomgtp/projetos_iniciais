package entities;

public final class ContaPoupancaHeranca extends ContaHeranca {

    private Double taxaJuros;

    public ContaPoupancaHeranca() {

    }


    public ContaPoupancaHeranca(Integer numeroConta, String titularConta, Double saldoConta, Double taxaJuros) {
        super(numeroConta, titularConta, saldoConta);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void adicionarJuros() {
        saldoConta += saldoConta * taxaJuros;
    }
    @Override
    public void saqueConta(Double valor) {
        saldoConta -= valor;
    }
}