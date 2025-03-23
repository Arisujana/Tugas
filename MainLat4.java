class Mesin {
    // Metode private hanya bisa diakses dalam kelas ini
    private void cekBahanBakar() {
        System.out.println("Cek bahan bakar sebelum menyalakan mesin...");
    }

    // Metode public dapat diakses dari luar kelas
    public void nyalakanMesin() {
        cekBahanBakar(); // ✅ Bisa dipanggil di dalam kelas
        System.out.println("Mesin menyala!");
    }
}

public class MainLat4 {
    public static void main(String[] args) {
        Mesin mobil = new Mesin();
        mobil.nyalakanMesin();

        // mobil.cekBahanBakar(); // ❌ Error: cekBahanBakar() bersifat private
    }
}
