package Solid.InterfaceSegration.Strategy;

public class MasterCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    private RefundStrategy refundStrategy;

    public MasterCreditCard(){
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
