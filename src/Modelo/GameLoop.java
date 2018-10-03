package Modelo;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class GameLoop extends AnimationTimer{
    private GraphicsContext gc;
    private Carro carro;
    private Image fondo;
    private Image gato;
    private Image munieco;
    private int x=0;
    private int i=0;
    
    public GameLoop(GraphicsContext gc) {
        this.gc = gc;
        this.carro = new Carro(0, 390);
        this.fondo = new Image("imagenes/fondo.png");
        this.gato =  new Image("imagenes/cats.gif");
        this.munieco = new Image("imagenes/down0.png");
    }
    
    @Override
    public void handle(long l) {
        //Borrando el tablero
        gc.clearRect(0, 0, 1024, 512);
        
        
        //dibujar fondo
        gc.drawImage(fondo, 0, 0);
        //primer gato
        gc.strokeRect(20+i, 20, 132, 80);
        gc.drawImage(gato, 132*x, 0, 132, 80, 20+i, 20, 132, 80);
        /*gc.drawImage(gato, 132, 0, 132, 80, 20, 20, 132, 80);
        gc.drawImage(gato, 264, 0, 132, 80, 20, 20, 132, 80);*/
        if (i%7 == 0) {
            x++;
            i++;
        }else{
            i++;
        }
        if (x==5) {
            x=0;
        }
        int g = 0;
        ///arreglar!!!!!
        while(g<300){
            for (int j = Math.random(); j < 100; j++) {
                gc.setFill(Color.AQUA);
                gc.fillOval(j, 0+i, 8, 8);
                break;
            }
            g++;
        }
        //munieco
        /*gc.drawImage(munieco, 200, 20);
        gc.strokeRect(200, 20, 30, 39);*/
        
        //colision
        /*Shape sgato = new Rectangle(20+i, 20, 132, 80);
        Shape smen = new Rectangle(200, 20, 30, 39);
        Shape interseccion = SVGPath.intersect(sgato, smen);//clase especial para las intersecciones
        if (interseccion.getBoundsInLocal().getWidth() != -1) {
            stop();//detiene todos los moviminetos
            //se puede modificar a gusto, no necesariamente debe detenerse todos los movimientos
        }*/
        
        /*double xpoints[] = {carro.getChasis().getX(), carro.getChasis().getX()+12, carro.getChasis().getX()+17, carro.getChasis().getX()+35, carro.getChasis().getX()+40, carro.getChasis().getX()+50, carro.getChasis().getX()+50, carro.getChasis().getX(), carro.getChasis().getX()};
        double ypoints[] = {carro.getChasis().getY(), carro.getChasis().getY(), carro.getChasis().getY()-15, carro.getChasis().getY()-15, carro.getChasis().getY(), carro.getChasis().getY(), carro.getChasis().getY()+8, carro.getChasis().getY()+8, carro.getChasis().getY()};
        gc.setFill(Color.AZURE);
        gc.fillPolygon(xpoints, ypoints, xpoints.length);
        gc.fillOval(carro.getLlantas(0).getX()+12, carro.getLlantas(0).getY()+8, 8, 8);
        gc.fillOval(carro.getLlantas(1).getX()+32, carro.getLlantas(1).getY()+8, 8, 8);
        carro.mover();*/
    }
}