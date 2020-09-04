package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Teste {

  public static void main(String[] args) {

    List<String> valueList = new ArrayList<String>();
    valueList.add("Joe");
    valueList.add("John");
    valueList.add("Sean");
    valueList.add("Paul");

    long count = valueList.stream().count();
    long count2 = valueList.stream().count();
    Stream<String> stream = valueList.stream();
    Stream<String> stream2 = valueList.stream();

    String name = stream.skip(count - 2).findFirst().get();
    String name2 = stream2.skip(count2 - 1).findFirst().get();
    System.out.println(name);
    System.out.println(name2);
  }
}
