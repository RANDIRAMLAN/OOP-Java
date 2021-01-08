package belajar;

class PahlawanKalimantan extends Pahlawan {
    double power;
    String nama2 = "Class Pahlawan Kalimantan";

    // overridingmethod
    void display() {
        System.out.println("Pahlawan Kalimantan");
        System.out.println("Name Hero :" + this.nama);
        System.out.println("Power Hero : " + this.power);
    }

    void display2() {
        System.out.println("Ini adalah" + this.nama2);
        // jika this.name maka data yang ditampilkan adalah data yang berasal class
        // super atau parent
    }
}
