package soal1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

class Dadu {
    private int nilai;

    public Dadu() {
        acakNilai();
    }

    private void acakNilai() {
        Random random = new Random();
        this.nilai = random.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> daduList = new LinkedList<>();
        
        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();
        
        for (int i = 0; i < jumlahDadu; i++) {
            daduList.add(new Dadu());
        }
        
        int totalNilai = 0;
        for (int i = 0; i < daduList.size(); i++) {
            Dadu dadu = daduList.get(i);
            int nilai = dadu.getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilai);
            totalNilai += nilai;
        }
        
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        
        scanner.close();
    }
}
