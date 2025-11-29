import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Repository repo = new Repository();
    Manager manager = new Manager(repo);

    Ticket ticket1 = new Ticket(1, 10_000, "SVX", "ROV", 150);
    Ticket ticket2 = new Ticket(2, 15_000, "SVX", "ROV", 170);
    Ticket ticket3 = new Ticket(3, 25_000, "SVX", "IKT", 240);

    @BeforeEach
    public void setup() {
        manager.save(ticket1);
        manager.save(ticket2);
        manager.save(ticket3);
    }

    @Test
    public void shouldTwoTickets() {
        Ticket[] expected = {ticket1, ticket2};
        Ticket[] actual = manager.findAll("SVX", "ROV");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOneTicket() {
        Ticket[] expected = {ticket3};
        Ticket[] actual = manager.findAll("SVX", "IKT");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindTickets() {
        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("SVX", "PHE");

        Assertions.assertArrayEquals(expected, actual);
    }
}
