package java_excercises_2_sda;

public class OrderItem {

    private String itemName;
    private double itemQuantity;
    private double price;

    public OrderItem(String itemName, double itemQuantity,double price) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.price = price;
    }

    public double getValue() {
        return itemQuantity * price;
    }

    public boolean isCorrect() {
        return itemQuantity > 0 && price > 0;
    }

    public void print() {

        if (isCorrect()) {
            System.out.println(itemName + " w ilości " + itemQuantity + " po cenie " + price + ", koszt zamowienia: " + getValue());
        } else {
            System.out.println("Ilość sztuk lub cene powinna być większa od 0");
        }
    }
}
