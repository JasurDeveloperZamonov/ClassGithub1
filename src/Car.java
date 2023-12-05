public class Car {
    public String rangi;
    public String modeli;
    public double narxi;
    public String mexanizmi;

    public Car(String rangi, String modeli, double narxi, String mexanizmi) {
        this.setRangi(rangi);
        this.setModeli(modeli);
        this.setNarxi(narxi);
        this.setMexanizmi(mexanizmi);
    }

    public String getRangi() {
        return rangi;
    }

    public void setRangi(String rangi) {
        this.rangi = rangi;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public double getNarxi() {
        return narxi;
    }

    public void setNarxi(double narxi) {
        this.narxi = narxi;
    }

    public String getMexanizmi() {
        return mexanizmi;
    }

    public void setMexanizmi(String mexanizmi) {
        this.mexanizmi = mexanizmi;
    }

}

