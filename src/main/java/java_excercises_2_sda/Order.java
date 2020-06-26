package java_excercises_2_sda;

import java.util.Scanner;

public class Order {

    OrderItem[] itemTable;
    int numberOrderItems;
    int ordersInTable = 0;

    public Order(int numberOrderItems) {
        this.numberOrderItems = numberOrderItems;
    }

    public boolean isPlaceInOrder() {

        return numberOrderItems > ordersInTable;
    }

    public void addItem() {
        itemTable = new OrderItem[numberOrderItems];
        Scanner scanner = new Scanner(System.in);
        if (isPlaceInOrder()) {
            for (int i = 0; i < numberOrderItems; i++) {
                System.out.print("Podaj nazwę produktu: ");
                String itemName = scanner.next();
                System.out.print("Podaj ilość produktu: ");
                double itemQuantity = scanner.nextDouble();
                System.out.print("Podaj cenę jednostkową produktu: ");
                double price = scanner.nextDouble();
                itemTable[i] = new OrderItem(itemName, itemQuantity, price);
                ordersInTable++;
            }
        } else {
            System.out.println("Wpowadzono wszystkie zamówione produkty");
        }
    }

    public double getValue () {
        double orderValue = 0;

        for (int i = 0; i < itemTable.length; i++) {
            orderValue += itemTable[i].getValue();
        }
        return orderValue;
    }

    public double getItemsCount() {
        double itemsInOrder = 0;
        for (OrderItem orderItems: itemTable) {
            itemsInOrder += orderItems.getItemQuantity();
        }
        return itemsInOrder;
    }

    public void print() {
        for (OrderItem orderItems : itemTable) {
            System.out.println(orderItems.getItemName() + " w ilości " + orderItems.getItemQuantity() + " po cenie " + orderItems.getPrice() + ", koszt zamowienia: " + orderItems.getValue());
        }
    }
}
