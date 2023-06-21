package entities;


import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;


public class Trabalhador {

    private String nomeTrabalhador;
    private NivelTrabalhador nivelTrabalhador;
    private Double salarioBase;

    // trazer no objeto principal as composições diretamente relacionadas
    // se for algo que o objeto vai ter várias, fazer a lista (como exemplo o contratos
    private Departamento departamento;
    private List<Contratos> contratos = new ArrayList<>();

    // já instanciar a lista

    public Trabalhador() {

    }

    //gerar o construtor sem a lista
    public Trabalhador(String nomeTrabalhador, NivelTrabalhador nivelTrabalhador, Double salarioBase, Departamento departamento) {
        this.nomeTrabalhador = nomeTrabalhador;
        this.nivelTrabalhador = nivelTrabalhador;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNomeTrabalhador() {
        return nomeTrabalhador;
    }

    public void setNomeTrabalhador(String nomeTrabalhador) {
        this.nomeTrabalhador = nomeTrabalhador;
    }

    public NivelTrabalhador getNivelTrabalhador() {
        return nivelTrabalhador;
    }

    public void setNivelTrabalhador(NivelTrabalhador nivelTrabalhador) {
        this.nivelTrabalhador = nivelTrabalhador;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contratos> getContratos() {
        return contratos;
    }

    public void adicionarContrato(Contratos contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(Contratos contrato) {
        contratos.remove(contrato);
    }

    public Double renda(int ano, int mes) {
        double salarioBase = this.salarioBase;
        for (Contratos c : contratos) {
                                     //forma de chamar o ano
            int c_ano = c.getData().getYear();
                      //chamando data do contrato
            int c_mes = c.getData().getMonthValue();
            if(ano == c_ano && mes == c_mes) {
                salarioBase+= c.totalGanho();
            }
    }
        return salarioBase;
    }


}
