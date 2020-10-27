import java.util.Scanner;

public class TicketCreator {
    private Scanner sc = new Scanner(System.in);

    public Ticket createTicket() {
        System.out.print("Podaj wydarzenie: ");
        String event = sc.nextLine();
        System.out.print("Podaj miejsce wydarzenia: ");
        String place = sc.nextLine();
        System.out.print("Podaj typ biletu z podanych trzech | Online | | Standard | | Gift | : ");
        String type = sc.nextLine();
        System.out.print("Podaj ogólną cenę biletu: ");
        double price = sc.nextDouble();
        System.out.print("Podaj wartość zniżki w zakresie [0-1]: ");
        double discount = sc.nextDouble();
        sc.nextLine();

        return new Ticket(event, place, type, price, discount);
    }


}
