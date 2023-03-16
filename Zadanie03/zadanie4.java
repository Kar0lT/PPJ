import java.util.Scanner;
public
    class zadanie4 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe:");
            int x = scanner.nextInt();
            System.out.println( x > 0 ? "Liczba jest w przedziale od 0 do nieskonczonosci" : "Liczba nie jest w przedziale od 0 do nieskonczonosci");
            System.out.println( x < 0 ? "Liczba jest w przedziale od minus nieskonczonosci do 0" : "Liczba nie jest w przedziale od minus nieskonczonosci do 0");
            System.out.println( x <= 1 && x >= 0 ? "Liczba jest liczba jest wieksza lub rowna od 0 i mniejsza lub rowna 1" : "Liczba jest liczba jest wieksza lub rowna od 0 i mniejsza lub rowna 1");
        }
    }