public class zadanie02 {
    public static void main(String[] args) {
        char[] tab2 = new char[]{'d', 'k', 'c'};
        char min = tab2[1];
        int ind = 0;
        for (int i = 0; i < tab2.length; i++)
            if (tab2[i] < min) {
                min = tab2[i];
                ind = i;
            }
        System.out.println(min + " - " + ind);
    }
}