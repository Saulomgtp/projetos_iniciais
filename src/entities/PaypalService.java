package entities;

public class PaypalService implements ServicosPagamentos {

    @Override
    public Double taxaPagamento(Double valor) {
        return null;
    }

    @Override
    public Double juros(Double valor, Integer meses, Integer parcela) {
        double soma = valor / meses;
            soma += soma * (0.01*parcela);
            soma += soma * 0.02;
        return soma;
    }
}
