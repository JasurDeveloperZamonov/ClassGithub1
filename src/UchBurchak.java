public class UchBurchak {
    public double a_katet;
    public double b_katet;

    public double c_gipotenuza;

    public double getA_katet() {
        return a_katet;
    }

    public void setA_katet(double a_katet) {
        this.a_katet = a_katet;
    }

    public double getB_katet() {
        return b_katet;
    }

    public void setB_katet(double b_katet) {
        this.b_katet = b_katet;
    }

    public double getC_gipotenuza() {
        return c_gipotenuza;
    }

    public void setC_gipotenuza(double c_gipotenuza) {
        this.c_gipotenuza = c_gipotenuza;
    }

    public static void main(String[] args) {
        UchBurchak uchBurchak=new UchBurchak();
        uchBurchak.setA_katet(4);
        uchBurchak.setB_katet(3);
        uchBurchak.setC_gipotenuza(Math.sqrt(Math.pow(uchBurchak.a_katet, 2)+Math.pow(uchBurchak.b_katet, 2)));
        double P,S;
        P= uchBurchak.a_katet+uchBurchak.b_katet+uchBurchak.c_gipotenuza;
        S=uchBurchak.a_katet* uchBurchak.b_katet/2;
        System.out.println("Peremetri: "+P);
        System.out.println("Yuzi: "+S);
    }
}
