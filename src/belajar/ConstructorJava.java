package belajar;

// class dengan konstruktor
class Mhs {
    String nim;
    String nama;
    String jurusan;

    // konstruktor akan dipanggil kali saat membuat object
    // konstruktor dengan parameter
    Mhs(String inputNim, String inputNama, String inputJurusan) {
        nim = inputNim;
        nama = inputNama;
        jurusan = inputJurusan;

        System.out.println(nim);
        System.out.println(nama);
        System.out.println(jurusan);
    }
}

public class ConstructorJava {
    public static void main(String[] args) {
        // object
        // Mhs mahasiswa1 = new Mhs("201143500180", "ucup", "Teknik Informatika");
        // Mhs mahasiswa2 = new Mhs("201143500181", "Surucup", "Teknik Informatika");

    }
}
