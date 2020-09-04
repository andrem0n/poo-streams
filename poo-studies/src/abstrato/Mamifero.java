package abstrato;

public abstract class Mamifero extends Animal {

  @Override
  public final String mover() {
    return "Move se usando as patas";
  }

  public abstract String mamar();
}
