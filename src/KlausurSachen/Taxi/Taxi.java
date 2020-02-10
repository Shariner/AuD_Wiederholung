package KlausurSachen.Taxi;

import java.util.List;

public class Taxi implements Runnable {
    private List<Kunde> auftraege;
    private int nummer;

    public Taxi(int nummer, List<Kunde> auftraege) {
        this.nummer = nummer;
        this.auftraege = auftraege;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
                try {
                    synchronized (auftraege) {
                        while (auftraege.isEmpty()) {
                            System.out.println("Taxi: "+nummer+" wartet auf Auftrag");
                            auftraege.wait();
                        }
                        int fahrzeit = auftraege.get(0).getFahrzeit();
                        System.out.println("Taxi Nummer : "+nummer+" bearbeitet Auftrag mit Zeit: "+fahrzeit);
                        auftraege.remove(0);
                        Thread.sleep(fahrzeit);
                        System.out.println("Taxi Nummer: "+nummer+" ist wieder frei!");
                    }

                } catch (InterruptedException exp) {
                    exp.printStackTrace();
            }
        }
    }
}
