import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, total = 0, i = 1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(i + ". sayiyi giriniz: ");
            a = scanner.nextInt();
            if (a % 4 == 0) {
                total += a;
            }
            i++;

        } while (a % 2 == 0);
        System.out.println("Sonuç: " + total);
    }
}