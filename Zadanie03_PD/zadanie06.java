import java.util.Scanner;
public
	class zadanie06 {
		public static void main (String [] args){
			System.out.println("Wpisz rok");
	        Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			int y = x%4;
			int z = x%100;
			int t = x%400;

			System.out.print((y == 0 && z != 0) || (t == 0)  ? "Rok " + x + " jest przestepny." : "Rok " + x + " nie jest przestepny.");
		}
	}