package RealWorldProblems.ParkingLot;

import java.util.Date;

public abstract class Payment {
    private double amount;
    private PaymentStatus status;
    private Date timeStamp;

    public abstract boolean initiateTransaction();
}
