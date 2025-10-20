package RealWorldProblems.ParkingLot;

public abstract class Vehicle {
    private String licenseNo;
    private ParkingTicket ticket;

    public abstract void assignTicket(ParkingTicket ticket);













    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public ParkingTicket getTicket() {
        return ticket;
    }

    public void setTicket(ParkingTicket ticket) {
        this.ticket = ticket;
    }
}
