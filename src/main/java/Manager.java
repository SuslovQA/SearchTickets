public class Manager {
    public Repository repo;

    public Manager(Repository repo) {
        this.repo = repo;
    }

    public void save(Ticket ticket) {
        repo.save(ticket);
    }

    public Ticket[] findAll() {
        Ticket[] all = repo.getTickets();
        Ticket[] tmp = new Ticket[all.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = all[i];

        }
        return tmp;
    }

}
