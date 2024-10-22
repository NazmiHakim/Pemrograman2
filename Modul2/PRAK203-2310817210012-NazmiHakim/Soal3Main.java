package PRAK201_2310817210012_NazmiHakim;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        
        //Pada baris ini terjadi error karena kurang tanda titik koma (;) di akhir pernyataan.
        //p1.nama = "Roi"
        p1.nama = "Roi";
        
        p1.asal = "Kingdom of Orvel";
        
        p1.setJabatan("Assasin");

        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada baris ini terjadi error karena variabel 'umur' tidak diberi nilai.
        //Tambahkan nilai variabel 'umur'
        p1.umur = 17;
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}