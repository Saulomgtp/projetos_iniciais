package entities;

import java.time.LocalDateTime;

public class SetExercicioResolvido {

    private String nomeUsuario;
    private LocalDateTime instantLog;

    public SetExercicioResolvido () {

    }

    public SetExercicioResolvido(String nomeUsuario, LocalDateTime instantLog) {
        this.nomeUsuario = nomeUsuario;
        this.instantLog = instantLog;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public LocalDateTime getInstantLog() {
        return instantLog;
    }

    public void setInstantLog(LocalDateTime instantLog) {
        this.instantLog = instantLog;
    }
}
