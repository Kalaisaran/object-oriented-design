package Solid.InterfaceSegration.Strategy;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    private RefundStrategy refundStrategy;

    public VisaCreditCard(){
        refundStrategy = new BankAccountRefundStrategy();
    }
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
        this.refundStrategy.doRefund();

    }
}
