package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime momentoPost;
    private String tituloPost;
    private String conteudoPost;
    private Integer curtidasPost;

    private List<Comentario> comentario = new ArrayList<>();

    public Post() {

    }

    public Post(LocalDateTime momentoPost, String tituloPost, String conteudoPost, Integer curtidasPost) {
        this.momentoPost = momentoPost;
        this.tituloPost = tituloPost;
        this.conteudoPost = conteudoPost;
        this.curtidasPost = curtidasPost;
    }

    public LocalDateTime getMomentoPost() {
        return momentoPost;
    }

    public void setMomentoPost(LocalDateTime momentoPost) {
        this.momentoPost = momentoPost;
    }

    public String getTituloPost() {
        return tituloPost;
    }

    public void setTituloPost(String tituloPost) {
        this.tituloPost = tituloPost;
    }

    public String getConteudoPost() {
        return conteudoPost;
    }

    public void setConteudoPost(String conteudoPost) {
        this.conteudoPost = conteudoPost;
    }

    public Integer getCurtidasPost() {
        return curtidasPost;
    }

    public void setCurtidasPost(Integer curtidasPost) {
        this.curtidasPost = curtidasPost;
    }

    public List<Comentario> getComentario() {
        return comentario;
    }

    public void adicionarComentario (Comentario comentario) {
        this.comentario.add(comentario);
    }
    public void removerComentario (Comentario comentario) {
        this.comentario.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tituloPost + "\n");
        sb.append(curtidasPost);
        sb.append(" Likes  - ");
        sb.append(momentoPost.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n");
        sb.append(conteudoPost + "\n");
        sb.append("Comentários: \n");
        for (Comentario c : comentario) {
            sb.append(c.getComentario() + "\n");
        }
        return sb.toString();




    }


}