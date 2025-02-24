// Definisi Kelas
public class Mahasiswa {
    private String nama;
    private int nim;

    // Konstruktor
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter untuk mendapatkan nama
    public String getNama() {
        return nama;
    }

    // Getter untuk mendapatkan NIM
    public int getNim() {
        return nim;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama() + ", NIM: " + getNim());
    }
}

// Program Utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", 220001);
        Mahasiswa mhs2 = new Mahasiswa("Siti", 220002);

        // Menampilkan informasi mahasiswa
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
    }
}
