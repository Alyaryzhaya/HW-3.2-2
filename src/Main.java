import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int account = 15000;
        int refill = 1450;
        int bonus;

        bonus = refill > 1000 ? refill / 100 : 0;

//        if(refill > 1000) {
//            bonus = refill / 100;
//        } else {
//            bonus = 0;
//        }
        System.out.println("Сумма бонусов: " + bonus);
        System.out.println("Итоговый счет: " + (account + refill + bonus));

    }


}
