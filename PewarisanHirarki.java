// Superclass Hewan
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Subclass Kucing yang mewarisi Hewan
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

// Subclass Anjing yang mewarisi Hewan
class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

// Kelas utama untuk menjalankan program
public class PewarisanHirarki {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing();
        System.out.println("=== Kucing ===");
        kucing.makan();  // Dari superclass Hewan
        kucing.suara();  // Dari subclass Kucing
        
        // Membuat objek Anjing
        Anjing anjing = new Anjing();
        System.out.println("\n=== Anjing ===");
        anjing.makan();  // Dari superclass Hewan
        anjing.suara();  // Dari subclass Anjing
    }
}