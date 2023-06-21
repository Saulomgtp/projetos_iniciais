package entities;




public abstract class Formas {

    protected Color corDaForma;

    public Formas () {

    }
    public Formas(Color corDaForma) {
        this.corDaForma = corDaForma;
    }

    public Color getCorDaForma() {
        return corDaForma;
    }

    public void setCorDaForma(Color corDaForma) {
        this.corDaForma = corDaForma;
    }

    public Double areaForma() {
        return null;
    }
}