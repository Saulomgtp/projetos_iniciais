package entities;

public class PessoaJuridica extends Contribuintes {

    private int numeroFuncionarios;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String nomeContribuinte, Double ganhoAnual, int numeroFuncionarios) {
        super(nomeContribuinte, ganhoAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double impostoPago() {
        double soma = 0;
        if (numeroFuncionarios > 10) {
            soma = ganhoAnual * 0.14;
        } else {
            soma = ganhoAnual * 0.16;
        }
        return soma;
    }
}