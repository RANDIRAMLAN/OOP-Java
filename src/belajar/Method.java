package belajar;

class Mahasiswa2 {
    String nim;
    String nama;

    Mahasiswa2(String Nim, String Nama) {
        this.nim = Nim;
        this.nama = Nama;
    }

    // membuat method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nim : " + this.nim);
        System.out.println("Nama : " + this.nama);
    }

    // method tanpa return dengan parameter
    void simpanNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameter
    String getNim() {
        return this.nim;
    }

    String getNama() {
        return this.nama;
    }

    // method dengan return dan parameter
    String sayHay(String msg) {
        return msg + " Juga, nama saya " + this.nama;
    }
}

public class Method {
    public static void main(String[] args) {
        Mahasiswa2 mahasiswa1 = new Mahasiswa2("201143500180", "Ucup");
        // method
        mahasiswa1.show();
        mahasiswa1.simpanNama("Surucup");
        mahasiswa1.show();
        System.out.println(mahasiswa1.getNim());
        System.out.println(mahasiswa1.getNama());
        String data = mahasiswa1.sayHay("Ganteng");
        System.out.println(data);
    }
}
