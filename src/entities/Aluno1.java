package entities;


public class Aluno1 {

   private String nome;
   private double[] notas;
   private double media;

   public Aluno1(String nome, double[] notas) {
       this.nome = nome;
       this.notas = notas;
       calcularMedia();
   }
   private void calcularMedia() {
       double soma = 0;
       for(int i = 0; i < notas.length; i++) {
           soma += notas[i];
       }
       media = soma / notas.length;
   }

   public double getMedia() {
       return media;
   }
   public String getNome() {
       return nome;
   }








}
