import java.util.LinkedList;
import java.util.List;

public class GunniBikes {
    public static void main(String[] args) {
        List<Bike> gunniBikes = new LinkedList<Bike>();

        // Create an instance of your bike subclass and add it to the list
        EthansBike ethansBike = new EthansBike("Canyon");
        gunniBikes.add(ethansBike);
        // ride all bikes
        gunniBikes.forEach(b -> b.ride());
    }
}