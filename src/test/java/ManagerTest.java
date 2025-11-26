import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ManagerTest {
    Repository repo = new Repository();
    Manager manager = new Manager(repo);

    Ticket ticket1 = new Ticket(1, 10_000, "SVX", "ROV", 150);
    Ticket ticket2 = new Ticket(2, 50_000, "DME", "PHE", 510);
    Ticket ticket3 = new Ticket(3, 25_000, "SVX", "IKT", 240);

    @Test
    public void shouldFinAll() {
        manager.save(ticket1);
        manager.save(ticket2);
        manager.save(ticket3);

        System.out.println(Arrays.toString(manager.findAll()));
    }
}
