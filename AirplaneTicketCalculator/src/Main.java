import java.util.Scanner;
/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

public class Main {
    public static void main(String[] args) {
    int  km, age, type;
    double pay = 0, ppay = 0.10;
    Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden yazınız: ");
        km = scanner.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = scanner.nextInt();
        System.out.println("Yolculuk tipini seçiniz (Tek Yön =>1 , Gidiş-Dönüş =>2):");
        type = scanner.nextInt();
        if((km < 0) || (age < 0) || !(type==1 || type ==2)){
            System.out.println("Hatalı giriş yaptınız!");
        }
        if(type == 2){
            km *= 2;
            pay =( km * ppay );
            pay -= (pay * 20/100);
        }else  pay =( km * ppay );


        if(age < 12){
            pay -= (pay * 50/100);
        }else if(age > 12 && age <=24){
            pay -= (pay * 10/100);
        }else if(age > 65){
            pay -= (pay * 30/100);
        }

        System.out.println("Toplam tutar: "+pay);

    }
}