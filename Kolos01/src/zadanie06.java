public class zadanie06 {
    public static void main(String[] args) {
        int i = 0, m = 0;
        int counter = 1;
        int a = 0;
        while (i < 200) {
            if (counter > 10) {
                counter = 1;
            }
            switch (counter) {
                case 1: a = 1;break;
                case 2: a = 3;break;
                case 3: a = 5;break;
                case 4: a = 7;break;
                case 5: a = 9;break;
                case 6: a = 2;break;
                case 7: a = 4;break;
                case 8: a = 6;break;
                case 9: a = 8;break;
                case 10: a = 10;break;
            }
            if (i % 2 == 0) {
                if (a > m) {
                    m = a;
                }
            }
            i++;
            counter++;
        }
        System.out.print(m);
    }
}