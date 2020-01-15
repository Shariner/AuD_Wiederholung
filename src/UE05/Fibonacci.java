package UE05;

public class Fibonacci {

    public static float fib_it(int anzahl){
        int vorg = 0;
        int nachf = 1;
        int zw;
        zw = vorg;
        vorg = nachf;
        nachf = nachf+zw;


        for(int i = 0; i<anzahl-1; i++){
            zw = vorg;
            vorg = nachf;
            nachf = nachf+zw;


        }
        return vorg;
    }

    public static float fib_rek(int anzahl){
        return(anzahl<=1) ? anzahl : fib_rek(anzahl-1) + fib_rek(anzahl-2);
    }
    public static void main(String[] args)
    {
        StopUhr eins = new StopUhr();
        eins.start();
        System.out.println(fib_it(50));
        eins.stop();
        System.out.println("Fib it Dauer: "+eins.getDuration()/1000);
        eins.start();
        System.out.println(fib_rek(50));
        eins.stop();
        System.out.println("Fib Rek Dauer: "+eins.getDuration()/1000);




    }

}
