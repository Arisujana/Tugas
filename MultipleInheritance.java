// Interface Hewan
interface Hewan {
    void makan();
}

// Interface Mamalia
interface Mamalia {
    void menyusui();
}

// Kelas Kucing yang mengimplementasikan kedua interface
class Kucing implements Hewan, Mamalia {
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }

    public void menyusui() {
        System.out.println("Kucing menyusui anaknya.");
    }
}

// Kelas utama untuk menjalankan program
public class MultipleInheritance {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing();
        
        // Memanggil method-method yang dimiliki oleh kucing
        System.out.println("=== Kucing ===");
        kucing.makan();      // Dari interface Hewan
        kucing.menyusui();   // Dari interface Mamalia
    }
}
