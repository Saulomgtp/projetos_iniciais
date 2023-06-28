package entities;

import java.util.Objects;

public class ClienteEquals {

    private String nomeCliente;
    private String emailCliente;

    public ClienteEquals(String nomeCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClienteEquals)) return false;
        ClienteEquals that = (ClienteEquals) o;
        return Objects.equals(getNomeCliente(), that.getNomeCliente()) && Objects.equals(getEmailCliente(), that.getEmailCliente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeCliente(), getEmailCliente());
    }
}
