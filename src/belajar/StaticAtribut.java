package belajar;

class Display {
    static String type = "Display";
    private String name;

    Display(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Display Name = " + this.name);
    }
}

public class StaticAtribut {
    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        display1.show();
        Display display2 = new Display("Monitor");
        display2.show();

        // tampilkan static variable atau class variable
        System.out.println("Menampilkan static atau class variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }

}
