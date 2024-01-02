import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      double boy,kilo,index;
      Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz (metre): ");
        boy = scanner.nextDouble();
        System.out.println("Kilonuzu giriniz (kg): ");
        kilo = scanner.nextDouble();

        index = kilo / (boy*boy);
        System.out.println("Vücut kitle indexiniz: "+index);
    }
}