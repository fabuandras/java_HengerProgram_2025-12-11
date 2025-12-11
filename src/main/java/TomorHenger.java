public class TomorHenger extends Henger {
    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = 1;
    }

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = sugar;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return 0;
    }

    @Override
    public String toString() {
        return "TomorHenger: sugár=" + getSugar() +
                ", magasság=" + getMagassag() +
                ", fajsúly=" + fajsuly +
                ", térfogat=" + terfogat() +
                ", súly=" + suly();
    }
}