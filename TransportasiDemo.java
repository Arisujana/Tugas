// Abstract class Kendaraan
abstract class Kendaraan {
    protected String nama;
    protected int jumlahRoda;

    public Kendaraan(String nama, int jumlahRoda) {
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }

    public void info() {
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }

    // Method abstrak yang harus diimplementasikan oleh subclass
    abstract void bergerak();
}

// Subclass Mobil yang mewarisi Kendaraan
class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama, 4); // Mobil selalu memiliki 4 roda
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Subclass SepedaMotor yang mewarisi Kendaraan
class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama) {
        super(nama, 2); // Sepeda motor selalu memiliki 2 roda
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Interface KendaraanListrik
interface KendaraanListrik {
    void isiDaya(); // Method abstrak yang harus diimplementasikan
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
public class TransportasiDemo {
    public static void main(String[] args) {
        // Output abstract class
        Mobil toyota = new Mobil("Toyota");
        toyota.info();
        toyota.bergerak();

        System.out.println();

        SepedaMotor honda = new SepedaMotor("Honda");
        honda.info();
        honda.bergerak();

        System.out.println("\n--- Output Aplikasi dengan Interface ---\n");

        // Output aplikasi dengan interface
        MobilListrik tesla = new MobilListrik("Tesla Model 3");
        tesla.info();
        tesla.bergerak();
        tesla.isiDaya();
    }
}
