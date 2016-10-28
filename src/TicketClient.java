import java.util.Random;

/**
 * Created by mhan on 10/28/2016.
 */
public class TicketClient {
    public static void main(String[] args){
        Random rand = new Random();
        Ticket ticket1 = new Ticket(rand.nextInt(100));
        Ticket ticket2 = new Ticket(rand.nextInt(100), 60.0);
        System.out.println(ticket1);
        System.out.println(ticket2);
    }
}
