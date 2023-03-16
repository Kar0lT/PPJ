import java.util.Scanner;
public
class zadanie01 {
    public static void main (String [] args){
        System.out.println("Podaj pierwszy bok prostokata: ");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        System.out.println("Podaj drugi bok prostokata: ");
        float y = scanner.nextFloat();
        if (x > 0 && y > 0){
            System.out.println("Obwod to: " + (2*x+2*y));
            System.out.println("Pole to: " + (x*y));

        } else if (x <= 0 || y <= 0){
            System.out.println("Podana liczba jest nieprawidłowa - nie zostanie wypisane pole i obwod");
        }
    }
}
