package Solid.InterfaceSegration.ProblematicCode;

public class RupayCreditCard extends CreditCard{


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

    }

    @Override
    public void upiPayment() {

    }

    @Override
    public void intlPayment() {
        throw new UnsupportedOperationException("Rupay does only domestic Indian");

    }
}
