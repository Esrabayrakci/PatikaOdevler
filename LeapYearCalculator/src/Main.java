import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int year;
       boolean result = false;
       Scanner scanner = new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        year = scanner.nextInt();
        if(year % 100 ==0){
            result = year % 400 == 0;
        }
        else result = year % 4 == 0;

        if(result == true){
            System.out.println("Artık yıldır!");
        }else System.out.println("Artık yıl değildir!");
    }
}