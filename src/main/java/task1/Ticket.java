package task1;

import java.time.Instant;
import java.util.Arrays;

public class Ticket {
    private char[] ID;
    private char[] concertHall;
    private int[] eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private double allowedBackpack;


    public Ticket() {
        this.ID = new char[]{'7','u','6'};
        this.concertHall = new char[]{'R','e','d',' ','H','a','l','l'};
        this.eventCode = new int[]{6,7,4};
        this.time = Instant.now().getEpochSecond();;
        this.isPromo = false;
        this.stadiumSector='C';
        this.allowedBackpack = 15.23;
    }
    public Ticket(char[] ID, char[] concertHall, int[] eventCode, long time, boolean isPromo, char stadiumSector, double allowedBackpack) {
        this.ID = ID;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.allowedBackpack = allowedBackpack;
    }

    public Ticket(char[] concertHall, long time, char stadiumSector){
        this.ID = new char[]{'h','6','7'};
        this.concertHall = concertHall;
        this.eventCode = new int[]{'4','5','5'};
        this.time = time;
        this.isPromo = true ;
        this.stadiumSector = 'A';
        this.allowedBackpack = 15.5;
    }



    public char[] getID() {
        return ID;
    }

    public void setID(char[] ID) {
        this.ID = ID;
    }

    public char[] getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(char[] concertHall) {
        this.concertHall = concertHall;
    }

    public int[] getEventCode() {
        return eventCode;
    }

    public void setEventCode(int[] eventCode) {
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
                "ID " + Arrays.toString(ID).replaceAll("[\\,\\[\\]\\ ]", "") +
                "\n Concert hall - " + Arrays.toString(concertHall).replaceAll("[\\,\\[\\]\\ ]", "") +
                "\n Event Code - " + Arrays.toString(eventCode).replaceAll("[\\,\\[\\]\\ ]", "") +
                "\n Time - " + Instant.ofEpochSecond(time).toString() +
                "\n Promo - " + promo +
                "\n Stadium sector - " + stadiumSector +
                "\n Allowed backpack - " + allowedBackpack +" kg";
    }
}
