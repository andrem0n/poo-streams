package composicao.carro;

public class Carro {

  private Motor motor = new Motor();

  public void acelerar() {
    motor.setFatorInjecao(motor.getFatorInjecao() + 0.4);
  }

  public void frear() {
    motor.setFatorInjecao(motor.getFatorInjecao() - 0.4);
  }

  public void ligar() {
    motor.setLigado(true);
  }

  public void desligar() {
    motor.setLigado(false);
  }

  public Motor getMotor() {
    return motor;
  }
}
