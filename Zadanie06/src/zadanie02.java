import java.util.Scanner;
public class zadanie02{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe w PLN");
        float kwota = scanner.nextFloat();
        float[] waluty = new float[]{10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f};
        int y;
        for (float x : waluty) {
            y = Math.round(kwota / x * 100) / 100;
            if (x >= 1)
                System.out.println(y + " " + (int) x + "zl");
            else
                System.out.println(y + " " + (int) (x * 100) + "gr");
            kwota -= y * x;
            kwota = (float) (Math.round(kwota * 100)) / 100;
        }
        while (kwota < 0.05) {
            if (kwota >= 10) {
                y = (int) (kwota / 10);
                System.out.println(y + " 10 zl");
                kwota -= y * 10;
            } else if (kwota >= 5) {
                y = (int) (kwota / 5);
                System.out.println(y + " 5 zl");
                kwota -= y * 5;
            } else if (kwota >= 2) {
                y = (int) (kwota / 2);
                System.out.println(y + " 2 zl");
                kwota -= y * 2;
            } else if (kwota >= 1) {
                y = (int) (kwota);
                System.out.println(y + " 1 zl");
                kwota -= y;
            } else if (kwota >= 0.5) {
                y = (int) (kwota / 0.5);
                System.out.println(y + " 50 gr");
                kwota -= y * 0.5;
            } else if (kwota >= 0.2) {
                y = (int) (kwota / 0.2);
                System.out.println(y + " 20 gr");
                kwota -= y * 0.2;
            } else if (kwota >= 0.1) {
                y = (int) (kwota / 0.1);
                System.out.println(y + " 10 gr");
                kwota -= y * 0.1;
            } else if (kwota >= 0.05) {
                y = (int) (kwota / 0.05);
                System.out.println(y + " 5 gr");
                kwota -= y * 0.05;
            }
        }
        System.out.println(kwota);
    }
}