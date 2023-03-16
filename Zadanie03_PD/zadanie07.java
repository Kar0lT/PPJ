import java.util.Scanner;
public
	class zadanie07 {
		public static void main (String [] args){
			System.out.println("Wpisz temperature w skali Fahrenheita");
	        Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt(), wynik;
            wynik = (x-32) * 5/9;

			System.out.println("W stopniach Celcjusza :  " + wynik);
		}
	}