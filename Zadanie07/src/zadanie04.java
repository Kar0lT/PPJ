public class zadanie04 {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515, 407, 80};
        for (int val : arr) {
            int[] liczby = new int[3];
            byte j = 0;
            int a = val;
            for (int i = 2; i >= 0; i--) {
                liczby[j] = (int) (a / Math.pow(10, i));
                a -= ((int) (a / Math.pow(10, i))) * Math.pow(10, i);
                j++;
            }
            if (val == Math.pow(liczby[0], liczby.length) + Math.pow(liczby[1], liczby.length) + Math.pow(liczby[2], liczby.length))
                System.out.println(val + " - ta liczba jest liczba Armstronga");
            else
                System.out.println(val + " - ta liczba nie jest liczba Armstronga");
        }
    }
}