import java.util.Scanner;
public
class zadanie04 {
    public static void main (String [] args) {
        System.out.println("Podaj pierwsza liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int y = scanner.nextInt();
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        System.out.println("Największy wspólny dzielnik NWD to: " + x);
    }
}
