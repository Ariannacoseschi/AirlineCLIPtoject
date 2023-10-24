import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;

    Passenger passenger1;

    Passenger passenger2;

    @BeforeEach

    void setUp(){
        flight = new Flight(9,"Atlanta");
        passenger1 = new Passenger(2,"Bob","Bob@gmail.com");
        passenger2 = new Passenger(3,"Greg", "Greg@gmail.com");

        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);

    }


    @Test
    void canGetId() {

        assertThat(flight.getId()).isEqualTo(9);

    }

    @Test
    void setId() {

        flight.setId(101);
        assertThat(flight.getId()).isEqualTo(101);
    }

    @Test
    void getDestination() {

        assertThat(flight.getDestination()).isEqualTo("Atlanta");
    }

    @Test
    void setDestination() {

        flight.setDestination("New Jersey");
        assertThat(flight.getDestination()).isEqualTo("New Jersey");


    }

    @Test
    void countPassengers(){

        assertThat(flight.passengerCount()).isEqualTo(2);
    }



    @Test
    void addPassengers() {


        Passenger passenger3 =  new Passenger(3, "Steve", "Steve@gmail.com");
        flight.addPassengers(passenger3);
        assertThat(flight.passengerCount()).isEqualTo(3);

    }

    @Test
    void removePassengers() {

        flight.removePassengers(passenger2);
        assertThat(flight.passengerCount()).isEqualTo(1);

    }


}
