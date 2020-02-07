package KlausurSachen;

public class Buch implements Comparable<Buch>{
    private String titel;
    public Buch(){};
    public Buch(String titel){
        this.titel = titel;
    }

    public String getTitel(){
        return titel;
    }
    @Override
    public int compareTo(Buch other) {
        if(titel== null || titel.isEmpty() || other.getTitel() == null || other.getTitel().isEmpty()){
            return -9999;
        }
        else{
            return titel.compareTo(other.getTitel());

        }
    }
}
