package KlausurSachen;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;

import java.util.Random;

public class Outer implements EventHandler<ActionEvent> {
    Circle kreis;

    public Outer(Circle kreis) {
        this.kreis = kreis;

    }

    public void handle(ActionEvent actionEvent) {
        Random rnd = new Random();
        kreis.setRadius(rnd.nextInt(100));

    }
}
