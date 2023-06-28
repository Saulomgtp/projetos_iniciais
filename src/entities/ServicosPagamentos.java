package entities;

public interface ServicosPagamentos {
    public Double taxaPagamento(Double valor);
    public Double juros (Double valor, Integer meses, Integer parcela);





}
