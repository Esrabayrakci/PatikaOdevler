import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int num;
        System.out.print("Harmonik serisi hesaplanacak sayiyi giriniz: ");
        num  = scanner.nextInt();
        double total = 0.0;
        for(int i = 1; i<=num ; i++){
            total +=(1.0/i);
        }
        System.out.println("Sonuç : "+total);
    }
}