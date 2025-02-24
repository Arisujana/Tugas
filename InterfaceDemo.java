// Interface KendaraanListrik
interface KendaraanListrik {
    void isiDaya(); // Method abstrak yang harus diimplementasikan
}

// Superclass Mobil
class Mobil {
    protected String nama;

    public Mobil(String nama) {
        this.nama = nama;
    }

    void bergerak() {
        System.out.println(nama + " sedang bergerak.");
    }

    void info() {
        System.out.println("Ini adalah mobil: " + nama);
    }
}

// Subclass MobilListrik yang merupakan Mobil dan juga KendaraanListrik
class MobilListrik extends Mobil implements KendaraanListrik {
    public MobilListrik(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan motor listrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

// Main class untuk menjalankan program
public class InterfaceDemo {
    public static void main(String[] args) {
        MobilListrik tesla = new MobilListrik("Tesla Model 3");

        tesla.info();
        tesla.bergerak();
        tesla.isiDaya();
    }
}
