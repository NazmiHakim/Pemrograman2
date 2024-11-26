package soal3;

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();

                    boolean nimExists = false;
                    for (Mahasiswa m : mahasiswaList) {
                        if (m.getNim().equals(nim)) {
                            nimExists = true;
                            break;
                        }
                    }

                    if (nimExists) {
                        System.out.println("NIM sudah ada. Mahasiswa tidak dapat ditambahkan.");
                    } else {
                        mahasiswaList.add(new Mahasiswa(nama, nim));
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimToDelete = scanner.nextLine();
                    boolean deleted = false;

                    for (int i = 0; i < mahasiswaList.size(); i++) {
                        if (mahasiswaList.get(i).getNim().equals(nimToDelete)) {
                            mahasiswaList.remove(i);
                            deleted = true;
                            break;
                        }
                    }

                    if (deleted) {
                        System.out.println("Mahasiswa dengan NIM " + nimToDelete + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimToDelete + " tidak ditemukan.");
                    }
                    break;

                case 3:

                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimToSearch = scanner.nextLine();
                    boolean found = false;

                    for (Mahasiswa m : mahasiswaList) {
                        if (m.getNim().equals(nimToSearch)) {
                            System.out.println("Mahasiswa ditemukan:");
                            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + nimToSearch + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    if (mahasiswaList.isEmpty()) {
                        System.out.println("Daftar Mahasiswa kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa m : mahasiswaList) {
                            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                        }
                    }
                    break;

                case 0:
                    running = false;
                    mahasiswaList.clear();
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
