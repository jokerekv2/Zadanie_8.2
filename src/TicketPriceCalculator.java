public class TicketPriceCalculator {

    public double calculateDiscountPrice(Ticket ticket) {
        double priceAfterDiscount = 0;
        switch (ticket.getType()) {
            case "Online":
                return calculateOnlinePrice(ticket);
            case "Standard":
                return calculateStandardPrice(ticket);
            case "Gift":
                return calculateGiftPrice(ticket);
        }
        return priceAfterDiscount;
    }

    private double calculateOnlinePrice(Ticket ticket) {
        return ticket.getPrice() - (ticket.getPrice() * ticket.getDiscount());
    }

    private double calculateStandardPrice(Ticket ticket) {
        return calculateOnlinePrice(ticket) + 5;
    }

    private double calculateGiftPrice(Ticket ticket) {
        return calculateStandardPrice(ticket) + 0.05 * ticket.getPrice();
    }

}
