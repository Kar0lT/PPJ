public class zadanie01 {
    public static void main(String[] args) {
        double[] tab1 = new double[10];
        for (int i = 0; i < tab1.length; i++)
            tab1[i] = (1 + Math.random() * 100);

        System.out.println("Tabela liczb:");
        for (double val : tab1)
            System.out.print(val + ", ");

        System.out.println();
        System.out.println("Liczby o parzystym indeksie:");
        for (int i = 0; i < tab1.length; i++)
            if (i % 2 == 0)
                System.out.print(tab1[i] + ", ");

        System.out.println();
        System.out.println("Liczby nieparzyste:");
        for (double val : tab1)
            if ((int) val % 2 != 0)
                System.out.print(val + ", ");
        System.out.println();
    }
}