package task1;

import java.time.LocalDate;
import java.time.ZoneOffset;

public class TicketService
{
    public static void main( String[] args )
    {
        long startTime = System.nanoTime();
        Ticket ticket1=new Ticket();
        long endTime = System.nanoTime();
        System.out.println(ticket1);
        System.out.println("The time of creation Ticket 1: "+(endTime - startTime)+" ns");

        startTime=System.nanoTime();
        Ticket ticket2=new Ticket(new char[]{'R','e','d',' ','H','a','l','l'},getUnixTimestamp(2024,11, 5, 21,30),'A');
        endTime=System.nanoTime();
        System.out.println(ticket2);
        System.out.println("The time of creation Ticket 2: "+(endTime - startTime)+" ns");

        startTime=System.nanoTime();
        Ticket ticket3= new Ticket(new char[]{'W','4','g'},new char[]{'R','e','d',' ','H','a','l','l'},new int[]{4,5,6},getUnixTimestamp(2024,11, 5, 21,30),true,'B',15.45);
        endTime=System.nanoTime();
        System.out.println(ticket3);
        System.out.println("The time of creation Ticket 3: "+(endTime - startTime)+" ns");
    }
    public static long getUnixTimestamp(int year,int month, int day, int hour,int min){
        return LocalDate.of(year,month,day).atTime(hour,min).toInstant(ZoneOffset.UTC).getEpochSecond();
    }
}
