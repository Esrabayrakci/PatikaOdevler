import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
   double kenar1,kenar2;
   Scanner scanner = new Scanner(System.in);
        System.out.println("Uckenin dik kenarlarini giriniz: ");
        kenar1 = scanner.nextDouble();
        kenar2 = scanner.nextDouble();
        double hipotenus = Math.sqrt(kenar1*kenar1 +kenar2*kenar2);
        double kenarUzunlugu = kenar1+kenar2+hipotenus;
        System.out.println("Hipotenüs : "+hipotenus);
        System.out.println("Kenar uzunlugu : "+kenarUzunlugu);
        double alan = kenar1 * kenar2 / 2;
        System.out.println("Alani : "+alan);
    }
}