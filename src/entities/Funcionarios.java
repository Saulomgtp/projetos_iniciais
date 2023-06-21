package entities;

public class Funcionarios {

    protected String nomeFuncionario;
    protected Integer horasTrabalhadas;
    protected Double valorHora;


    public Funcionarios() {

    }

    public Funcionarios(String nomeFuncionario, Integer horasTrabalhadas, Double valorHora) {
        this.nomeFuncionario = nomeFuncionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double pagamento () {
        return horasTrabalhadas * valorHora;
    }
}