public class Main {
    public static void main(String[] args) {

        int sbalans = 55; // начальный счет
        int amount = 1300; // сумма пополнения

        int bonus;

        if (amount + sbalans > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        //int bonus = amount + sbalans > 1000 ? amount/100 : 0; Вариант решения с тернарным оператором
        System.out.println((bonus) + " Сумма бонуса");
        System.out.println((bonus + sbalans + amount) + " Итоговый счет");


    }
}