public class Main {
    public static void main(String[] args) {
        System.out.println("Бонусы за пополнение!");

        int start = 500; // На счету абонента
        int y = 100;
        int x = 500; // Сумма пополнения
        if (x >= 1000) {
            System.out.println("Поздравляем, Вам начислены бонусы!");
            System.out.println("Бонусов");
            System.out.println(x / y);
            System.out.println("Итого");
            System.out.println((x / y) + start + x);
                               } else {
            System.out.println("Пополните на сумму от 1000 рублей и получи бонусы");
            System.out.println("Итого");
            System.out.println(x + start);
                    }
    }
}