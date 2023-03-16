public class zadanie05 {
    public static void main(String[] args) {
        int[] tab4 = new int[(int) (6 + Math.random() * 5)];
        for (int i = 0; i < tab4.length; i++)
            tab4[i] = i;
        System.out.println("Zakres liczb: ");
        for (int var : tab4)
            System.out.print(var + ", ");
        System.out.println();
        System.out.println("Wylosowane liczby:");
        for (int i = tab4.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int a = tab4[index];
            tab4[index] = tab4[i];
            tab4[i] = a;
        }
        for (int var : tab4)
            System.out.print(var + " ");
        System.out.println();
        System.out.println("Wizualizacja");
        for (int i = 0; i < tab4.length; i++) {
            for (int var : tab4) {
                if (var < 10) {
                    if (var != i) {
                        System.out.print(". ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    if (var != i) {
                        System.out.print(" . ");
                    } else {
                        System.out.print(" * ");
                    }
                }
            }
            System.out.println();
        }
    }
}