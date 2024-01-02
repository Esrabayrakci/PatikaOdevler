import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 10 elemanlı dizi girişi al
        System.out.println("Lütfen 10 sayı giriniz:");
        int[] dizi = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi kabarcık sıralama algoritması ile sırala
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = 0; j < dizi.length - 1 - i; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    // Swap işlemi
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }

        // Sıralanmış diziyi ekrana yazdır
        System.out.println("Sıralanmış Dizi:");
        for (int sayi : dizi) {
            System.out.print(sayi + " ");
        }
    }
}
