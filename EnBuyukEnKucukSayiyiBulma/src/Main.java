import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Kaç sayi girmek istersiniz: ");
        num = scanner.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print(i + 1 + ". sayiyi giriniz: ");
            a[i] = scanner.nextInt();
        }
        int max = a[0], min = a[0];
        for (int i = 0; i < num; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("En büyük değer : " + max);
        System.out.println("En küçük  değer : " + min);
    }
}