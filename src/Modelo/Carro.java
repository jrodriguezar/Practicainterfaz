package Modelo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Carro {
    private int x;
    private int y;
    private Llanta[] llantas;
    private Chasis chasis;
    
    public Carro(int x, int y){
        this.x = x;
        this.y = y;
        this.llantas = new Llanta[2];
        //inicializar llantas, tomando como referencia x y y
        this.llantas[0] = new Llanta(x, y);
        this.llantas[1] = new Llanta(x, y);
        //inicializar chasis, tomando como referencia x y y
        this.chasis = new Chasis(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Llanta[] getllantas(){
        return llantas;
    }

    public Llanta getLlantas(int i) {
        return llantas[i];
    }

    public Chasis getChasis() {
        return chasis;
    }
    
    public void mover(){
        this.x++;
    }
    
    public void moverllanta(){
        llantas[0].mover();
        llantas[1].mover();
    }
}
