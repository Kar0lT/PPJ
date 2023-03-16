import java.util.Scanner;
    public class zadanie02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ile chcesz policzyc liczb: ");
        int liczba = scanner.nextInt() -1;
        System.out.println("Wypisz liczby: ");
        int suma = 0;
        for(int i=0; i<=liczba; i++)
        {
            suma += scanner.nextInt();
        }
        System.out.println("Suma to: " + suma);
    }
}
/*
        System.out.println("Wpisz ile chcesz policzyc liczb:  ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Wypisz liczby: ");
        int x = scanner.nextInt();
        int suma = 0;
        while (number != 0) {
            number--;
            suma += x;
            x = scanner.nextInt();
        }

}*/
