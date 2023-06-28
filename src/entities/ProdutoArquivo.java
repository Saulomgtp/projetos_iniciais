package entities;

public class ProdutoArquivo {

    private String nomeProduto;
    private Double precoProduto;
    private Integer quantidadeProduto;

    public ProdutoArquivo() {

    }

    public ProdutoArquivo(String nomeProduto, Double precoProduto, Integer quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    public Double valortotalProdutos() {
        return precoProduto * quantidadeProduto;
    }

    public String toString() {
        return nomeProduto + ", " + String.format("%.2f", valortotalProdutos());
    }
}