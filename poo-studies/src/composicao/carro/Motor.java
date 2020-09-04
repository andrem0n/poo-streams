package composicao.carro;

public class Motor {

  private boolean ligado = false;
  private double fatorInjecao = 1;

  public int giros() {
    if (ligado) {
      return (int) Math.round(fatorInjecao * 3000);
    } else {
      return 0;
    }
  }

  public boolean isLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public double getFatorInjecao() {
    return fatorInjecao;
  }

  public void setFatorInjecao(double fatorInjecao) {
    this.fatorInjecao = fatorInjecao;
  }
}
