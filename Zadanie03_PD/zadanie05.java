import java.util.Scanner;
public
	class zadanie05 {
		public static void main (String [] args){
			System.out.println("Podaj liczbę");
            Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			System.out.println(
			(x < 10) ? "Liczba jest mniejsza od 10" : (x < 100) ? "Liczba jest mniejsza od 100" : (x < 1000) ? "Liczba jest mniejsza od 1000" : "Liczba jest wieksza od 1000");
		}
	}