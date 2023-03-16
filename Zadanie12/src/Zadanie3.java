class Drzewo {
    protected String nazwa;
    public Drzewo(String nazwa) {
        this.nazwa = nazwa;
    }
    public void wyswietlInformacje() {
        System.out.println("Nazwa drzewa: " + nazwa);
    }
    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        throw new DrzewoBezOwocoweException();
    }
}

class Sosna extends Drzewo {
    public Sosna() {
        super("sosna");
    }
}

class Modrzew extends Drzewo {
    public Modrzew() {
        super("modrzew");
    }
}

class Dab extends Drzewo {
    public Dab() {
        super("dab");
    }
}

class Osika extends Drzewo {
    public Osika() {
        super("osika");
    }
}

class Morelowiec extends Drzewo {
    public Morelowiec() {
        super("morelowiec");
    }
    public void zerwijOwoc() {
        System.out.println("Zerwano owoce z morelowca.");
    }
}

class Sliwowiec extends Drzewo {
    public Sliwowiec() {
        super("sliwowiec");
    }
    public void zerwijOwoc() {
        System.out.println("Zerwano owoce ze sliwowca.");
    }
}

class DrzewoBezOwocoweException extends Exception {
    public DrzewoBezOwocoweException() {
        super("Drzewo nie jest drzewem owocowym.");
    }
}

public class Zadanie3 {
    public static void main(String[] args) {
        Drzewo[] las = new Drzewo[] { new Sosna(), new Modrzew(), new Dab(), new Osika(), new Morelowiec(), new Sliwowiec() };
        for (Drzewo drzewo : las) {
            drzewo.wyswietlInformacje();
            try {
                drzewo.zerwijOwoc();
            } catch (DrzewoBezOwocoweException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}