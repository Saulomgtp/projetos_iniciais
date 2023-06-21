package entities;

public class Circulo extends Formas {

    private Double raioCirculo;

    public Circulo() {

    }

    public Circulo(Color corDaForma, Double raioCirculo) {
        super(corDaForma);
        this.raioCirculo = raioCirculo;
    }

    public Double getRaioCirculo() {
        return raioCirculo;
    }

    public void setRaioCirculo(Double raioCirculo) {
        this.raioCirculo = raioCirculo;
    }
    @Override
    public Double areaForma() {
        return 3.14 * (raioCirculo * raioCirculo);
    }
}