import java.util.Scanner;
public class zadanie02{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe dla a.");
        double a=scanner.nextDouble();
        System.out.println("Podaj liczbe dla b.");
        double b=scanner.nextDouble();
        System.out.println("Podaj liczbe dla c");
        double c=scanner.nextDouble();
        double delta = (b*b)-(4*(a*c));
        double pierwiastek = Math.sqrt(delta);
        if (a==0){
            System.out.println("Nie jest to rownanie kwadaratowe. - poniewaz a == 0");
        }
        else{
            if (delta>0){
                double pierwsze = (-b-pierwiastek)/(2*a);
                double drugie = (-b+pierwiastek)/(2*a);
                System.out.println("Delta jest rowna: "+delta);
                System.out.println("Pierwsze miejsce zerowe jest rowne:"+pierwsze);
                System.out.println("Drugie miejsce zerowe jest rowne: "+drugie);
            }
            if (delta==0){
                double zero = (-b)/(2*a);
                System.out.println("Delta jest rowna: "+delta);
                System.out.println("Wartosc delty == 0 - mamy 1 miejsce zerowe");
                System.out.println("Miejsce zerowe to: "+zero);
            }
            if(delta<0){
                System.out.println("Delta jest rowna: "+delta);
                System.out.println("Wartosc delty < 0 - nie ma miejsc zerowych");
            }
        }
    }
}