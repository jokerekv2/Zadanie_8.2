public class Ticket {
    private String event;
    private String place;
    private String type;
    private double price;
    private double discount;

    public Ticket(String event, String place, String type, double price, double discount) {
        this.event = event;
        this.place = place;
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Wydarzenie: " + event + "\nMiejsce wydarzenia: " + place + "\nTyp biletu: " + replaceType() + "\n" +
                "Cena podstawowa: " + price + "\nDostępny rabat: " + discount + "\n";
    }

    private String replaceType(){
        switch (type){
            case "Online":
                return "bilet internetowy";
            case "Standard":
                return "bilet standardowy";
            case "Gift":
                return "bilet prezentowy";
        }
        return null;
    }
}
