
public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int j = 2; j < 100; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(j);
            }
            counter = 0;
        }

    }
}