package entities;

public class Produto1 {

    protected String nomeProduto;
    protected Double precoProduto;

    public Produto1 () {

    }

    public Produto1(String nomeProduto, Double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
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
    public String tagPreco() {
        return nomeProduto + " R$" + precoProduto;
    }
}