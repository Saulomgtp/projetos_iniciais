package entities;

public class Ex7 {
    public double dolar;
    public double compra;
    public static double tax = 0.06;

    public double converter () {
        return ((dolar * compra) * tax) + (dolar * compra);
    }
    public String toString () {
        return "Valor que deverá ser pago em reais: " + String.format("%.2f", converter());
    }
}
