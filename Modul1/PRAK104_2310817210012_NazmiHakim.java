import java.util.Scanner;

public class PRAK104_2310817210012_NazmiHakim {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tangan Abu: ");
        String abuInput = input.nextLine().replace(" ", "").toUpperCase();
        System.out.print("Tangan Bagas: ");
        String bagasInput = input.nextLine().replace(" ", "").toUpperCase();
        
        int abuPoints = 0, bagasPoints = 0;

        for (int i = 0; i < 3; i++) {
            char abu = abuInput.charAt(i);
            char bagas = bagasInput.charAt(i);

            if (abu == bagas) {
                continue;
            } else if ((abu == 'B' && bagas == 'G') || 
                       (abu == 'G' && bagas == 'K') || 
                       (abu == 'K' && bagas == 'B')) {
                abuPoints++;
            } else {
                bagasPoints++;
            }
        }

        if (abuPoints > bagasPoints) {
            System.out.println("Abu");
        } else if (bagasPoints > abuPoints) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        
        input.close();
    }
}
