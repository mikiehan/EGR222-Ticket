/**
 * Created by mhan on 12/3/2016.
 */
public class StudentAdvanceTicket extends AdvanceTicket{

    public StudentAdvanceTicket(int number, int daysAdvanced){
        this(number, 50, daysAdvanced);
    }

    public StudentAdvanceTicket(int number, double price, int daysAdvanced){
        super(number, price, daysAdvanced);
        this.price *= 0.5;
    }

    @Override
    public String toString() {
        return "Ticket Type: Student Advanced,Number:" + number + ",Price:" + price;
    }
}
