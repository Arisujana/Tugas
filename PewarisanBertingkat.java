// Superclass
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

// Subclass KucingAnggora yang mewarisi Kucing
class KucingAnggora extends Kucing {
    void jenis() {
        System.out.println("Ini adalah kucing anggora.");
    }
}

// Kelas utama untuk menjalankan program
public class PewarisanBertingkat {
    public static void main(String[] args) {
        // Membuat objek dari class KucingAnggora
        KucingAnggora anggora = new KucingAnggora();

        anggora.makan(); // Dari superclass Hewan
        anggora.suara(); // Dari subclass Kucing
        anggora.jenis(); // Dari subclass KucingAnggora
    }
}