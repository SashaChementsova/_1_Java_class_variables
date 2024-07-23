package task1;

import java.time.Instant;
import java.util.Arrays;

public class Ticket {
    private String ID;
    private String concertHall;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private double allowedBackpack;


    public Ticket() {

    }
    public Ticket(String ID, String concertHall, int eventCode, long time, boolean isPromo, char stadiumSector, double allowedBackpack) {
        this.ID = ID;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.allowedBackpack = allowedBackpack;
    }

    public Ticket(String concertHall, long time, char stadiumSector){
        this.concertHall = concertHall;
        this.time = time;
        this.stadiumSector=stadiumSector;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(String concertHall) {
        this.concertHall = concertHall;
    }

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(char stadiumSector) {
        this.stadiumSector = stadiumSector;
    }

    public double getAllowedBackpack() {
        return allowedBackpack;
    }

    public void setAllowedBackpack(double allowedBackpack) {
        this.allowedBackpack = allowedBackpack;
    }

    @Override
    public String toString() {
        String promo = isPromo? "yes" : "no";
        return "Ticket " +
                "ID " + ID +
                "\n Concert hall - " + concertHall+
                "\n Event Code - " + eventCode +
                "\n Time - " + Instant.ofEpochSecond(time).toString() +
                "\n Promo - " + promo +
                "\n Stadium sector - " + stadiumSector +
                "\n Allowed backpack - " + allowedBackpack +" kg";
    }
}
