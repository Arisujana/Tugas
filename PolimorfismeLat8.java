// Interface Kendaraan
interface Kendaraan {
    void berjalan();
}

// Implementasi pertama: Mobil
class Mobil implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Mobil berjalan dengan roda 4.");
    }
}

// Implementasi kedua: Motor
class Motor implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Motor berjalan dengan roda 2.");
    }
}

// Main class
public class PolimorfismeLat8 {
    public static void main(String[] args) {
        // Menggunakan polimorfisme
        Kendaraan kendaraan1 = new Mobil(); // Objek Mobil dengan referensi Kendaraan
        Kendaraan kendaraan2 = new Motor(); // Objek Motor dengan referensi Kendaraan

        // Memanggil metode berjalan()
        kendaraan1.berjalan(); // Output: Mobil berjalan dengan roda 4.
        kendaraan2.berjalan(); // Output: Motor berjalan dengan roda 2.
    }
}
