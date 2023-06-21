package entities;




public abstract class Contribuintes {

    protected String nomeContribuinte;
    protected Double ganhoAnual;

    public Contribuintes() {

    }

    public Contribuintes(String nomeContribuinte, Double ganhoAnual) {
        this.nomeContribuinte = nomeContribuinte;
        this.ganhoAnual = ganhoAnual;
    }

    public String getNomeContribuinte() {
        return nomeContribuinte;
    }

    public void setNomeContribuinte(String nomeContribuinte) {
        this.nomeContribuinte = nomeContribuinte;
    }

    public Double getGanhoAnual() {
        return ganhoAnual;
    }

    public void setGanhoAnual(Double ganhoAnual) {
        this.ganhoAnual = ganhoAnual;
    }
    public Double impostoPago() {
        return null;
    }
}