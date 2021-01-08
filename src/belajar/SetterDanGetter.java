package belajar;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data() {
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    // membuat getter
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // membuat setter
    public void setDoublePrivate(double value) {
        this.doublePrivate = value;
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // membuat setter
    public void setJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // membuat getter
    public double getJari2() {
        return this.diameter / 2;
    }
}

public class SetterDanGetter {
    public static void main(String[] args) {
        Data objek = new Data();

        // public (dapat menulis dan membaca)
        objek.intPublic = 100; // menulis
        System.out.println(objek.intPublic); // membaca

        // private (tidak bisa menulis dan membaca)
        // hanya bisa membaca data private(menggunakan getter)
        int nilaiPrivate1 = objek.getIntPrivate();
        System.out.println(nilaiPrivate1);
        // hanya bisa menulis data private (menggunakan setter)
        objek.setDoublePrivate(0.23d);
        // mengabungkan membaca dan menulis dengan setter dan getter
        Lingkaran objek2 = new Lingkaran(10.0d);
        System.out.println("Jari Jari = " + objek2.getJari2());
        objek2.setJari2(14.0d);
        System.out.println("Jari Jari = " + objek2.getJari2());

    }
}
