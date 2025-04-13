import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int angkaBenar = random.nextInt(100) + 1; // angka antara 1–100
        int tebakan;
        int jumlahTebakan = 0;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka antara 1 hingga 100.");
        System.out.println("Coba tebak! Ketik 0 untuk keluar.");

        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            if (tebakan == 0) {
                System.out.println("Permainan dihentikan. Terima kasih telah bermain!");
                break;
            }

            jumlahTebakan++;

            if (tebakan < angkaBenar) {
                System.out.println("Tebakan terlalu kecil. Coba lagi!");
            } else if (tebakan > angkaBenar) {
                System.out.println("Tebakan terlalu besar. Coba lagi!");
            } else {
                System.out.println("Selamat! Anda menebak angka dengan benar dalam " + jumlahTebakan + " percobaan.");
                break;
            }
        }

        input.close();
    }
}

