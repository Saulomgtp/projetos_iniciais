package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private String nomeCliente;
    private String emailCliente;
    private LocalDate aniversarioCliente;

    public Cliente(){
    }

    public Cliente(String nomeCliente, String emailCliente, LocalDate aniversarioCliente) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.aniversarioCliente = aniversarioCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public LocalDate getAniversarioCliente() {
        return aniversarioCliente;
    }

    public void setAniversarioCliente(LocalDate aniversarioCliente) {
        this.aniversarioCliente = aniversarioCliente;
    }
    public String toString() {
        return "Cliente: " + nomeCliente + " " + aniversarioCliente.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + emailCliente;
    }
}