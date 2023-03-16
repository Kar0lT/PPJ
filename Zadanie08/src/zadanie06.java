public class zadanie06 {
    public static void main(String[] args) {
        int wrt = 5;
        System.out.println("Przed: "+wrt);
        modifyValue(wrt);
        System.out.println("Po: "+wrt);
    }
    public static void modifyValue(int val){
        System.out.println("Dostarczona zmienna: "+val);
        val = val *5;
        System.out.println("Zmienna po modyfikacji: "+val);
    }
}