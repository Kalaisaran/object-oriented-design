package Solid.InterfaceSegration.Strategy;


/*Steps to make this follow strategy

1. create a Strategy for

1. This violates the Liskov Principle as the child cant replace the parent object as
2. The is no UPI Pay available for the card other than Rupay, but still forced to be there - Violating Interface Segregatio
    - Keep only the methods that are common to all cards
    - removed doRefund(),  upiPayment(), intlPayment();
3. The way of doing refund varies for some cards and same for some cards
    - For the Special Behaviors create interfaces - doRefund(),  upiPayment(), intlPayment();
      Since we dont have multiple inheritance, make this as interface not abstract
    - so created UPI compatible Credit cart and have Rupa extend that
      Created RefundCompatbleCreditCard and have implemented by refund allowed credit card
      Same way Foreign Payment can be created.

Some more issues:
1. If some one stops supporting SwipeAndPay lot of code changes.
2. if The Refund logic of master card and Visa is same, but the code is duplicated.
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

}
