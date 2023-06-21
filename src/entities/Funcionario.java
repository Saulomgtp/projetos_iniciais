package entities;

public class Funcionario {

    private Integer codigoFuncionario;
    private String nomeFuncionario;
    private Double salarioFuncionario;

    public Funcionario(Integer codigoFuncionario, String nomeFuncionario, Double salarioFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public Integer getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(Integer codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(Double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
    public void aumentoSalario(double percentage) {
        salarioFuncionario += salarioFuncionario * percentage / 100;            // criei meu método e o percentage acabei de criar
    }
    public String toString() {
        return codigoFuncionario
                + ", "
                +nomeFuncionario
                +", "
                + String.format("%.2f", salarioFuncionario);
    }
}