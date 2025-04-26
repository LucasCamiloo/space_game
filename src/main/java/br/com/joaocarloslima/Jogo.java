package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    protected ArrayList<Asset> assets = new ArrayList<>();
    protected Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);
    private int pontos;
    private int nivel = 1;

    

    public Tiro atirar() {
        Tiro tiro = nave.atirar(nivel);
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro() {
        Meteoro meteoro = new Meteoro(new Random().nextInt(690) + 50, 0, 3, Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }

    public void pontuar() {
        pontos += 1;
        if (nivel < 4) {
            if (pontos % 10 == 0) {
                nivel += 1;
                pontos = 0;
            }
        }
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
