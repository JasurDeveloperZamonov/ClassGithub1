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
    public void setA_katet(long a_katet) {
        this.a_katet = a_katet;
    }
    public void setA_katet(float a_katet) {
        this.a_katet = a_katet;
    }
    public void setA_katet(int a_katet) {
        this.a_katet = a_katet;
    }

    public double getB_katet() {
        return b_katet;
    }

    public void setB_katet(double b_katet) {
        this.b_katet = b_katet;
    }
    public void setB_katet(long b_katet) {
        this.b_katet = b_katet;
    }
    public void setB_katet(float b_katet) {
        this.b_katet = b_katet;
    }
    public void setB_katet(int b_katet) {
        this.b_katet = b_katet;
    }

    public double getC_gipotenuza() {
        return c_gipotenuza;
    }

    public void setC_gipotenuza(double c_gipotenuza) {
        this.c_gipotenuza = c_gipotenuza;
    }
    public void setC_gipotenuza(float c_gipotenuza) {
        this.c_gipotenuza = c_gipotenuza;
    }
    public void setC_gipotenuza(long c_gipotenuza) {
        this.c_gipotenuza = c_gipotenuza;
    }
    public void setC_gipotenuza(int c_gipotenuza) {
        this.c_gipotenuza = c_gipotenuza;
    }

    public static void main(String[] args) {
        UchBurchak uchBurchak=new UchBurchak();
        uchBurchak.setA_katet(4);
        uchBurchak.setB_katet(3);
        uchBurchak.setC_gipotenuza(Math.sqrt(Math.pow(uchBurchak.getA_katet(), 2)+Math.pow(uchBurchak.getB_katet(), 2)));
        double P,S;
        P= uchBurchak.getA_katet()+uchBurchak.getB_katet()+uchBurchak.getC_gipotenuza();
        S=uchBurchak.getA_katet()* uchBurchak.getB_katet()/2;
        System.out.println("Peremetri: "+P);
        System.out.println("Yuzi: "+S);
    }
}
