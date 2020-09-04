package lambdas.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;

public class Predicado {

//  Predicate<Produto> isCaro = produto -> produto.preco > 750;
//
//  Produto produto = new Produto("teclado", 450.0, 10.0);
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("================= início exercício 1 =========================");
    List<Integer> array = new ArrayList<>();

    for (int i = 0; i <= 100; i++) {
      array.add(i);
    }
    System.out.println("Números pares entre 0 e 100:");
    for (Integer numero : array) {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    }

    System.out.println("========================== fim exercicio 1 ================");
    System.out.println();
    System.out.println("========================== início exercicio 2 ================");

    System.out.println("Digite seu cpf: ");
    String cpf = scanner.nextLine();

    boolean numeros = cpf.matches("^\\d+$");
    if (cpf.length() == 11 && numeros) {
      System.out.println("cpf validado com sucesso");
    } else {
      System.out.println("O cpf deve ter exatamente 11 caracteres, e apenas valores numéricos!");
    }

    System.out.println("Cpf: " + cpf);
    System.out.println();
    System.out.println("========================== início exercicio 2 ================");
  }


}
