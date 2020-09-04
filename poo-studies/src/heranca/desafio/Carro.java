package heranca.desafio;

public class Carro {

  private final int VELOCIDADEMAXIMA;
  private int velocidadeAtual;
  private int delta = 5;

  public Carro(int VELOCIDADEMAXIMA) {
    this.VELOCIDADEMAXIMA = VELOCIDADEMAXIMA;
  }

  void acelerar() {
    if (velocidadeAtual + getDelta() >= VELOCIDADEMAXIMA) {
      velocidadeAtual = VELOCIDADEMAXIMA;
    } else {
      velocidadeAtual += getDelta();
    }
  }

  void frear() {
    if (velocidadeAtual >= 10) {
      velocidadeAtual -= 10;
    } else {
      velocidadeAtual = 0;
    }
  }

  public int getVelocidadeAtual() {
    return velocidadeAtual;
  }

  public void setVelocidadeAtual(int velocidadeAtual) {
    this.velocidadeAtual = velocidadeAtual;
  }

  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }
}
