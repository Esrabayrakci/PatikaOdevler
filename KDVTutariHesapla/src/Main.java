import java.util.Scanner;
public class Main {
    static double kdv= 0.18;
    public static void main(String[] args) {
       double para;
       Scanner scanner = new Scanner(System.in);
       System.out.println("KDV li tutari hesaplanacak para tutarini giriniz: ");
        para = scanner.nextDouble();
        double yeniPara ;
        yeniPara = para+ (para * kdv);
        System.out.println("Girilen fiyat: "+para);
        System.out.println("KDV li fiyat: "+yeniPara);
        System.out.println("KDV tutari : "+(yeniPara-para));
    }
}