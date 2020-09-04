package composicao.compra;

import java.util.Arrays;

public class CompraTest {

  public static void main(String[] args) {
    Compra compra1 = new Compra();
    compra1.setItens(Arrays.asList(new Item("Caneta", 7, 3.0),
        new Item("Caderno", 3, 12.0),
        new Item("Mochila", 1, 100.0)));
    compra1.setCliente("Adailton");

    System.out.println(compra1);
    System.out.println(compra1.getValorTotal());
  }
}
