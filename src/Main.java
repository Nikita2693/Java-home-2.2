public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        int balance = 600;
        int refill = 1260;
        int bonus = 0;
        int addRuble = 1;
        int addBonus = 100;


        if (refill > 1000) {
            bonus = (int) refill / addBonus * addRuble;
        }
        System.out.println("Баланс:" + (balance + refill + bonus));
        System.out.println("Бонус:" + bonus);
    }
}