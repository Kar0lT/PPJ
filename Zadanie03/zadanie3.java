import java.util.Scanner;
public
    class zadanie3 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe : ");
            System.out.println("1 - Pada");
            System.out.println("2 - Nie Pada");
            int x = scanner.nextInt();
            boolean czyPada = true;
            if (x==2){
                System.out.println("Nie Pada");
            }
            else{
                System.out.println("Pada");
            }
        }
    }