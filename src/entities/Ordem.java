package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Ordem {

   private LocalDateTime dataPedido;
   private StatusOrdem statusPedido;
   private Cliente cliente;
   private List<OrdemItem> ordemList = new ArrayList<OrdemItem>();

   public Ordem () {
   }

    public Ordem(LocalDateTime dataPedido, StatusOrdem statusPedido, Cliente cliente) {
        this.dataPedido = dataPedido;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusOrdem getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusOrdem statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<OrdemItem> getOrdemList() {
        return ordemList;
    }

    public void adicionarItem(OrdemItem item) {
       ordemList.add(item);
  }
    public void removerItem(OrdemItem item) {
        ordemList.remove(item);
    }


    public double total() {
       double soma = 0;
       for (OrdemItem c : ordemList) {
           soma += c.subTotal();
       }
       return soma;
    }
    public String toString () {
       StringBuilder sb = new StringBuilder();
       sb.append("Resumo da ordem \n");
       sb.append("Momento do pedido: " + getDataPedido().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm" + "\n")));
       sb.append("Status da ordem: " + getStatusPedido() + "\n");
       sb.append(cliente + "\n");
       sb.append("Itens da ordem: \n");
       for (OrdemItem item : ordemList) {
           sb.append(item);
       }
       sb.append("Preço Total: R$");
       sb.append(total());
       return sb.toString();
    }
}




