import java.util.Scanner;

public class PRAK102_2310817210012_NazmiHakim {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        int angkaAwal = scanner.nextInt();

        int count = 0; 
        int angka = angkaAwal;

        while (count <= 10) {

            if (angka % 5 == 0) {
                System.out.print((angka / 5) - 1); 
            } else {
                System.out.print(angka); 
            }

            if (count < 10) {
                System.out.print(", ");
            }

            angka++;
            count++;
        }

        scanner.close();    }
}
