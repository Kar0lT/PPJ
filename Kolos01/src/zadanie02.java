import java.util.Scanner;
public class zadanie02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Wprowadź wysokość choinki");
        int n = sc.nextInt();
        if(n>1 && n<80){
            for (int i = n; i > 0; i--){
                for (int j = i ; j > 0;j--)
                    System.out.print(" ");
                for (int k=(n - i); k > 0;k--){
                    System.out.print("*");
                }
                    System.out.print("I");
                for(int z=0;z<(n-i);z++)
                    System.out.print("*");
                System.out.println("");
            }
        }
        else {
            System.out.println("Nieprawidłowa wartość");
        }
    }
}