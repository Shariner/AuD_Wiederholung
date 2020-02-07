package KlausurSachen;

public class Veranstaltung extends VeranstaltungsManager{
    private String name;
    private Boolean isausgebucht;
    public Veranstaltung(String name, Boolean isausgebucht){
        this.name = name;
        this.isausgebucht = isausgebucht;
    }
}
