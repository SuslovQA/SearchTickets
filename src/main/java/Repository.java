public class Repository {
    private Ticket[] tickets = new Ticket[0];

    public Ticket[] getTickets() {
        return tickets;
    }

    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }

    public void removeById(int id) {
        try {
            Ticket[] tmp = new Ticket[tickets.length - 1];
            int copyToIndex = 0;

            for (Ticket ticket : tickets) {
                if (id == ticket.getId()) {
                    tmp[copyToIndex] = ticket;
                    copyToIndex++;
                }
            }
            tickets = tmp;
        } catch (Exception e) {
            System.out.println("Element with id: " + id + " not found!");
        }
    }

    public void save(Ticket ticket) {

        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }
}
