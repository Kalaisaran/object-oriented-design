package Solid.InterfaceSegration.ProblematicCode;

public class DinersCreditCard extends CreditCard{


    @Override
    public void swipeAndPay() {

    }

    @Override
    public void tapAndPay() {

    }

    @Override
    public void onlinePayment() {

    }

    @Override
    public void doRefund() {
        throw new UnsupportedOperationException();
    }

    //Not Supported by Amex
    @Override
    public void upiPayment() {

    }

    @Override
    public void intlPayment() {

    }
}
