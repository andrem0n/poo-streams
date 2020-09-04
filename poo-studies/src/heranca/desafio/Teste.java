package heranca.desafio;

public class Teste {

  public static void main(String[] args) {

    Ferrari ferrari = new Ferrari();
    Carro civic = new Civic();

    System.out.println("velocidade atual ferrari: " + ferrari.getVelocidadeAtual());
    System.out.println("velocidade atual civic: " + civic.getVelocidadeAtual());

    ferrari.acelerar();
    ferrari.frear();
    ferrari.acelerar();
    ferrari.acelerar();
    civic.acelerar();
    civic.frear();
    civic.acelerar();
    ferrari.acelerar();
    ferrari.ligarTurbo();
    ferrari.ligarArCondicionado();
    ferrari.acelerar();
    ferrari.desligarArCondicionado();
    ferrari.desligarTurbo();

    System.out.println("velocidade atual ferrari: " + ferrari.getVelocidadeAtual());
    System.out.println("velocidade atual civic: " + civic.getVelocidadeAtual());

  }
}
