import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        String userName1 = "Esra";
        String password1 = "133Esra";
        int sayi;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz:");
        userName = scanner.next();
        System.out.print("Sifrenizi giriniz: ");
        password = scanner.next();
        if (userName1.equals(userName) && password1.equals(password)) {
            System.out.println("Giriş başarılı!");

        } else {
            System.out.println("Giriş başarısız!\nŞifrenizi sıfırlamak için 1 i , çıkış yapmak için 0 ı tuşlayınız.");

            System.out.println("Sayi giriniz: ");
            sayi = scanner.nextInt();
            if (sayi == 1) {
                String password2;
                System.out.print("Yeni şifrenizi giriniz: ");
                password2 = scanner.next();
                if (!password2.equals(password1) && !password2.equals(password)) {
                    System.out.println("Şifreniz oluşturuldu");
                    password = password2;
                } else System.out.println("Şifreniz oluşturulamadı ! Lütfen başka şifre girin.");
                  
            } else {
                System.out.println("Sistemden çıkılıyor...");
            }
        }
    }
}