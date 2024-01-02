import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, counter = 0, counter2 = -1;
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınır sayiyi giriniz: ");
        a = scanner.nextInt();
        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                counter += i;
                counter2++;
            }
        }
        average = (counter / counter2);
        System.out.println("Sonuc : " + average);

    }
}