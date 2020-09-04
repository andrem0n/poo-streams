package abstrato;

public class Cachorro extends Mamifero {

  @Override
  public String mamar() {
    return "Usando leite";
  }

  @Override
  public String respirar() {
    return "usando os pulmoes";
  }
}
