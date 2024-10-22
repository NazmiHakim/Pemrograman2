package PRAK201_2310817210012_NazmiHakim;

	//Pada baris ini terjadi error karena nama kelas tidak sesuai dengan yang ada di Soal3Main.java.
	//Nama kelas seharusnya Pegawai, bukan Employee.
	//public class Employee {
	public class Pegawai {
	    public String nama;
	    
	    //Pada baris ini terjadi error karena tipe data untuk variabel 'asal' harus String, bukan char.
	    //public char asal;
	    public String asal;
	    
	    public String jabatan;
	    
	    public int umur;

	    public String getNama() {
	        return nama;
	    }

	    public String getAsal() {
	        return asal;
	    }

	    //Pada baris ini terjadi error karena parameter untuk method setJabatan() tidak diberikan.
	    //Selain itu, parameter yang hilang tidak memiliki deklarasi di dalam method.
	    //public void setJabatan() {
	    //    this.jabatan = j;
	    //}
	    public void setJabatan(String j) {
	        this.jabatan = j;
	    }
	}
