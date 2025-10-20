package Solid.InterfaceSegration.ProblematicCode;


/*THis is not a good design

1. This violates the Liskov Principle as the child cant replace the parent object as
2. The is no UPI Pay available for the card other than Rupay, but still forced to be there - Violating Interface Segregation
3. The way of doing refund varies for some cards and same for some cards
*/

public abstract class CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    //getters and setters

    //Payment Methods
    public abstract void swipeAndPay();
    public abstract void tapAndPay();
    public abstract void onlinePayment();
    public abstract void doRefund();
    public abstract void upiPayment();
    public abstract void intlPayment();
}
