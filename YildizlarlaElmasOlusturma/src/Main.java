import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayi giriniz: ");
        sayi = scanner.nextInt();
        for (int i = 0; i <= sayi; i++) {
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = sayi; i >= 0; i--) {
            for (int j = (sayi - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}