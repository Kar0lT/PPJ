import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
                System.out.print("Podaj liczbę: ");
                int liczba = scanner.nextInt();
                boolean pierwsza = true;
                for(int i=2; i<liczba; i++ ){
                if((liczba % i == 0)) {
                    pierwsza = false;

                }
                }
        if(pierwsza)System.out.println("pierwsza");
        else System.out.println("chuj");




    }

}