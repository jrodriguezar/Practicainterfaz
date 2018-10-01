package Modelo;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

public class GameLoop extends AnimationTimer{
    private GraphicsContext gc;
    private Carro carro;
    
    public GameLoop(GraphicsContext gc) {
        this.gc = gc;
        this.carro = new Carro(0, 100);
    }
    
    @Override
    public void handle(long l) {
        //Borrando el tablero
        gc.clearRect(0, 0, 300, 300);
        double xpoints[] = {carro.getChasis().getX(), carro.getChasis().getX()+12, carro.getChasis().getX()+17, carro.getChasis().getX()+35, carro.getChasis().getX()+40, carro.getChasis().getX()+50, carro.getChasis().getX()+50, carro.getChasis().getX(), carro.getChasis().getX()};
        double ypoints[] = {carro.getChasis().getY(), carro.getChasis().getY(), carro.getChasis().getY()-15, carro.getChasis().getY()-15, carro.getChasis().getY(), carro.getChasis().getY(), carro.getChasis().getY()+8, carro.getChasis().getY()+8, carro.getChasis().getY()};
        gc.strokePolygon(xpoints, ypoints, xpoints.length);
        gc.fillOval(carro.getLlantas(0).getX()+12, carro.getLlantas(0).getY()+8, 8, 8);
        gc.fillOval(carro.getLlantas(1).getX()+32, carro.getLlantas(1).getY()+8, 8, 8);
        carro.mover();
        carro.getChasis().mover();
        carro.moverllanta();
    }
}