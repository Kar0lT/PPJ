import java.util.Scanner;

public class zadanie05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me size of painting (side length will be 2*size + 1): ");
        int size = scanner.nextInt();
        int side = ((size * 2) + 1);
        int index = size;
        for (int rows = 1; rows <= side; rows++) {
            System.out.print(rows);
            if (rows < size + 1)
                for (int k = 0; k < side; k++)
                    if (((k > (size - rows)) && (k < (size + rows))) || k == size)
                        System.out.print(" *");
                    else
                        System.out.print(" .");

            else if (rows == size + 1)
                for (int j = 0; j < side; j++)
                    System.out.print(" *");
            else {
                for (int j = 0; j < side; j++)
                    if (j == size || (j > size - index && j < size + index))
                        System.out.print(" *");
                    else
                        System.out.print(" .");

                index--;
            }
            System.out.println();
        }

    }
}