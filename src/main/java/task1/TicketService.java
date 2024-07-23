package task1;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class TicketService
{
    private static List<Ticket> tickets;

    public TicketService() {
        tickets = new ArrayList<>();
    }

    public static void main(String[] args )
    {
        long startTime = System.nanoTime();
        Ticket ticket1=new Ticket();
        long endTime = System.nanoTime();
        System.out.println(ticket1);
        System.out.println("The time of creation Ticket 1: "+(endTime - startTime)+" ns");

        startTime=System.nanoTime();
        Ticket ticket2=new Ticket("Red Hall",getUnixTimestamp(2024,11, 5, 21,30),'A');
        endTime=System.nanoTime();
        System.out.println(ticket2);
        System.out.println("The time of creation Ticket 2: "+(endTime - startTime)+" ns");

        startTime=System.nanoTime();
        Ticket ticket3= new Ticket("3H5","Joy",456,getUnixTimestamp(2024,11, 5, 21,30),true,'B',15.45);
        endTime=System.nanoTime();
        System.out.println(ticket3);
        System.out.println("The time of creation Ticket 3: "+(endTime - startTime)+" ns");
        addTicket(ticket1);
        addTicket(ticket2);
        addTicket(ticket3);

    }
    public static long getUnixTimestamp(int year,int month, int day, int hour,int min){
        return LocalDate.of(year,month,day).atTime(hour,min).toInstant(ZoneOffset.UTC).getEpochSecond();
    }

    public static boolean addTicket(Ticket ticket){
        return tickets.add(ticket);
    }

    public static Ticket findTicket(String ID){
        for(Ticket ticket: tickets){
            if(ID.equals(ticket.getID())) return ticket;
        }
        return null;
    }
}
