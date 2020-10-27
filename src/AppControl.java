import java.util.Scanner;

public class AppControl {
    private Scanner sc = new Scanner(System.in);
    private BoxForTickets box = new BoxForTickets();

    public void appStart(){
        int choose = 0;
        do {
            System.out.println("Wybierz co chcesz zrobić: ");
            System.out.println("1. Dodaj bilet.");
            System.out.println("2. Wyświetl informację o biletach z ceną po uwzględniuniu rabatu: " );
            System.out.println("3. Wyjdź z programu. ");
            choose = appControl();
        }while (choose != 3);
    }

    public int appControl(){
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                box.addToBox();
                return choose;
            case 2:
                box.printBoxInfo();
                return choose;
            case 3:
                return choose;
        }
        return choose;
    }
}
