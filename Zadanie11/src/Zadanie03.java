public class Zadanie03 {
    public static void main(String[] args) {
        Spawacz spawacz = new Spawacz("Stanisław",15);
        System.out.println(spawacz.getStazpracy());
        spawacz.wyswietl();
    }
}
class Osoba{
    private String imie;
    public Osoba(String imie){
        this.imie = imie;
    }
    public String wyswietl(){
        return imie;
    }
}
class Spawacz
        extends Osoba{
    private int stazpracy;
    public Spawacz(String imie, int stazpracy) {
        super(imie);
        this.stazpracy = stazpracy;
    }
    public int getStazpracy() {
        return stazpracy;
    }
    public String wyswietl(){
        System.out.println(super.wyswietl()+ " " + stazpracy);
        return super.wyswietl() + " " + stazpracy;
    }
}