public
    class zadanie02 {
    public static void main(String[] args) {
        System.out.println("Zadnaie1");
        System.out.println("Ala ma kota, a kot ma Alę");
        
        System.out.println("Zadnaie2");
        System.out.println("Javac :c:\\Program Files\\Java\\jdk-19\\bin\\javac.exe");
		System.out.println("Java : c:\\Program Files\\Java\\jdk-19\\bin\\java.exe");
        
        System.out.println("Zadnaie3");
        System.out.println(15 + 3);
        System.out.println(15 - 3);
        System.out.println(15 * 3);
        System.out.println(15 / 3);
        System.out.println(15 % 3);
        System.out.println(2.2 + 1.3);
        System.out.println(2.2 - 1.3);
        System.out.println(2.2 * 1.3);
        System.out.println(2.2 / 1.3);
        System.out.println(2.2 % 1.3);
        /*
        System.out.println('c' + 'C');
        System.out.println('c' - 'C');
        System.out.println('c' * 'C');
        System.out.println('c' / 'C');
        System.out.println('c' % 'C');
        */
        System.out.println("Zadnaie4");
        for (int x=13; x<18; x+=2) 
        {
          boolean wynik = true;
          if(x<2)
          {
                wynik = false;
          }
          else for(int j=2; j<=x/2; j++)
          {
              if(x%j==0)
              {
                  wynik = false;
                  break; 
              }
          }
        System.out.println("Liczba " + x + " " + (wynik == true ? "jest" : "nie jest") + " liczbą pierwszą");
        }
        System.out.println("Zadnaie5");
        int x = 2 * 5 + 3 * 4 - 8;
        int y = 10 - 8 * 3 - 3 * 4 + 2;
        System.out.println(x==y && y<=x);
    }
    }