package belajar;

// mengimport class dari package yang berbeda
import terminal.Console;
// mengimport method static dari class console
import static terminal.Console.log;

public class HirarkiPackage {
    public static void main(String[] args) {

        // visibility class defaut
        PlayerMultiFile player1 = new PlayerMultiFile("Otong");
        player1.show();
        // visibility class public
        Console.log("Hallo");
        log("Hallo Tong...");
    }
}
