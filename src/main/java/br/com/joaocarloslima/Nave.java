package br.com.joaocarloslima;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }

    public Tiro atirar(int poder) {
        return new Tiro(getX(), getY(), 10, Direcao.CIMA, poder);
    }

    @Override
    public void mover() {
        switch (getDirecao()) {
            case ESQUERDA:
                if (getX() > 50) {
                    setX(getX() - getVelocidade());
                }
                break;
            case DIREITA:
                if (getY() < 640) {
                    setX(getX() + getVelocidade());
                }
                break;
        }
    }

}
