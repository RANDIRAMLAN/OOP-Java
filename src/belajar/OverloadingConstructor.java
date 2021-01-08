package belajar;

public class OverloadingConstructor {
    private String name;
    private static int jumlahPlayer;

    // overloading
    // opsi 1
    OverloadingConstructor(String name) {
        OverloadingConstructor.jumlahPlayer++;
        this.name = name;
    }

    // opsi 2
    OverloadingConstructor() {
        OverloadingConstructor.jumlahPlayer++;
        this.name = "Player " + OverloadingConstructor.jumlahPlayer;
    }

    void show() {
        System.out.println("Name : " + this.name);
    }
}