public class Main {
    public static void main(String[] args) {
        int refill = 1200;
        int bonus = 0;
        int score = 0;

        if (refill > 1000) {
            bonus = refill / 100;
            score = refill + bonus;
        }
        System.out.println("Сумма пополнения счета = " + refill + ". Баланс лицевого счета = " + score + ", в том числе бонусных рублей = " + bonus);
    }
}
