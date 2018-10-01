package Modelo;

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
        Canvas canvas = new Canvas(300, 300);
        pane1.getChildren().add(canvas);
        Scene scene = new Scene(pane1, 300, 300, Color.WHITESMOKE);
        //Referecia del lapiz para dibujar sobre
        //el canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        GameLoop  loop = new GameLoop(gc);
        loop.start();
        
        stage.setTitle("Ejemplo canvas");
        stage.setScene(scene);
        stage.show();
        
        //Dibujar un rectangulo
        //gc.setFill(Color.CHARTREUSE);//da el color para la variable gc
        //gc.fillRect(10, 10, 20, 20);
        
        //Se crea un ovalo, dos primeras coordenadas los otros el radio en x y y
        //gc.fillOval(30, 30, 50, 50);
        
        //Se dibuja una linea, las dos primeras son las cooordenadas d inicio y 
        //los dos ultimos las coordenasdas de final
        //gc.strokeLine(15, 15, 40, 40);
        
        //Se crea un poligono, para ello necesito las coordenasdas diferentes de
        //x y y, ademas despues de crea como tal el poligono con estas
        /*double xpoints[] = {10, 30, 20, 10};
        double ypoints[] = {30, 30, 15, 30};
        gc.strokePolygon(ypoints, xpoints, xpoints.length);//Al usar stroke la figura queda sin relleno
        gc.strokeRect(30, 30, 15, 15);*/
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
