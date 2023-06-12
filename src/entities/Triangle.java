package entities;
public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
// a, b, c = atributos da classe
// area = métodos da classe (fórmula interna)

//benefícios = reaproveitar códigos (não fica códigos extensos no código fonte principal
//elimina códigos repetidos
