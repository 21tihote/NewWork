public class Ticket {
    private String value;

    public Ticket(String value) {
        this.value = String.format("%06d", Integer.parseInt(value));
    }

    public boolean isLucky() {
        if (value.length() != 6) return false;
        int sumLeft = 0, sumRight = 0;
        for (int i = 0; i < 3; i++) {
            sumLeft += value.charAt(i) - '0';
            sumRight += value.charAt(i + 3) - '0';
        }
        return sumLeft == sumRight;
    }

    public static void main(String[] args) {
        Ticket t = new Ticket("123321");
        System.out.println(t.value + ": " + (t.isLucky() ? "Счастливый" : "Не счастливый"));
    }
}

