package br.com.joaocarloslima;
import java.util.Random;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset{
    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        tamanho = new Random().nextInt(8) + 1;
        poder = tamanho;

        String path = "images/meteoro/meteoro" + tamanho + ".png";
        setImagem(new ImageView(App.class.getResource(path).toString()));
    }

    public void tomarTiro(Tiro tiro){
        this.poder -= tiro.getPoder();
    }

    public int getPoder() {
        return poder;
    }

}
