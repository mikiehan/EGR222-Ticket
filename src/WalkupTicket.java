/**
 * Created by mhan on 12/3/2016.
 */
public class WalkupTicket extends Ticket {
    public WalkupTicket(int number) {
        this(number, 50);
    }
    public WalkupTicket(int number, double price){
        super(number, price);
    }

    @Override
    public String toString() {
        return "Ticket Type: Walk-up," + super.toString();
    }
}
