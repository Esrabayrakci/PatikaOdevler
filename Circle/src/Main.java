import java.util.Scanner;
public class Main {
     static final double PI = 3.14;
    public static void main(String[] args) {
      double r,a;
      Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = scanner.nextDouble();
        System.out.println("Dairenin alanı bulunacak açı değerini giriniz");
        a = scanner.nextDouble();
        double alan= (PI * (r*r) * a) / 360;

        System.out.println("Girilen açıya düşen alan: "+alan);
    }
}