import java.util.Scanner;
public class zadanie07 {
    public static void main(String[] args) {
        System.out.println("Wpisz liczby");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = scanner.nextInt();
        int licznik = 0;
        while(number !=0){
            sum += number;
            licznik ++;
            number = scanner.nextInt();
        }
        System.out.println("Suma to: "+ sum);
        System.out.println("Liczba operacji to: "+ licznik);}
}