package belajar;

public class OverLoading {
    public static void main(String[] args) {
        OverloadingConstructor player1 = new OverloadingConstructor("Saitama");
        OverloadingConstructor player2 = new OverloadingConstructor();
        player1.show();
        player2.show();

        // overloading method
        int a = Matematika.tambah(1, 2);
        System.out.println(a);
        double b = Matematika.tambah(1, 0.56d);
        System.out.println(b);
    }
}
