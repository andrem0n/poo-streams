package composicao.carro;

import composicao.carro.Carro;

public class CarroTeste {

  public static void main(String[] args) {
    Carro c1 = new Carro();
    System.out.println("motor ligado? " + c1.getMotor().isLigado());
    c1.ligar();
    System.out.println("motor ligado? " + c1.getMotor().isLigado());
    System.out.println(c1.getMotor().giros());
    c1.acelerar();
    c1.acelerar();
    c1.acelerar();
    System.out.println(c1.getMotor().giros());
    c1.frear();
    c1.frear();
    c1.frear();
    System.out.println(c1.getMotor().giros());
  }
}
