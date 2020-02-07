package KlausurSachen;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.io.*;
import java.util.ArrayList;

public class VeranstaltungsManager implements Serializable {
    private static final long SerialVersionUID = 1L;
    private ArrayList<Veranstaltung> liste;
    private File file = new File("export.ser");
    public VeranstaltungsManager(){
        this.liste = new ArrayList<>();
    }

    public void addVeranstaltung(Veranstaltung v){
        liste.add(v);
        Monitor.zeigeMeldung(v);
    }

    public void export() throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(liste);
    }

    public void importing() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        liste = (ArrayList) ois.readObject();
    }

    @Override
    public String toString(){
        String rueck = "";
        /*
        for(int i = 0; i<liste.size(); i++)
            rueck += "Name: "+liste.get(i).getName()+", Ausgebucht: "+liste.get(i).getisIsausgebucht();
            */
         for(Veranstaltung s :liste)
             rueck += "Name: "+s.getName()+", Ausgebucht: "+s.getisIsausgebucht();

        return rueck;
    }
}
