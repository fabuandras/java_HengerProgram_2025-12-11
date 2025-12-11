public class Cso extends TomorHenger {

    private double falvastagsag;

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double falvastagsag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double terfogat() {
        Henger belso = new Henger(this.getSugar()-this.falvastagsag, this.getMagassag()-this.falvastagsag);
        return super.terfogat()-belso.terfogat();
    }

    @Override
    public String toString() {
        return "Cso: sugár=" + getSugar() +
                ", magasság=" + getMagassag() +
                ", fajsúly=" + getFajsuly() +
                ", falvastagság=" + falvastagsag +
                ", térfogat=" + terfogat() +
                ", súly=" + suly();
    }
}
