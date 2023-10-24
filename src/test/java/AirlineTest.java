import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirlineTest {

    Airline airline;
    Flight atlanta;
    Flight rome;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @BeforeEach
    void setUp() {
        airline = new Airline("Virgin Atlantic");
        atlanta = new Flight(1,"Atlanta");
        rome = new Flight(2,"Rome");
        passenger1 = new Passenger(1,"Bob","Bob@gmail.com");
        passenger2 = new Passenger(2,"Greg","Greg@gmail.com");
        passenger3 = new Passenger(3,"Steve", "Steve@gmail.com");

        airline.addFlight(atlanta);
        airline.addFlight(rome);
        atlanta.addPassengers(passenger1);
        atlanta.addPassengers(passenger2);
        rome.addPassengers(passenger3);
    }


    @Test
    void getName() {
        assertThat(airline.getName()).isEqualTo("Virgin Atlantic");
    }

    @Test
    void setName() {
        airline.setName("EasyJet");
        assertThat(airline.getName()).isEqualTo("EasyJet");
    }

    @Test
    void flightCount() {
        assertThat(airline.flightCount()).isEqualTo(2);
    }

    @Test
    void addFlight() {
        Flight switzerland = new Flight(4,"Switzerland");
        airline.addFlight(switzerland);
        assertThat(airline.flightCount()).isEqualTo(3);
    }

    @Test
    void cancelFlight() {
        airline.cancelFlight(atlanta);
        assertThat(airline.flightCount()).isEqualTo(1);
        assertThat(atlanta.passengerCount()).isEqualTo(0);
    }
}
