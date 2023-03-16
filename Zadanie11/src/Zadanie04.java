public class Zadanie04 {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo(true,5,Drzewo.PARASOLOWATY);
        System.out.println(drzewo);
    }
}
class Drzewo{
    public static final String STOZKOWY = "stozkowy";
    public static final String KOLUMNOWY = "kolumnowy";
    public static final String OKRAGLAWY = "okraglawy";
    public static final String PARASOLOWATY = "parasolowaty";
    protected boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }
    @Override
    public String toString(){
        return "Drzewo (" + wiecznieZielone + ", " + wysokosc + ", "+ przekrojDrzewa+")";
    }
}