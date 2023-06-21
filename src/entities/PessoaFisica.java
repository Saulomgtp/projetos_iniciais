package entities;

public class PessoaFisica extends Contribuintes {

    private Double gastosSaude;

    public PessoaFisica() {

    }

    public PessoaFisica(String nomeContribuinte, Double ganhoAnual, Double gastosSaude) {
        super(nomeContribuinte, ganhoAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    @Override
    public Double impostoPago() {
        double soma = 0;
        if(ganhoAnual < 20000.00) {
            soma = ganhoAnual * 0.15;
        } else {
            soma = ganhoAnual * 0.25;
        }
        if (gastosSaude > 0) {
            soma -= gastosSaude/2;
        }
        return soma;
    }
}