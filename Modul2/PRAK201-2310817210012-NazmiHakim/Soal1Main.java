package PRAK201_2310817210012_NazmiHakim;

import java.util.Locale;

public class Soal1Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0, 40);
        Buah mangga = new Buah("mangga", 0.2, 3500.0, 15);
        Buah alpukat = new Buah("alpukat", 0.25, 10000.0, 12);

        apel.tampilkanHargaBuah();
        mangga.tampilkanHargaBuah();
        alpukat.tampilkanHargaBuah();
    }
}

class Buah {
    String namaBuah;
    double beratPerBuah, hargaPerSatuan, jumlahBeli, hargaSebelumDiskon, hargaSetelahDiskon, totalDiskon;

    public Buah(String namaBuah, double beratPerBuah, double hargaPerSatuan, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.beratPerBuah = beratPerBuah;
        this.hargaPerSatuan = hargaPerSatuan;
        this.jumlahBeli = jumlahBeli;
        this.hargaSebelumDiskon = (jumlahBeli / beratPerBuah) * hargaPerSatuan;
        hitungDiskon();
    }

    private void hitungDiskon() {
        double beratDiskon = Math.floor(jumlahBeli / 4);
        totalDiskon = beratDiskon * 0.02 * hargaPerSatuan * 4;
        hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;
    }

    public void tampilkanHargaBuah() {
        Locale.setDefault(Locale.US);

        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + beratPerBuah);
        System.out.println("Harga: " + hargaPerSatuan);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f\n", totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", hargaSetelahDiskon);
    }
}
