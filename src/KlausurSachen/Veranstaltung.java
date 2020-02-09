package KlausurSachen;

public class Veranstaltung extends VeranstaltungsManager{
    private static final long SerivalVersionUID = 1;
    private String name;
    private boolean isausgebucht;

    public String getName() {
        return name;
    }

    public boolean getisIsausgebucht() {
        return isausgebucht;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsausgebucht(boolean isausgebucht) {
        this.isausgebucht = isausgebucht;
    }
    public Veranstaltung(){}

    public Veranstaltung(String name, Boolean isausgebucht){
        this.name = name;
        this.isausgebucht = isausgebucht;
    }

    @Override
    public String toString(){
        return "Name: "+name+", Ausgebucht: "+isausgebucht;
    }
}
