import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Basamak sayilarinin toplami bulunacak sayiyi giriniz: ");
        number = scanner.nextInt();
        int total = 0;
        while (number > 0){
            total += number % 10;
            number = number /10;
        }
        System.out.println("Sonuç : "+total);
    }
}