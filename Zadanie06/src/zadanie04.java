import java.util.Scanner;
public class zadanie04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = 1;
        while (y <= n) {
            for (int i =1; i<=4; i++)
                System.out.print(Math.pow(y, i) + " (^" + i + "), ");
            System.out.println();
            y++;
        }
    }
}