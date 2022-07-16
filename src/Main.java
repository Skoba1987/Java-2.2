public class Main {
    public static void main(String[] args) {
        System.out.println("Бонусы за пополнение!");

        int start = 500; // На счету абонента
        int bonus = 100;
        int add = 500; // Сумма пополнения
        if (add >= 1000) {
            System.out.println("Поздравляем, Вам начислены бонусы!");
            System.out.println("Бонусов");
            System.out.println(add / bonus);
            System.out.println("Итого");
            System.out.println((add / bonus) + start + add);
        } else {
            System.out.println("Пополните на сумму от 1000 рублей и получи бонусы");
            System.out.println("Итого");
            System.out.println(add + start);
        }
    }
}




