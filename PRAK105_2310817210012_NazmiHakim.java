import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2310817210012_NazmiHakim {
	private static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        System.out.print("Masukkan jari-jari: ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();

        double volume = PHI * jariJari * jariJari * tinggi;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n", jariJari, tinggi, volume);
        
        scanner.close();
    }
}
