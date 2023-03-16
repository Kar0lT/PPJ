public class zadanie01 {
    public static void main(String[] args){
            //Zadanie 1
            //binarny
            byte a = -0b10000000;
            System.out.println(a);
            //ósemkowy
            short b = -0100000;
            System.out.println(b);
            //szesnastkowy
            int c = -0x80000000;
            System.out.println(c);
            //dziesietny
            long d = -9223372036854775808l;
            System.out.println(d);
            //dziesietny
            float e = -3.4028234663852886E38f;
            System.out.println(e);
            //dziesietny
            double f = -1.7976931348623157E308;
            System.out.println(f);
            char g = '0';
            System.out.println(g);
            boolean h = false;
            System.out.println(h);
            a = 0b11111111;
            b = 077777;
            c = 0x7FFFFFFF;
            d = 9223372036854775807l;
            e = -1.40129846432481E-45f;
            f = -4.9E-324;
            g = "65556";
            h = true;
        }
    }
