import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Airline {

    private String name;
    private ArrayList<Flight> flights;

    public Airline(String name){
        this.name = name;
        this.flights = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int flightCount(){
        return this.flights.size();
    }

    public void addFlight(Flight newFlight){
        this.flights.add(newFlight);
    }

    public void displayFlights(){
        for(Flight flight : flights){
            System.out.println(flight.getId() + " " + flight.getDestination());
        }
    }

    public void cancelFlight(Flight oldFlight){
        ArrayList<Passenger> passenger = new ArrayList<>();
        oldFlight.setPassengers(passenger);
        this.flights.remove(oldFlight);

    }
}
