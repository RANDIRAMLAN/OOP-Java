package belajar;

public class Pewarisan {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.nama = "ucup";
        System.out.println(hero1.nama);
        HeroStrength hero2 = new HeroStrength();
        hero2.nama = "Roy";
        System.out.println(hero2.nama);

    }
}

// inheritance adalah hubungan is -a
// parent class // super class
class Hero {
    String nama;
}

// child class atau turunan
class HeroStrength extends Hero {

}
