import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNum;
        System.out.print("Basamak sayısını giriniz: ");
        lineNum = scanner.nextInt();
        for (int i = lineNum; i > 0; i--) {
            for (int j = 0; j <= lineNum - i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}