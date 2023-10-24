import java.util.ArrayList;
import java.util.List;

public class Flight {

    private int id;
    private String destination;
    private List<Passenger> passengers;

    public Flight(int id, String destination){

        this.id = id;
        this.destination = destination;
        this.passengers = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public void addPassengers(Passenger newpassenger){
        this.passengers.add(newpassenger);
    }


    public void removePassengers(Passenger newpassenger){
        this.passengers.remove(newpassenger);
    }


    public int passengerCount(){

        return this.passengers.size();


    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
