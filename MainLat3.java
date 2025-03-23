class BankAccount {
    private double saldo; // Tidak bisa diakses langsung

    // Constructor
    public BankAccount(double saldoAwal) {
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            System.out.println("Saldo awal tidak bisa negatif! Mengatur saldo ke 0.");
            this.saldo = 0;
        }
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Setter dengan validasi
    public void setSaldo(double jumlah) {
        if (jumlah >= 0) {
            this.saldo = jumlah;
        } else {
            System.out.println("Saldo tidak bisa negatif!");
        }
    }
}

// Kelas Main untuk menjalankan program
public class MainLat3 {
    public static void main(String[] args) {
        // Membuat objek rekening dengan saldo awal Rp500.000
        BankAccount rekening = new BankAccount(500000);

        // Menampilkan saldo awal
        System.out.println("Saldo awal: Rp" + rekening.getSaldo());

        // Mengubah saldo menggunakan setter
        rekening.setSaldo(750000);
        System.out.println("Saldo setelah diubah: Rp" + rekening.getSaldo());

        // Mencoba mengatur saldo ke nilai negatif
        rekening.setSaldo(-100000); // Akan menampilkan pesan error
        System.out.println("Saldo setelah mencoba set negatif: Rp" + rekening.getSaldo());
    }
}
