package belajar;

public class OverridingMethod {
    public static void main(String[] args) {
        Pahlawan hero1 = new Pahlawan();
        hero1.nama = "Migt Guy";
        hero1.display();

        // memanggil overriding method
        PahlawanKalimantan hero2 = new PahlawanKalimantan();
        hero2.nama = "Migt Duy";
        hero2.power = 2;
        hero2.display();
    }
}
