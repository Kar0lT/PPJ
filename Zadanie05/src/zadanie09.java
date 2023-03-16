import java.util.Scanner;
public class zadanie09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dzien");
        int dzien = scanner.nextInt();
        System.out.println("Wpisz miesiac");
        int miesiac = scanner.nextInt();
        System.out.println("Wpisz rok");
        int rok = scanner.nextInt();

        int dni = 0;
        for (int i=1; i<miesiac; i++){
            dni += switch(i){
                case 1,3,5,7,8,10,12 -> 31;
                case 4,6,9,11 -> 30;
                case 2 -> (rok%4==0 && rok%100!=0) || rok%400 == 0 ? 28:29;
                default -> 0;
            };
        }
        dni+=dzien;
        System.out.println("Dzien: "+ dzien);
        System.out.println("Miesiac: " + miesiac);
        System.out.println("Od rozpoczecia roku do podanego dnia minelo: " + dni + " dni.");
    }
}