import java.util.Random;
class Zadanie2 {
    public static void main(String[] args) {
        Rakieta rakieta = new Rakieta("Apollo", 0);
        try {
            rakieta.zatankuj();
            rakieta.start();
            System.out.println("Start rakiety " + rakieta.nazwa + " zakończony pomyślnie.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static class Rakieta {
        String nazwa;
        int wagaPaliwa;

        public Rakieta(String nazwa, int wagaPaliwa) {
            this.nazwa = nazwa;
            this.wagaPaliwa = wagaPaliwa;
        }

        public void zatankuj() {
            Random rand = new Random();
            this.wagaPaliwa += rand.nextInt(2000);
        }

        public void start() throws Exception {
            if (this.wagaPaliwa < 1000) {
                throw new Exception("start anulowany - za mało paliwa");
            }
            // procedura startowa
        }
    }
}
