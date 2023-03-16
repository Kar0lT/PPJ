import java.util.Scanner;
public class zadanie01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc pierwszego kata.");
        double a=scanner.nextDouble();
        System.out.println("Podaj wartosc drugiego kata.");
        double b=scanner.nextDouble();
        System.out.println("Podaj wartosc trzeciego kata.");
        double c=scanner.nextDouble();
        if (a+b+c==180){
            System.out.println((a<90 && b<90 && c<90)? "Powstal trojkat ostrokatny.":"Powstal trojkat ale nie ostrokatny.");
        } else
            System.out.println("Nie powstal trojkat.");
    }
}
