public class Car {
    public String rangi="Oq";
    public String modeli="Lacetti";
    public double narxi=10000;
    public String mexanizmi="Mexanika";

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

    public static void main(String[] args) {
        Car m=new Car();

        m.setMexanizmi("Avtomat");
        m.setNarxi(15000);
        m.setRangi("Blue");
        m.setModeli("Onix");

        System.out.println(m.getRangi());
        System.out.println(m.getModeli());
        System.out.println(m.getNarxi());
        System.out.println(m.getMexanizmi());
    }
}

