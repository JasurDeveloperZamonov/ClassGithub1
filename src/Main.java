
public class Main {
    public static void main(String[] args) {
        Car m = new Car("Oq","Lacetti",10000,"Mexanika");
        m.setMexanizmi("Avtomat");
        m.setNarxi(15000);
        m.setRangi("Blue");
        m.setModeli("Onix");

        System.out.println(m.getRangi());
        System.out.println(m.getModeli());
        System.out.println(m.getNarxi());
        System.out.println(m.getMexanizmi());
        //YOUTUBE DA JUDA KO'P VIDEOLAR ENCAPSULATION DA ASOSAN GETTER, SETTER
        // DAN FOYDALANGAN MENHAM HUDDI SHUNDAY QILGANIMNI XATO YANI ENCAPSULATIONDAN
        //FOYDALANILMAGAN DEB XATOLIK KO'RSATIBSIZ ENDI CONSTRUCTRNI QO'SHDIM AGAR ILOJI BO'LSA
        //XATO BO'LSA KENGROQ TUSHINTIRING.
    }
}