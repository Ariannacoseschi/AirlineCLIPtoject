import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {


    Passenger passenger;

   @BeforeEach

    void setUp(){
       passenger = new Passenger(1,"Colin", "dragonturtle@gmail.com");
   }



    @Test
    void canGetId() {
       assertThat(passenger.getId()).isEqualTo(1);
    }

    @Test
    void canSetId() {
       passenger.setId(2);
       assertThat(passenger.getId()).isEqualTo(2);
    }

    @Test
    void getName() {
       assertThat(passenger.getName()).isEqualTo("Colin");
    }

    @Test
    void setName() {
       passenger.setName("Zsolt");
       assertThat(passenger.getName()).isEqualTo("Zsolt");
    }

    @Test
    void getContactInfo() {
       assertThat(passenger.getContactInfo()).isEqualTo("dragonturtle@gmail.com");
    }

    @Test
    void setContactInfo() {
       passenger.setContactInfo("dinoturtle@gmail.com");
       assertThat(passenger.getContactInfo()).isEqualTo("dinoturtle@gmail.com");
    }
}
