import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
         *Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
         *Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
         *Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

        double heat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz: ");
        heat = scanner.nextDouble();
        if (heat < 5) System.out.println("Kayak yapabilirsiniz.");
        if (heat >= 5 && heat < 15) System.out.println("Sinemaya gidebilirsiniz.");
        if (heat >= 10 && heat < 25) System.out.println("Pikniğe gidebilirsiniz.");
        if (heat >= 25) System.out.println("Yüzmeye gidebilirsiniz.");
    }
}