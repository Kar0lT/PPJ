public class zadanie04 {
    public static void main(String[] args) {
        int[][] tab = {{ 1, 2, 3, 4}, { 5, 6, 7, 8}, { 9,10,11,12}, {13,14,15,16}};
        int[][] vec = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        int i=0;
        int j=0;
        int turn = 0;
        int endCount = 0;
        while (endCount<4){
            if (
                    j+vec[turn%4][1]<tab[0].length && i+ vec[turn%4][0]< tab.length && j+ vec[turn%4][1]>=0 && tab[i+vec[turn%4][0]][j+vec[turn%4][1]]!=0){
                System.out.print(tab[i][j]+" ");
                tab[i][j]=0;
                endCount=0;
                i += vec[turn%4][0];
                j += vec[turn%4][1];
            }
            else{
                turn++;
                endCount++;
            }
        }
        System.out.print(tab[i][j]);
    }
}