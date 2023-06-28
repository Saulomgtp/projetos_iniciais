package entities;

import java.time.LocalDate;

public class ParcelasContrato {

    LocalDate dataVencimento;
    private Double valorParcela;

    public ParcelasContrato() {

    }

    public ParcelasContrato(LocalDate dataVencimento, Double valorParcela) {
        this.dataVencimento = dataVencimento;
        this.valorParcela = valorParcela;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

}
