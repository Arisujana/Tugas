// Kelas Kalkulator
class Kalkulator {
    // Metode pertama: Menjumlahkan dua angka (Overloading)
    int tambah(int a, int b) {
        return a + b;
    }

    // Metode kedua: Menjumlahkan tiga angka (Overloading)
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode ketiga: Menjumlahkan dua angka desimal (Overloading)
    double tambah(double a, double b) {
        return a + b;
    }
}

// Kelas utama untuk menjalankan program
public class MethodOverloading {
    public static void main(String[] args) {
        // Membuat objek Kalkulator
        Kalkulator k = new Kalkulator();

        // Memanggil metode yang di-overload
        System.out.println(k.tambah(5, 10));       // Memanggil metode pertama (int, int)
        System.out.println(k.tambah(5, 10, 15));   // Memanggil metode kedua (int, int, int)
        System.out.println(k.tambah(5.5, 2.5));    // Memanggil metode ketiga (double, double)
    }
}
