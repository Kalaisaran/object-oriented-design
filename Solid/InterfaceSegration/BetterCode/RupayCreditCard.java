package Solid.InterfaceSegration.BetterCode;

import Solid.InterfaceSegration.BetterCode.CreditCard;

public class RupayCreditCard extends CreditCard implements UPICompatibleCreditCard, RefundCompatibleCreditCard{


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

    }
}
