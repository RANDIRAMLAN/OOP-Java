package belajar;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampil() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Penulis : " + this.penulis);
    }
}

public class ReferencePadaObject {
    public static void main(String[] args) {

        Buku dataBuku1 = new Buku("Naruto", "Masashi Kisimoto");
        dataBuku1.tampil();

        // assigment object
        Buku dataBuku2 = dataBuku1;
        dataBuku2.tampil();

        // karna dataBuku1 dan dataBuku2 memiliki address yang sama, jika dataBuku1
        // diubah maka dataBuku2 juga berubah karna masih menunjuk ke object yang sama
        dataBuku1.judul = "Membunuh Nagato";
        dataBuku1.tampil();
        dataBuku2.tampil();

        // memasukkan object ke dalama method
        fungsi(dataBuku2);
        dataBuku1.tampil();
        dataBuku2.tampil();
    }

    // terjadi juga terhadap parsing by reference (tidak menduplikat)
    public static void fungsi(Buku dataBuku) {
        dataBuku.penulis = "Endo";
    }
}
