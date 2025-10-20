package Solid.InterfaceSegration.Strategy;

public class AmexCreditCard extends CreditCard implements RefundCompatibleCreditCard {

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
}
