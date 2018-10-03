package Modelo;

import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Tablero extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Loyout
        Pane pane1 = new Pane();
        Canvas canvas = new Canvas(1024, 512);
        pane1.getChildren().add(canvas);
        Scene scene = new Scene(pane1, 1024, 512, Color.WHITESMOKE);
        //Referecia del lapiz para dibujar sobre
        //el canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        GameLoop  loop = new GameLoop(gc);
        loop.start();
        
        stage.setTitle("Ejemplo canvas");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
