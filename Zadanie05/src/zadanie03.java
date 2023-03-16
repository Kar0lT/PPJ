import java.util.Scanner;
public class zadanie03{
    public static void main(String[] args){
        System.out.println("Podaj liczbe zdobytych punktow.");
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        System.out.println("Podaj maksymalna ilosc punktow mozliwych do zdobycia.");
        double maksymalne = scanner.nextDouble();
        double procent = ((liczba/maksymalne)*100);

        if (procent>87.5){
            System.out.println("Zdobyto: " + procent + "%.");
            System.out.println("Ocena: 5");
        }
        else if (procent>81.25){
            System.out.println("Zdobyto: " + procent + "%.");
            System.out.println("Ocena: 4.5");
        }
        else if (procent>75){
            System.out.println("Zdobyto: " + procent + "%.");
            System.out.println("Ocena: 4");
        }
        else if (procent>62.6){
            System.out.println("Zdobyto: " + procent + "%.");
            System.out.println("Ocena: 3.5");
        }
        else if (procent>50){
            System.out.println("Zdobyto: " + procent + "%.");
            System.out.println("Ocena: 3");
        }
        else{
            System.out.println("Zdobyto: " + procent + "%.");
            System.out.println("Nie zaliczone.");
        }
    }
}