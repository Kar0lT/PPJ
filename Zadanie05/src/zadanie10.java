import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i % 2 == 0 ? n - 1 : n); j++) {
                if (i % 2 == 0) {
                    System.out.print(" *");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
