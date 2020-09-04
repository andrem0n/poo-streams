package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

  /*
  1 - Numero para string binária... 6 = "110"
  2 - Reverter a string -> "110" = "011"
  3 - converter para inteiro novamente -> "011" = 3
  */
    UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();
    Function<String, Integer> binaryToInteger = n -> Integer.parseInt(n, 2);

    numeros.stream().map(Integer::toBinaryString)
        .map(inverter)
        .map(binaryToInteger)
        .forEach(System.out::println);
  }
}
