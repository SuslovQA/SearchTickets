public class Repository {
    Ticket[] tickets = new Ticket[0];

    public Ticket[] getTickets() {
        return tickets;
    }

    public Ticket findById(int id) {
        for (Ticket ticket :
                tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }

    public void save(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length + 1; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

//    public void saveProduct(Product item) {
//    Product[] tmp = new Product[product.length + 1];
//        for (int i = 0; i < product.length; i++) {
//            tmp[i] = product[i];
//        }
//        tmp[tmp.length - 1] = item;
//        product = tmp;
}
