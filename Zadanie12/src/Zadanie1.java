class Alarm extends Exception {
    public Alarm(String message) {
        super(message);
    }
}

class DetektorDymu {
    public void sprawdz() throws Alarm {
        boolean smokeDetected = true; // Pamiętaj, że powinieneś tutaj ustawić flagę dymu za pomocą odpowiedniego sensora
        if (smokeDetected) {
            throw new Alarm("Dym wykryty!");
        }
    }
}

class Zadanie1 {
    public static void main(String[] args) {
        DetektorDymu detector = new DetektorDymu();
        try {
            detector.sprawdz();
            System.out.println("W pomieszczeniu nie wykryto dymu.");
        } catch (Alarm e) {
            System.out.println(e.getMessage());
        }
    }
}
