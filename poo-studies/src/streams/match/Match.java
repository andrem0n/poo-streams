package streams.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import streams.match.Aluno;

public class Match {

  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Ana", 7.8);
    Aluno aluno2 = new Aluno("Paulo", 3.2);
    Aluno aluno3 = new Aluno("Gilberto", 9.0);
    Aluno aluno4 = new Aluno("Joana", 5.6);
    Aluno aluno5 = new Aluno("André", 8.3);

    List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);

    Predicate<Aluno> aprovado = aluno -> aluno.nota > 7;
    Predicate<Aluno> reprovado = aprovado.negate();

    System.out.println(alunos.stream().allMatch(aprovado));
    System.out.println(alunos.stream().anyMatch(aprovado));
    System.out.println(alunos.stream().noneMatch(aprovado));

  }
}
