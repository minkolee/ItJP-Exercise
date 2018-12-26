import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner
        int sum=1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("i = "+ i + "j= "+ j);
            }
        }
    }
}