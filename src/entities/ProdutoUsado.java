package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto1 {

    private LocalDate dataProducao;

    public ProdutoUsado() {

    }

    public ProdutoUsado(String nomeProduto, Double precoProduto, LocalDate dataProducao) {
        super(nomeProduto, precoProduto);
        this.dataProducao = dataProducao;
    }

    public LocalDate getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(LocalDate dataProducao) {
        this.dataProducao = dataProducao;
    }
    @Override
    public final String tagPreco() {
        return nomeProduto + " (usado) R$" + precoProduto + " (Fabricado no dia " + dataProducao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}