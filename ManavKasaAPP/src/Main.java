import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     /*Meyveler ve KG Fiyatları:
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/

        double armutp = 2.14, elmap = 3.67, domatesp = 1.11, muzp = 0.95, patlıcanp = 5;
        double armutkg, elmakg, domateskg, muzkg, patlıcankg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sırasıyla armut, elma, domates, muz, patlıcan dan kaç kg aldıgınızı giriniz:");
        armutkg = scanner.nextDouble();
        elmakg = scanner.nextDouble();
        domateskg = scanner.nextDouble();
        muzkg = scanner.nextDouble();
        patlıcankg = scanner.nextDouble();

        double total= (armutkg*armutp)+(elmakg*elmap)+(domateskg*domatesp)+(muzkg*muzp)+(patlıcankg*patlıcanp) ;
        System.out.println("Ödenecek tutar: "+total);


    }
}