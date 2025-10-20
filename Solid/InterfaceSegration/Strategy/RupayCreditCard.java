package Solid.InterfaceSegration.Strategy;

public class RupayCreditCard extends CreditCard implements UPICompatibleCreditCard, RefundCompatibleCreditCard {
    private RefundStrategy refundStrategy;

    public RupayCreditCard(){
        refundStrategy = new SameInstrumentRefundStrategy();
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
    public void upiPayments() {

    }

    @Override
    public void doRefund() {
        this.refundStrategy.doRefund();
    }
}
