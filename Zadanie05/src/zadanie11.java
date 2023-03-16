import java.util.Scanner;
public class zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz metode platnosci (BLIK - 1, przelew - 2)");
        int metoda = scanner.nextInt();
        switch (metoda) {
            case 1:
                System.out.println("Blik");
                break;
            case 2:
                System.out.println("Przelew");
        }
    }
}




























/*                for (int i=1; i<miesiac; i++){
        dni += switch(i){
        case 1,3,5,7,8,10,12 -> 31;
        case 4,6,9,11 -> 30;
        case 2 -> (rok%4==0 && rok%100!=0) || rok%400 == 0 ? 28:29;
default -> 0;
        };*/