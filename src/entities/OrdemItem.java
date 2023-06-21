package entities;

public class OrdemItem {

    private Integer quantidadeItens;
    private Double precoProduto;

    private Produto produto;

    public OrdemItem(){

    }

    public OrdemItem(Integer quantidadeItens, Double precoProduto, Produto produto) {
        this.quantidadeItens = quantidadeItens;
        this.precoProduto = precoProduto;
        this.produto = produto;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal () {
        return quantidadeItens * precoProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String toString() {
        return produto.getNomeProduto() + ", R$" + precoProduto + ", Quantidade: " + quantidadeItens + ", Total: R$" + subTotal() + "\n";
    }
}