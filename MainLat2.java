// File: Mahasiswa.java
class Mahasiswa {
    private String nama; // Tidak bisa diakses langsung dari luar kelas

    // Constructor
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    // Getter untuk mengakses nama
    public String getNama() {
        return nama;
    }
}

// File: Main.java
public class MainLat2 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Adi");

        // System.out.println(mhs.nama); // ❌ Error: nama bersifat private
        System.out.println(mhs.getNama()); // ✅ Akses melalui metode getter
    }
}
