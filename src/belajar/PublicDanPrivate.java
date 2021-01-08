package belajar;

class Player {
    String nama; // default dia bisa dibaca dan ditulis dari luar class
    public int exp; // dia bisa dibaca dan ditulis dari luar class
    private int health; // hanya dapat dibaca dan ditulis dari dalam kelas aja

    Player(String nama, int exp, int health) {
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }
}

public class PublicDanPrivate {
    public static void main(String[] args) {
        Player player1 = new Player("Marni", 0, 10);
        // default
        System.out.println(player1.nama); // membaca data
        player1.nama = "Sumarni"; // menulis data
        System.out.println(player1.nama); // membaca data

        // public
        System.out.println(player1.exp); // membaca data
        player1.exp = 2; // menulis data
        System.out.println(player1.exp); // membaca data

        // private : tidak bisa diakses dari class lain
        // System.out.println(player1.health); // membaca data
        // player1.health = 2; // menulis data
        // System.out.println(player1.health); // membaca data
    }
}
