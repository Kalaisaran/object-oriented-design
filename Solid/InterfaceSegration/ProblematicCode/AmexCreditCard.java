package Solid.InterfaceSegration.ProblematicCode;

public class AmexCreditCard extends CreditCard{

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

    //Not Supported by Amex
    @Override
    public void upiPayment() {

    }

    @Override
    public void intlPayment() {

    }
}
