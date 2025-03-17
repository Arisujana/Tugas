// Superclass
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// Subclass Kucing
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow! Meow!");
    }
}

// Subclass Anjing
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        // Menggunakan polimorfisme
        Hewan hewan1 = new Kucing(); // Objek Kucing dengan referensi Hewan
        Hewan hewan2 = new Anjing(); // Objek Anjing dengan referensi Hewan

        // Memanggil metode bersuara() sesuai dengan objeknya
        hewan1.bersuara(); // Output: Meow! Meow!
        hewan2.bersuara(); // Output: Guk! Guk!
    }
}
