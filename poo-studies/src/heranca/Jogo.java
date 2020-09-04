package heranca;

public class Jogo {

  public static void main(String[] args) {
    Monstro monstro = new Monstro();
    Heroi heroi = new Heroi(10, 10);

    monstro.x = 10;
    monstro.y = 10;

    heroi.x = 10;
    heroi.y = 11;

//    jogador1.andar(Direcao.NORTE);
//    jogador1.andar(Direcao.LESTE);
//    jogador1.andar(Direcao.NORTE);
//    jogador1.andar(Direcao.LESTE);

    System.out.println("vida monstro: "+ monstro.vida);
    System.out.println("vida heroi: "+ heroi.vida);

    monstro.atacar(heroi);
    heroi.atacar(monstro);

    //System.out.println("valor de y: " + monstro.y);
    //System.out.println("valor de x: " + monstro.x);

    System.out.println("vida monstro: "+ monstro.vida);
    System.out.println("vida heroi: "+ heroi.vida);

  }
}
