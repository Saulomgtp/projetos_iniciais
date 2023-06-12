package entities;

public class Ex5 {

    public String aluno;

    public int nota1;
    public int nota2;
    public int nota3;

    public int soma() {
        return nota1 + nota2 + nota3;
    }

    public String toString() {
        return aluno + " ficou com o resultado de " + soma() + " pontos";
    }
}
