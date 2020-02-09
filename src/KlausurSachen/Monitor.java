package KlausurSachen;

import java.util.Observable;
import java.util.Observer;

public class Monitor extends VeranstaltungsManager implements Observer {
    public void zeigeMeldung(Veranstaltung v){
    }

    @Override
    public void update(Observable o, Object arg) {
        zeigeMeldung((Veranstaltung) arg);
    }
}
