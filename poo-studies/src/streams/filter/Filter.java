package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Ana", 7.8);
    Aluno aluno2 = new Aluno("Paulo", 3.2);
    Aluno aluno3 = new Aluno("Gilberto", 9.0);
    Aluno aluno4 = new Aluno("Joana", 5.6);
    Aluno aluno5 = new Aluno("André", 8.3);

    List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);

    Predicate<Aluno> isAproved = aluno -> aluno.nota >= 7.0;
    Function<Aluno, String> aprovedMessage = aluno -> "Parabéns " + aluno.nome
        + " você foi aprovado!";

    alunos.stream().filter(isAproved)
        .map(aprovedMessage)
        .forEach(System.out::println);
  }
}
