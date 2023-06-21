package secao1;

import entities.Comentario;
import entities.Post;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;


public class Publicação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Comentario c1 = new Comentario("Tenha uma boa viagem");
        Comentario c2 = new Comentario("Uau que incrível");

        LocalDateTime dataPost1 = LocalDateTime.parse(("2018-06-21T13:05:44"));
        String tituloPost1 = "Viajando para Nova Zelandia";
        String conteudoPost1 = "Estou indo visitar esse maravilhoso pais";
        int curtidasPost1 = 12;
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Post post1 = new Post(dataPost1, tituloPost1, conteudoPost1, curtidasPost1);
        post1.adicionarComentario(c1);
        post1.adicionarComentario(c2);

        System.out.println(post1);





    }
}


