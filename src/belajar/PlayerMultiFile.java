package belajar;

// visibility class Default (Jika difault hanya dapat digunakan pada package yang sama)
class PlayerMultiFile {
    private String name;

    PlayerMultiFile(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Player Name: " + this.name);
    }
}