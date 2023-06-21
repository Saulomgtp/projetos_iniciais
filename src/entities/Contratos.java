package entities;


import java.time.LocalDate;


public class Contratos {

private LocalDate data;
private Double valorHora;
private Integer quantidadeHoras;

public Contratos () {

}

    public Contratos(LocalDate data, Double valorHora, Integer quantidadeHoras) {
        this.data = data;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Integer quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public Double totalGanho () {
    return valorHora * quantidadeHoras;
    }
}