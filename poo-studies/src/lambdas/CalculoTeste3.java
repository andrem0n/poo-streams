package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

  public static void main(String[] args) {

    BinaryOperator<Double> calculo = (x, y) -> {
      return x + y;
    };
    System.out.println(calculo.apply(4.0, 7.0));

    calculo = (x, y) -> x * y;

    System.out.println(calculo.apply(2.0, 7.5));
  }
}
