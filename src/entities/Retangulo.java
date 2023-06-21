package entities;

import java.awt.*;

public class Retangulo extends Formas {

    private Double largura;
    private Double altura;

    public Retangulo () {

    }
    public Retangulo(Color corDaForma, Double largura, Double altura) {
        super(corDaForma);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double areaForma() {
        return largura * altura;
    }
}