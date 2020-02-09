package KlausurSachen.Taxi;

import java.util.LinkedList;
import java.util.List;

public class Taxisimulation {
    public static void main(String[] args){
        List<Kunde> auftraege = new LinkedList<>();
        Taxi taxi1 = new Taxi(1, auftraege);
        Taxi taxi2 = new Taxi(2, auftraege);
        Zentrale central = new Zentrale(auftraege);


        new Thread(taxi1).start();
        new Thread(taxi2).start();
        new Thread(central).start();
        System.out.println("Ende Main");


    }
}
