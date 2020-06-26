package java_excercises_2_sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem("Cukier", 3, 3);
        orderItem1.print();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile produktów chcesz wproadzić do zamówienia? ");
        int numberOrderItems = scanner.nextInt();

        Order order1 = new Order(numberOrderItems);
        order1.addItem();
        System.out.println("Łączna wartość zamówienia wynosi: " + order1.getValue());
        System.out.println("Ilość produktów w zamówieniu: " + order1.getItemsCount());
        order1.print();
    }
}
