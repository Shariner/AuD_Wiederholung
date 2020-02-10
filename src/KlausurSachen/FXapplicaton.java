package KlausurSachen;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class FXapplicaton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String[] farben = {"Black", "Green", "Blue", "White", "Yellow", "Orange"};
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(50);
        Scene szene = new Scene(box, 300, 300);
        primaryStage.setTitle("Groessenwechsel");


        Circle kreis = new Circle(300, 300, 50, Paint.valueOf("White"));
        box.getChildren().add(kreis);

        Button knopf = new Button("Andere Grösse");
        knopf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Random rnd = new Random();
                kreis.setRadius(rnd.nextInt(100));
            }
        });

        Button knopf2 = new Button("Farbwechsel");
        knopf2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Random rnd = new Random();
                kreis.setFill(Paint.valueOf(farben[rnd.nextInt(farben.length)]));

            }
        });

        box.getChildren().add(knopf);
        box.getChildren().add(knopf2);


        primaryStage.setScene(szene);
        primaryStage.show();


    }
}
