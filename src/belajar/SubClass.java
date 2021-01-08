package belajar;

class Anak extends Induk {
    // constructor : membuat construcktor pada sub class harus memanggil constructor
    // pada super classnya
    Anak(String nama) {
        super(nama);
    }
}

public class SubClass {
    public static void main(String[] args) {
        Induk hero1 = new Induk("Asmeralda"); // mengunakan constructor superclass
        hero1.display();

        Anak hero2 = new Anak("Ucup"); // mengunakan constructor
        hero2.display();
    }
}
