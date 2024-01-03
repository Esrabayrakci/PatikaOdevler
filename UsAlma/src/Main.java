import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, total = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alinacak sayiyi giriniz: ");
        n = scanner.nextInt();
        System.out.print("Us değerini giriniz: ");
        k = scanner.nextInt();
        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println(n+"^"+k+" : "+total);
    }
}