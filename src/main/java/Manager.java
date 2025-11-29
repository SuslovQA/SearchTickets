import java.util.Arrays;
import java.util.Comparator;

public class Manager {
    private Repository repo;
    TicketByFlightTimeDescComparator ticketByFlightTimeDesc = new TicketByFlightTimeDescComparator();

    public Manager(Repository repo) {
        this.repo = repo;
    }

    public void save(Ticket ticket) {
        repo.save(ticket);
    }

    public Ticket[] findAll(String departureAirport, String arrivalAirport, Comparator<Ticket> comparator) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.getTickets()) {
            if (ticket.matchesArrival(arrivalAirport))
                if (ticket.matchesDeparture(departureAirport)) {
                    Ticket[] tmp = new Ticket[result.length + 1];
                    for (int i = 0; i < result.length; i++) {
                        tmp[i] = result[i];
                    }
                    tmp[tmp.length - 1] = ticket;
                    result = tmp;
                    Arrays.sort(result, ticketByFlightTimeDesc);
                }
        }
        return result;
    }
}
