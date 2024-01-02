import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double km,  tutar = 10,perkm=2.2;
      Scanner scanner = new Scanner(System.in);
        System.out.println("Alınan yolu km cinsinden giriniz: ");
        km = scanner.nextDouble();

        tutar += (perkm* km);
        if(tutar<20){
            tutar = 20;
        }
        System.out.println("Ödenecek tutar = "+tutar);
    }
}