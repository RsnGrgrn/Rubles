public class Main {
    public static void main(String[] args) {
        int refill = 500;
        int balance = 100;
        int bonus = 0;
        int score = balance + refill;

        if (refill > 1000) {
            bonus = refill / 100;
            score = score + bonus;
        }

        System.out.println("Сумма пополнения счета = " + refill + ". Баланс лицевого счета = " + score + ", в том числе бонусных рублей = " + bonus);
    }
}