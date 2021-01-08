package belajar;

class Pemain {
    private static int numberPlayer;
    private String name;

    Pemain(String name) {
        this.name = name;
        Pemain.numberPlayer++;
    }

    void show() {
        System.out.println("Player Name = " + this.name);
    }

    // static method
    static void showNumberOfPlayer() {
        System.out.println("Jumlah Pemain = " + Pemain.numberPlayer);
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        Pemain player1 = new Pemain("Nagato");
        Pemain player2 = new Pemain("Nakata");
        player1.show();
        player2.show();
        Pemain.showNumberOfPlayer();
    }
}
