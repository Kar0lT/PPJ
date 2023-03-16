import java.util.Scanner;
public class zadanie03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] tab3 = new char[5];
        for (int i = 0; i < tab3.length; i++)
            tab3[i] = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
        for (char val : tab3)
            System.out.print(val + ", ");
            System.out.println();
        byte zeroCounter = 0;
        do {
            char c = in.next().charAt(0);
            for (int i = 0; i < tab3.length; i++) {
                if (c == tab3[i]) {
                    tab3[i] = '0';
                    zeroCounter++;
                }
            }
            for (char var : tab3)
                System.out.print(var + ", ");
                System.out.println();
        } while (zeroCounter != tab3.length);
    }
}