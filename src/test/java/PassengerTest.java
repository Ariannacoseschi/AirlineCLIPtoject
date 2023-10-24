import org.junit.jupiter.api.BeforeEach;

public class PassengerTest {


    Passenger passenger;

   @BeforeEach

    void setUp(){
       passenger = new Passenger(1,"Colin", "dragonturtle@gmail.com");
   }


}
