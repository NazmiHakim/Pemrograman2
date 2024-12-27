package soal1;

import java.util.Scanner;
import java.util.Locale;

public class PRAK101_2310817210012_NazmiHakim {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = scanner.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = scanner.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();
        
        if (bulanLahir < 1 || bulanLahir > 12) {
            System.out.println("Bulan yang dimasukkan tidak valid!");
            return;
        }
        
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        scanner.nextLine();
        
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = scanner.nextInt();

        scanner.nextLine();
        
        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = scanner.nextDouble();
        
        System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d\n",
                namaLengkap, tempatLahir, tanggalLahir, getBulan(bulanLahir), tahunLahir);
        System.out.printf("Tinggi Badan %d cm dan Berat Badan %.2f kilogram\n", tinggiBadan, beratBadan);
    }

    private static String getBulan(int bulan) {
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return namaBulan[bulan - 1];
    }
}
