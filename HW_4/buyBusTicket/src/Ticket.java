import java.util.Date;

public class Ticket {

    private long id;
    private int zoneStart;
    private int zoneStop;
    private int routeNumber;
    private int place;
    private int price;
    private Date date;
    private boolean isLuggage;

    public Ticket(long id, int zoneStart, int zoneStop, int routeNumber, int place, int price, Date date,
            boolean isLuggage) {
        this.id = id;
        this.zoneStart = zoneStart;
        this.zoneStop = zoneStop;
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isLuggage = isLuggage;
    }

    public long getId() {
        return id;
    }

    public int getZoneStart() {
        return zoneStart;
    }

    public int getZoneStop() {
        return zoneStop;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public int getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public boolean isLuggage() {
        return isLuggage;
    }

    public void buyTicket (Date date, int routeNumber, int zoneStart, int zoneStop, int place, int price) {
        // Реализация метода покупки билета

    }

    public void refundTicket (long id) {
        // Реализация метода возврата билета
    }

}
