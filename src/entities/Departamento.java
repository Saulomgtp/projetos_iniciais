package entities;

public class Departamento {

    private String departamentoTrabalhador;

    public Departamento(){

    }

    public Departamento(String nomeTrabalhador) {
        this.departamentoTrabalhador = nomeTrabalhador;
    }

    public String getDepartamentoTrabalhador() {
        return departamentoTrabalhador;
    }

    public void setDepartamentoTrabalhador(String departamentoTrabalhador) {
        this.departamentoTrabalhador = departamentoTrabalhador;
    }
    public String toString() {
        return "Departamento: "
                + departamentoTrabalhador;
    }
}
