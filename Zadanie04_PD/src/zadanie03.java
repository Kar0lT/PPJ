import java.util.Scanner;
public class zadanie03
{
    public static void main(String[] args)
        {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz ile chcesz wypisac liczb: ");
    int liczba = scanner.nextInt() -2;
    System.out.println("Wypisz liczby: ");
    int najwieksza = scanner.nextInt();
    for(int i=0; i<=liczba; i++)
    {
        int nowaLiczba = scanner.nextInt();
        if (nowaLiczba > najwieksza)
        {
            najwieksza = nowaLiczba;
        }
    }
    System.out.println("Najwieksza to: " + najwieksza);
}
}
