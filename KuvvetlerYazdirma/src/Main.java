import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        a = scanner.nextInt();

        for (int i = 1, j = 1; i < a; i *= 4, j*=5) {
            System.out.println(i);
            System.out.println(j);
        }
    }
}