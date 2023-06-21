package entities;

public class ContaEmpresaHeranca extends ContaHeranca {

    private Double limiteEmprestimo;

    public ContaEmpresaHeranca() {

    }

    public ContaEmpresaHeranca(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public ContaEmpresaHeranca(Integer numeroConta, String titularConta, Double saldoConta, Double limiteEmprestimo) {
        super(numeroConta, titularConta, saldoConta);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            saldoConta += valor - 10;
        }
    }
    @Override
    public void saqueConta(Double valor) {
        super.saqueConta(valor);
        saldoConta -= 2;
    }

}