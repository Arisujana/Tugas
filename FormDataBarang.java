import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormDataBarang extends JFrame {
    private JTextField tfKodeBarang, tfNamaBarang, tfStok, tfHarga;
    private JButton btnSimpan, btnUbah, btnHapus, btnBersihkan;

    public FormDataBarang() {
        setTitle("Form Data Barang");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel input
        JPanel panelForm = new JPanel(new GridLayout(4, 2, 10, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        // Label dan Text Field
        panelForm.add(new JLabel("Kode Barang:"));
        tfKodeBarang = new JTextField();
        panelForm.add(tfKodeBarang);

        panelForm.add(new JLabel("Nama Barang:"));
        tfNamaBarang = new JTextField();
        panelForm.add(tfNamaBarang);

        panelForm.add(new JLabel("Stok:"));
        tfStok = new JTextField();
        panelForm.add(tfStok);

        panelForm.add(new JLabel("Harga:"));
        tfHarga = new JTextField();
        panelForm.add(tfHarga);

        // Panel tombol
        JPanel panelTombol = new JPanel(new FlowLayout());
        btnSimpan = new JButton("Simpan");
        btnUbah = new JButton("Ubah");
        btnHapus = new JButton("Hapus");
        btnBersihkan = new JButton("Bersihkan");

        panelTombol.add(btnSimpan);
        panelTombol.add(btnUbah);
        panelTombol.add(btnHapus);
        panelTombol.add(btnBersihkan);

        // Tambahkan panel ke frame
        add(panelForm, BorderLayout.CENTER);
        add(panelTombol, BorderLayout.SOUTH);

        // Event handler sederhana
        btnSimpan.addActionListener(e -> JOptionPane.showMessageDialog(this, "Data disimpan!"));
        btnUbah.addActionListener(e -> JOptionPane.showMessageDialog(this, "Data diubah!"));
        btnHapus.addActionListener(e -> JOptionPane.showMessageDialog(this, "Data dihapus!"));
        btnBersihkan.addActionListener(e -> bersihkanForm());
    }

    private void bersihkanForm() {
        tfKodeBarang.setText("");
        tfNamaBarang.setText("");
        tfStok.setText("");
        tfHarga.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormDataBarang().setVisible(true));
    }
}
