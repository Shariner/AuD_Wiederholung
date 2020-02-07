package KlausurSachen;

import java.util.ArrayList;

public class VeranstaltungsManager {
    private ArrayList<Veranstaltung> liste;
    public VeranstaltungsManager(){
        this.liste = new ArrayList<>();
    }

    public void addVeranstaltung(Veranstaltung v){
        liste.add(v);
    }
}
