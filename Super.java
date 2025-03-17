// Superclass Hewan
class Hewan {
    String nama;

    // Constructor Hewan
    Hewan(String nama) {
        this.nama = nama;
    }

    // Method untuk menampilkan informasi hewan
    void info() {
        System.out.println("Nama: " + nama);
    }
}

// Subclass Kucing yang mewarisi Hewan
class Kucing extends Hewan {
    // Constructor Kucing yang memanggil constructor superclass
    Kucing(String nama) {
        super(nama);
    }
}

// Kelas utama untuk menjalankan program
public class Super {
    public static void main(String[] args) {
        // Membuat objek Kucing dengan nama "Kitty"
        Kucing kucing = new Kucing("Kitty");

        // Memanggil method info() dari superclass Hewan
        System.out.println("=== Informasi Kucing ===");
        kucing.info();
    }
}
