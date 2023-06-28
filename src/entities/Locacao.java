package entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class Locacao {

    private String modeloCarro;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFinal;
    private Double precoHora;
    private Double precoDia;

    public Locacao() {

    }

    public Locacao(String modeloCarro, LocalDateTime dataInicio, LocalDateTime dataFinal, Double precoHora, Double precoDia) {
        this.modeloCarro = modeloCarro;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.precoHora = precoHora;
        this.precoDia = precoDia;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(Double precoDia) {
        this.precoDia = precoDia;
    }

    public Duration diferencaData() {
        return Duration.between(dataInicio, dataFinal);
    }
    public Double valorASerPago() {
        if (diferencaData().toHours() < 12) {
            if (diferencaData().toMinutes() % 60 != 0) {
                return (diferencaData().toHours() + 1) * precoHora;
            } else {
                return diferencaData().toHours() * precoHora;
            }
        } else {
            if (diferencaData().toHours() % 24 != 0) {
                return (diferencaData().toDays() + 1) * precoDia;
            } else {
                return diferencaData().toDays() * precoDia;
            }
        }
    }
    public Double taxa() {
        if (valorASerPago() <= 100.00) {
            return valorASerPago() * 0.2;
        } else {
            return valorASerPago() * 0.15;
        }
    }
    public Double valorTotalASerPago() {
        return valorASerPago() + taxa();
    }
    public String toString() {
        return "Carro: " + modeloCarro + "\nValor padrão: R$" + String.format("%.2f", valorASerPago()) + "\nValor da taxa: R$" + String.format("%.2f", taxa()) + "\nPagamento total a ser feito: R$" + String.format("%.2f", valorTotalASerPago());
    }
}
