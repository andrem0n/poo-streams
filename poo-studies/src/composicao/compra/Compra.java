package composicao.compra;

import java.util.ArrayList;
import java.util.List;

public class Compra {

  private String cliente;
  private List<Item> itens = new ArrayList<>();


  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public List<Item> getItens() {
    return itens;
  }

  public void setItens(List<Item> itens) {
    this.itens = itens;
  }

  @Override
  public String toString() {
    return "Compra{" +
        "cliente='" + cliente + '\'' +
        ", itens=" + itens +
        '}';
  }

  public double getValorTotal() {
    double total = 0;
    for (Item item : this.itens) {
      total += item.getPreco();
    }
    return total;
  }
}
