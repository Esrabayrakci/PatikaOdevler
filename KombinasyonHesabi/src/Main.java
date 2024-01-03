import java.sql.SQLOutput;
import java.util.Scanner;

//C(n,r) = n! / (r! * (n-r)!)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r, total = 1, total2 = 1, total3 = 1;
        System.out.println("Kombinasyon hesabı yapılacaktır\n--------------");
        System.out.print("n sayisini girniz: ");
        n = scanner.nextInt();
        System.out.print("r sayisini giriniz: ");
        r = scanner.nextInt();

        for (int i = 1, j = 1; i <= n; i++) {
            total *= i;
            if (i <= r) {
                total2 *= i;
            }
            if (i <= (n - r)) {
                total3 *= i;
            }
        }
        int c = total / (total2 * total3);
        System.out.println("C(n,r) : " + c);
    }
}