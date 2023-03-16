import java.util.Scanner;
public class zadanie03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz z ilu wierszy i kolumn ma skladac sie szachownica");
        int x = scanner.nextInt();
        for (int i = 0; i< x; i++){
            for (int j = 0; j<(i%2==0 ? x-1 : x);j++){
                if (i%2==0){
                    System.out.print(" *");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}