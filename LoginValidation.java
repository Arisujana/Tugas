import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Username dan password yang valid
        String usernameBenar = "admin";
        String passwordBenar = "password123";

        int percobaan = 0;
        boolean loginBerhasil = false;

        while (percobaan < 3) {
            System.out.print("Masukkan username: ");
            String username = input.nextLine();

            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                System.out.println("Selamat datang, " + username + "!");
                loginBerhasil = true;
                break;
            } else {
                percobaan++;
                System.out.println("Username atau password salah! Percobaan: " + percobaan + "/3");
            }
        }

        if (!loginBerhasil) {
            System.out.println("Akun diblokir!");
        }

        input.close();
    }
}
