import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Esra";
        String pass = "123";
        String userName, password;
        int balance = 10000;
        boolean state = true;

        int counter = 3;
        while ( state == true) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = scanner.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = scanner.nextLine();
            if (userName.equals(name) && password.equals(pass)) {
                while (state) {
                    int select;
                    int amount;
                    System.out.println("Esra dijital bankacılığa hoşgeldiniz!");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:\n1- Para yatırma\n" +
                            "2- Para çekme\n" +
                            "3- Bakiye sorgulama\n" +
                            "4- Çıkış yap ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            amount = scanner.nextInt();
                            balance += amount;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            amount = scanner.nextInt();
                            if (balance < amount) {
                                System.out.println("Bakiye yetersiz!");
                            } else balance -= amount;

                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Sistemden çıkılıyor...");
                            state = false;
                            break;
                    }

                }
                counter = 0;
            } else if (name.equals(userName) && !pass.equals(password)) {
                System.out.println("Şifreniz yanlıştır, tekrar deneyiniz");
            } else if (!name.equals(userName) && pass.equals(password)) {
                System.out.println("Kullanıcı adı yanlıştır, tekrar deneyiniz");
            } else System.out.println("Kullanıcı adı ve şifre yanlıştır, tekrar deneyiniz");
            counter--;
            System.out.println("Kalan deneme hakkınız : " +counter);
            if (counter == 3) {
                System.out.println("Şifreniz bloke olmuştur, lütfen bankanızla iletişime geçiniz!");
                state =false;
            }
        }

    }
}