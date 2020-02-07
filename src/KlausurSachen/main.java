package KlausurSachen;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class main {
    static int proz1(int n){
        int counter = 0;
        for(int a=0; a<n; a++){
            for(int b=0; b<20;b++)
                counter++;
        }
        return counter;
    }

    static int proz2(int n){
        int counter = 0;
        for(int a=1; a<=n; a++)
            for(int b=0; b<a; b++)
                counter++;
            return counter;
    }

    static int proz3(int n){
        int counter = 0;
        while(n>1){
            counter++;
            n/=2;
        }
        return counter;
    }

    static int proz4(int n){
        int counter = 0;
        for(int a=1; a<=n; a*=2)
            for(int b=0; b<2*n;b++)
                counter++;
            return counter;
    }

    static void uebung1() throws FileNotFoundException {
        File file = new File("artikel.ser");
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            Artikel artikel = new Artikel(1, "Base Cap", 42);
            oos.writeObject(artikel);
            artikel.setBezeichnung("Baum");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Artikel.rabatt = 5.0;


        try(FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            System.out.println(ois.readObject());
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    static void uebung2(){
        List<Buch> buecher = new ArrayList<>();
        buecher.add(new Buch("Land of Lisp"));
        buecher.add(new Buch("Java ist auch eine Insel"));
        buecher.add(new Buch());

        Iterator<Buch> it = buecher.iterator();
        while(it.hasNext())
            System.out.println(it.next().getTitel());

        Collections.sort(buecher);
        it = buecher.iterator();
        while(it.hasNext())
            System.out.println(it.next().getTitel());
    }

    static void uebung3() throws IOException, ClassNotFoundException {
        VeranstaltungsManager haupt = new VeranstaltungsManager();
        //haupt.addVeranstaltung(new Veranstaltung("Defqon 1.", false));
        //haupt.export();
        haupt.importing();
        System.out.println(haupt.toString());
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //System.out.println(proz2(8));
        uebung3();

    }

}

