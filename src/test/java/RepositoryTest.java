import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    Repository repo = new Repository();

    Ticket ticket1 = new Ticket(1, 10_000, "SVX", "ROV", 150);
    Ticket ticket2 = new Ticket(2, 50_000, "DME", "PHE", 510);
    Ticket ticket3 = new Ticket(3, 25_000, "SVX", "IKT", 240);

    @Test
    public void shouldSaveTicket() {
        repo.save(ticket1);

        Ticket[] expected = {ticket1};
        Ticket[] actual = repo.getTickets();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldThrowException() throws Exception {
        repo.removeById(-10);
    }
}
