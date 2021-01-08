package belajar;

// membuat class sebagai template
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;
    int umur;
}

public class ClassDanObject {
    public static void main(String[] args) throws Exception {

        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Randi Ramlan";
        mahasiswa1.nim = "201143500180";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.ipk = 3.28d;
        mahasiswa1.umur = 29;

        System.out.println("Nama : " + mahasiswa1.nama);
        System.out.println("Nim : " + mahasiswa1.nim);
        System.out.println("Jurusan :" + mahasiswa1.jurusan);
        System.out.println("IPK : " + mahasiswa1.ipk);
        System.out.println("Umur : " + mahasiswa1.umur);
    }
}
