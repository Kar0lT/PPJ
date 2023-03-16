public class zadanie01 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int a = 1; a<= n; a++){
            for (int b = n; b>0;b--){
                if (a*b <=n){
                    System.out.println(a*b);
                }
            }
        }
    }
}