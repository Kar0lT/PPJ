public class zadanie01 {
    public static void main(String[] args) {
        int[] tab1 = new int[(int) (5 + Math.random() * 10)];
        int[] tab2 = new int[(int) (5 + Math.random() * 10)];
        int[] tab3 = new int[(int) (5 + Math.random() * 10)];
        for (int i = 0; i < tab1.length; i++)
            tab1[i] = (int) (Math.random() * 10);
        for (int i = 0; i < tab2.length; i++)
            tab2[i] = (int) (Math.random() * 10);
        for (int i = 0; i < tab3.length; i++)
            tab3[i] = (int) (Math.random() * 10);

        int[][] ex5tab = new int[3][];
        ex5tab[0] = tab1;
        ex5tab[1] = tab2;
        ex5tab[2] = tab3;
        for (int i = 0; i < ex5tab.length; i++) {
            System.out.print(i + " :[ ");
            for (int j = 0; j < ex5tab[i].length; j++) {
                System.out.print(ex5tab[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}