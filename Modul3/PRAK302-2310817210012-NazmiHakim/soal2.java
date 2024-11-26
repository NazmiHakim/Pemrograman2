package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;
    private boolean isMonarki;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.isMonarki = true;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggal;
        this.bulanKemerdekaan = bulan;
        this.tahunKemerdekaan = tahun;
        this.isMonarki = false;
    }

    public void printDetail(HashMap<Integer, String> bulanMap) {
        System.out.print("Negara " + nama + " mempunyai ");
        if (jenisKepemimpinan.equalsIgnoreCase("presiden")) {
            System.out.print("Presiden");
        } else if (jenisKepemimpinan.equalsIgnoreCase("perdana menteri")) {
            System.out.print("Perdana Menteri");
        } else if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.print("Raja");
        }
        System.out.println(" bernama " + namaPemimpin);

        if (!isMonarki) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " "
                    + bulanMap.get(bulanKemerdekaan) + " " + tahunKemerdekaan);
        }

        System.out.println();
    }
}

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> bulanMap = new HashMap<>();

        // Inisialisasi nama-nama bulan
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");

        int jumlahNegara = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                negaraList.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
            } else {
                int tanggal = scanner.nextInt();
                int bulan = scanner.nextInt();
                int tahun = scanner.nextInt();
                scanner.nextLine(); 
                negaraList.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
            }
        }

        for (Negara negara : negaraList) {
            negara.printDetail(bulanMap);
        }

        scanner.close();
    }
}
