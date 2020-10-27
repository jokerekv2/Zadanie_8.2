public class BoxForTickets {
    private final static int MAX_TICKETS = 10;
    private Ticket[] tickets = new Ticket[MAX_TICKETS];
    private int numberOfTickets = 0;

    private TicketCreator ticketCreator = new TicketCreator();
    private TicketPriceCalculator priceCalculator = new TicketPriceCalculator();

    public void addToBox(){
        if (numberOfTickets < MAX_TICKETS){
            tickets[numberOfTickets] = ticketCreator.createTicket();
            numberOfTickets++;
        }
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void printBoxInfo(){
        for (int i = 0; i < numberOfTickets; i++) {
            System.out.println(tickets[i].toString() + "Cena uwzględniająca rabat: " +
                    priceCalculator.calculateDiscountPrice(tickets[i]) + "\n");
        }
    }
}
