import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        int i = 1;
        int div = 1;
        int total = 0;
        int reset = 0;
        while (i <= n) {
            System.out.print("Bir sayı giriniz : ");
            n = input.nextInt();
            i++;

            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    div = j;
                    total += div;
                }
            }
            if (div == 0) {
                System.out.println("Pozitif değer giriniz !");

            } else if (total == n) {
                System.out.println(n + " Mükemmel Sayıdır .");

            } else {
                System.out.println(n + " Mükemmel Sayı Değildir .");
            }
            total = reset;
        }

    }
}
