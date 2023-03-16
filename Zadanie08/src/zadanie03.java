public class zadanie03 {
    public static void main(String[] args) {
        int[][] tab = {{1, 0, 0, 0, 0},{0,1,0,0},{0,0,1}};
        int size = 0;

        for (int i = 0; i < tab.length; i++){
            size += tab[i].length;
        }
        int[] tab2 = new int[size];
        int indexZ4 = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab2[indexZ4] = tab[i][j];
                indexZ4++;
            }
        }

        for (int var : tab2) {
            System.out.print(var + ", ");
        }
        System.out.println();
    }
}
