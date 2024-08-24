package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Date checkin, Date checkout, Integer roomNumber) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long duration(){
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public void updateDates(Date checkin,Date checkout){
        if(checkin.before(checkout)){
            this.checkin = checkin;
            this.checkout = checkout;
        }
    }

    @Override
    public String toString() {
        return  "Room"
                + roomNumber
                + ", Checkin: "
                + sdf.format(checkin)
                + ", Checkout: "
                + sdf.format(checkout)
                + ", "
                + duration()
                + " nigths";
    }
}
