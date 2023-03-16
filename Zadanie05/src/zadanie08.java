public class zadanie08 {
    public static void main(String[] args) {
        for (int i = 0; i<=10; i++){
            double suma = 0;
            for (int j = 0; j <= i;j++){
                suma += 1 / Math.pow(2, j);
            }
            System.out.println("Dla n = " + i + ", suma równa się: " +suma);
        }
    }
}
