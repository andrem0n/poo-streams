package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

  public static void main(String[] args) {
    List<String> aprovados = Arrays.asList("André", "Ana", "João", "Maria");

    System.out.println("Usando foreach...");
    for (String nome : aprovados) {
      System.out.println(nome);
    }

    System.out.println("\nUsando Iterator...");
    Iterator<String> iterator = aprovados.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println("\nUsando stream...");
    Stream<String> stringStream = aprovados.stream();
    stringStream.forEach(System.out::println);
  }
}
