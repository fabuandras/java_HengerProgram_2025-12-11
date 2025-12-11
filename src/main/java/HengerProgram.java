import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<Henger> hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public HengerProgram() {
        hengerek = new ArrayList<>();
    }

    public void run() {
        //Henger h1 = new Henger(1, 1);
        Henger h2 = new Henger(1, 1);
        Henger th = new TomorHenger(1, 1, .5);
        Henger th2 = new TomorHenger(1, 1, 0.3);
        Henger csh = new Cso(1, 1, 0.3);
        Henger csh2 = new Cso(1, 1, .5, 0.3);
        hengerek.add(/*h1*/new Henger(1, 1));
        hengerek.add(h2);
        hengerek.add(th);
        hengerek.add(th2);
        hengerek.add(csh);
        hengerek.add(csh2);
        int db = Henger.getHengerDarab();
        System.out.printf("A programban felhasznált hengerek(%d db):\n", db);
        for (Henger henger : hengerek) {
            System.out.println(henger);
        }
    }

    public double atlagTerfogat() {
        return 0;
    }

    public double csovekSulya() {
        return 0;
    }

    private List<Henger> lista() {
        return new ArrayList<>();
    }
}
