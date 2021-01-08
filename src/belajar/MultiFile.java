package belajar;

// keyword import untuk package terminal
import terminal.Console;

public class MultiFile {
    public static void main(String[] args) {
        PlayerMultiFile player1 = new PlayerMultiFile("Ucup");
        player1.show();

        // memnaggil class console dari package terminal
        Console.log("Hallo");
    }
}
