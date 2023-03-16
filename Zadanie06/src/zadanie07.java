public class zadanie07 {
    public static void main(String[] args) {
        char[] tab = new char[]{'k', 'y', 'd'};
        char minimum = tab[1];
        int x = 0;
        for (int i = 0; i < tab.length; i++)
            if (tab[i] < minimum) {
                minimum = tab[i];
                x = i;
            }
        System.out.println(minimum + " - " + x);
    }
}
