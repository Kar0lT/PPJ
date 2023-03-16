public class zadanie06 {
    public static void main(String[] args) {
        double[] tab1 = new double[10];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < tab1.length; i++) {
            arr1[i] = (int) (1 + Math.random() * 100);
            arr2[i] = (int) (1 + Math.random() * 100);
        }
        System.out.println("Tablica 1");
        for (int var : arr1)
            System.out.print(var + ", ");
            System.out.println();
        System.out.println("Tablica 2");
        for (int var : arr2)
            System.out.print(var + ", ");
            System.out.println();
        System.out.println("Obie tablice");
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length)
                arr3[i] = arr1[i];
            else
                arr3[i] = arr2[i - arr1.length];
        }
        for (int var : arr3)
            System.out.print(var + ", ");
        System.out.println();
        int minInt = arr3[0], maxInt = arr3[0];
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < minInt) {
                minInt = arr3[i];
            }
            if (arr3[i] > maxInt) {
                maxInt = arr3[i];
            }
        }
        System.out.println("Minimalna to : " + minInt);
        System.out.println("Maaksymalna to : " + maxInt);
        System.out.println("Zakres");
        int[] arr4 = new int[maxInt - minInt + 1];
        for (int i = 0; i < arr4.length; i++)
            arr4[i] = minInt++;
        for (int var : arr4)
            System.out.print(var + ", ");
        System.out.println();
    }
}