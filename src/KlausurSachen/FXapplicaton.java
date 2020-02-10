package KlausurSachen;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

import static javafx.application.Platform.exit;

public class FXapplicaton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String[] farben = {"Black", "Green", "Blue", "White", "Yellow", "Orange"};
        BorderPane box = new BorderPane();
        VBox buttons = new VBox();
        Scene szene = new Scene(box, 300, 300);
        primaryStage.setTitle("Groessenwechsel");


        Circle kreis = new Circle(300, 300, 50, Paint.valueOf("White"));
        box.setCenter(kreis);

        Button knopf = new Button("Andere Grösse");
        Outer o = new Outer(kreis);
        knopf.setOnAction(o);

        Button knopf2 = new Button("Farbwechsel");
        knopf2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Random rnd = new Random();
                kreis.setFill(Paint.valueOf(farben[rnd.nextInt(farben.length)]));

            }
        });
        Label label = new Label("Wilkommen bei der Klausur");

        Button delete = new Button("löschen und beenden in 5sek");
        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                box.getChildren().removeAll(kreis);
                exit();

            }
        });
        buttons.getChildren().addAll(knopf, knopf2, delete);
        buttons.setAlignment(Pos.CENTER);
        box.setBottom(buttons);
        buttons.setSpacing(5.5);
        box.setTop(label);
        BorderPane.setAlignment(label, Pos.CENTER);
        //BorderPane.setAlignment(knopf, Pos.CENTER_RIGHT);


        primaryStage.setScene(szene);
        primaryStage.show();


    }
}
