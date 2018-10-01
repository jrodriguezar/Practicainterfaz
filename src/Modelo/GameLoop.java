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
        double xpoints[] = {this.carro.getX(), this.carro.getX()+10, this.carro.getX()+12, this.carro.getX()+30};
        double ypoints[] = {this.carro.getY(), this.carro.getY(), this.carro.getY()-15, this.carro.getY()-15};
        
        this.carro.mover();
    }
}
