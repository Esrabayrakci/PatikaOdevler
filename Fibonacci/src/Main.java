import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, fib1 = 0, fib2 = 1;
        System.out.print("Eleman sayısını giriniz : ");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            int temp = fib1;
            fib1 = fib2;
            fib2 = temp + fib2;

        }
        System.out.println(fib2);
    }
}