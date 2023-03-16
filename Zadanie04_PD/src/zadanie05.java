import java.util.Scanner;

public class zadanie05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        boolean pierwsza = true;
        for(int i=2; i<liczba; i++ ){
            if((liczba % i == 0))
                pierwsza = false;
        }
        if(pierwsza)System.out.println("Podana liczba jest liczba pierwsza");
        else System.out.println("Podana liczba nie jest liczba pierwsza");
    }
}