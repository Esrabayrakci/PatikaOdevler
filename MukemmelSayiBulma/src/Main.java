import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Sayi giriniz: ");
        num = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if(num == total){
            System.out.println(num+" mükemmel sayıdır.");
        } else System.out.println(num+" mükemmel sayı değildir.");

    }
}