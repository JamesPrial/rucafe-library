package cs213.jpsr.interfaces;

public interface MenuItem extends RUCafeObject {
    double itemPrice();

    int itemOrderNumber();

    int itemQuantity();

    boolean incrementQuantity();

    MenuItem decrementQuantity();
}
