package KlausurSachen;

import java.util.Observable;
import java.util.Observer;

public class Obs implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o.toString());
    }
}
