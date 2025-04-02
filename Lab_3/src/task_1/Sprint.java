package task_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sprint {
    private final int timeCapacity;
    private final int ticketLimit;
    private final List<Ticket> tickets;

    public Sprint(int timeCapacity, int ticketLimit) {
        this.timeCapacity = timeCapacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        return addTicket(userStory);
    }

    public boolean addBug(Bug bugReport) {
        return addTicket(bugReport);
    }

    private boolean addTicket(Ticket ticket) {
        if (ticket == null || ticket.isCompleted()) {
            return false;
        }
        if (tickets.size() >= ticketLimit || getTotalEstimate() + ticket.getEstimate() > timeCapacity) {
            return false;
        }
        tickets.add(ticket);
        return true;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public int getTotalEstimate() {
        return tickets.stream().mapToInt(Ticket::getEstimate).sum();
    }
}
