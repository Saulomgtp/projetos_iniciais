package entities;

import java.time.LocalDate;

public enum Color {
    PRETO,
    AZUL,
    VERMELHO;

    public static class ParcelasContrato {
        public static LocalDate getDataVencimento(entities.ParcelasContrato parcelasContrato) {
            return parcelasContrato.dataVencimento;
        }
    }
}
