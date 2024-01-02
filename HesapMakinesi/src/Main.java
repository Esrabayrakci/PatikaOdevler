import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double s1, s2;
       Scanner scanner = new Scanner(System.in);
       char islem;
        System.out.println("İşlem yapılacak sayilari giriniz: ");
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        System.out.println("Yapılacak işlemi giriniz(+,-,*,/):");
        islem = scanner.next().charAt(0);

        switch(islem){
            case '+':
                System.out.println("Sonuc: "+(s1+s2));
                break;
            case '-':
                System.out.println("Sonuc: "+(s1-s2));
                break;
            case '*':
                System.out.println("Sonuc: "+(s1*s2));
                break;
            case '/':
                if(s2 !=0){System.out.println("Sonuc: "+(s1/s2));}
                else System.out.println("Bir sayi 0 a bölünemez");

                break;
            default:
                System.out.println("Geçersiz işlem seçimi");
        }

    }
}