package RealWorldProblems.ParkingLot;

import java.util.Date;

public class CreditCard extends Payment{

    private  int cardNumber;
    private  String CardHolder;
    private Date expiryDate;
    public  boolean initiateTransaction(){
        return true;
    };
}