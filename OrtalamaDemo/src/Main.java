import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double lesson1, lesson2, lesson3, lesson4, lesson5, average = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik, Fizik, Türkçe, Kimya ve Müzik notlarinizi giriniz: ");
        lesson1 = scanner.nextDouble();
        lesson2 = scanner.nextDouble();
        lesson3 = scanner.nextDouble();
        lesson4 = scanner.nextDouble();
        lesson5 = scanner.nextDouble();
        if (!(lesson1 <= 100 && lesson1 > 0)) lesson1 = 0;
        if (!(lesson2 <=100 && lesson2 > 0)) lesson2 = 0;
        if (!(lesson3 <= 100 && lesson3 > 0)) lesson3 = 0;
        if (!(lesson4 <= 100 && lesson4 > 0)) lesson4 = 0;
        if (!(lesson5 <= 100 && lesson5 > 0)) lesson5 = 0;

        average = (lesson1 + lesson2 + lesson3 + lesson4 + lesson5) / 5;

        System.out.println("Ortalamanız: "+average);

        if (average >= 55) System.out.println("Tebrikler geçtiniz !");
        else System.out.println("Maalesef kaldiniz !");


    }
}