package entities;

public class ProdutoImportado extends Produto1 {

    private Double custoImportacao;

    public ProdutoImportado () {

    }


    public ProdutoImportado(String nomeProduto, Double precoProduto, Double custoImportacao) {
        super(nomeProduto, precoProduto);
        this.custoImportacao = custoImportacao;
    }

    public Double getCustoImportacao() {
        return custoImportacao;
    }

    public void setCustoImportacao(Double custoImportacao) {
        this.custoImportacao = custoImportacao;
    }
    @Override
    public final String tagPreco() {
        return nomeProduto + " R$" + precoTotal() + " (Custo de importação: R$" + String.format("%.2f", custoImportacao) + ")";
    }
    public Double precoTotal() {
        return precoProduto + custoImportacao;
    }
}