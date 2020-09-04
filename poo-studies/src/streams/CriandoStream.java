package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

  public static void main(String[] args) {

    Consumer<Object> print = System.out::print;

    Stream<String> langs = Stream.of("Java ", "Javascript ", "Dart ", "Kotlin\n");
    langs.forEach(print);

    String[] maisLangs = {"Ruby ", "Go ", "Python\n"};
    Stream.of(maisLangs).forEach(print);
    Arrays.stream(maisLangs).forEach(print);
    Arrays.stream(maisLangs, 0, 2).forEach(print);

    System.out.println();
    List<String> outrasLangs = Arrays.asList("C ", "Erlang ", "Html ", "Node\n");
    outrasLangs.stream().forEach(print);
    outrasLangs.parallelStream().forEach(print);

    //Stream.generate(() -> "a").forEach(print);
    // Stream.iterate(0, n -> n +1).forEach(print);

  }
}
