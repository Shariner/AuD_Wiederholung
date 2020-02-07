package KlausurSachen;

import java.io.Serializable;

public class Artikel implements Serializable {
    public static double rabatt = 10.0;
    private final int id;
    private String bezeichnung;
    private transient int bestand;

    public Artikel(int id, String bezeichnung, int bestand){
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.bestand = bestand;
    }

    @Override
    public String toString(){
        return "Artikel (id = "+id+", bez = "+ bezeichnung+", bestand = "+bestand+", rabatt = "+rabatt+ ")";
    }

    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }


}
