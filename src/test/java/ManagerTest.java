import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class ManagerTest {
    Repository repo = new Repository();
    Manager manager = new Manager(repo);
    TicketByFlightTimeDescComparator ticketByFlightTimeDesc = new TicketByFlightTimeDescComparator();

    Ticket ticket1 = new Ticket(1, 10_000, "SVX", "ROV", 150);
    Ticket ticket2 = new Ticket(2, 15_000, "SVX", "ROV", 170);
    Ticket ticket3 = new Ticket(3, 25_000, "SVX", "ROV", 140);

    @BeforeEach
    public void setup() {
        manager.save(ticket1);
        manager.save(ticket2);
        manager.save(ticket3);
    }


    @Test
    public void shouldNotFindTickets() {
        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("SVX", "PHE", ticketByFlightTimeDesc);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindWithFlightTimeSort() {
        Ticket[] expected = {ticket3, ticket1, ticket2};
        Ticket[] actual = manager.findAll("SVX", "ROV", ticketByFlightTimeDesc);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindTickets2() {
        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("ROV", "ROV", ticketByFlightTimeDesc);

        Assertions.assertArrayEquals(expected, actual);
    }
}
