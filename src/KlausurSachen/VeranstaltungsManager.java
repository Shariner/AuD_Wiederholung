package KlausurSachen;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.io.*;
import java.util.ArrayList;
import java.util.Observable;

public class VeranstaltungsManager extends Observable implements Serializable{
    private static final long SerialVersionUID = 1L;
    private ArrayList<Veranstaltung> liste;
    private File file = new File("export.ser");
    public VeranstaltungsManager(){
        this.liste = new ArrayList<>();
    }

    public void addVeranstaltung(Veranstaltung v){
        liste.add(v);
        setChanged();
        notifyObservers(v);
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
        for(Veranstaltung s: liste)
            rueck += s.toString()+"\n";
        rueck += "----------------";
        return rueck;
    }


}
