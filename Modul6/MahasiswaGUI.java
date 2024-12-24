package PRAKTIKUM6;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MahasiswaGUI {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;
    
    private Mahasiswa[] mahasiswaArray = {
        new Mahasiswa(1, "Nazmi Hakim", "2310817210012"),
        new Mahasiswa(2, "Siti", "2310817210013"),
        new Mahasiswa(3, "Andi", "2310817210014"),
        new Mahasiswa(4, "Rina", "2310817210015"),
        new Mahasiswa(5, "Dewi", "2310817210016"),
        new Mahasiswa(6, "Asep", "2310817210017"),
        new Mahasiswa(7, "Lina", "2310817210018"),
        new Mahasiswa(8, "Eka", "2310817210019"),
        new Mahasiswa(9, "Rudi", "2310817210020"),
        new Mahasiswa(10, "Putri", "2310817210021")
    };

    public MahasiswaGUI() {
        frame = new JFrame("Daftar Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        model = new DefaultTableModel();
        model.addColumn("NIM");
        model.addColumn("Nama");

        for (Mahasiswa m : mahasiswaArray) {
            model.addRow(new Object[]{m.getNim(), m.getNama()});
        }

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MahasiswaGUI();
            }
        });
    }
}