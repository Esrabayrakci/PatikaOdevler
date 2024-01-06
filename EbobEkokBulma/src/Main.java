import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayilari giriniz: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        int ebob = 1, ekok = 1;
        int a;
        if (n1 >= n2) {
            a = n2;
        } else a = n1;
        int i = a;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("Ebob : " + ebob);
        while (true) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ekok:" + ekok);

    }
}