import java.util.Scanner;

public class PRAK103_310817210012_NazmiHakim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();

        int bilanganAwal = scanner.nextInt();

        int jumlahDeret = 0;
        int angka = bilanganAwal;

        do {
            if (angka % 2 != 0) {  
                System.out.print(angka);
                jumlahDeret++;

                if (jumlahDeret < N) {
                    System.out.print(", ");
                }
            }
            angka++;
        } while (jumlahDeret < N);

        scanner.close();
    }
}
