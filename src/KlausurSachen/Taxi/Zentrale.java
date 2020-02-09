package KlausurSachen.Taxi;

import java.util.List;
import java.util.Random;

public class Zentrale implements Runnable {
    private List<Kunde> auftraege;
    public Zentrale(List<Kunde> auftraege){
        this.auftraege = auftraege;
    }

    @Override
    public void run() {
        int warten;
        while(!Thread.currentThread().isInterrupted()){
            synchronized (auftraege){
                if(auftraege.size()<10){
                    Random rnd = new Random();
                    warten = rnd.nextInt(5000);
                    auftraege.add(new Kunde(warten));
                    System.out.println("Auftrag angelegt mit Wartezeit: "+warten);
                    auftraege.notifyAll();
                }

            }
            try {
                Thread.sleep((int) Math.random()*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}