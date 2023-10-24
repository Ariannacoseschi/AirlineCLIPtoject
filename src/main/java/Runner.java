import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Airline airline = new Airline("Atlantic Virgin");

        System.out.println("Welcome to BookingInJava");
        System.out.println("Manage Flight or passenger?");
        Scanner scanner = new Scanner(System.in);

        while(true){
            String response = scanner.nextLine();
            if( response.equals("Flight")){

                System.out.println("Would you like to display, add or cancel?");
                String answer = scanner.nextLine();
                if( answer.equals("Display")){
                    airline.displayFlights();

                }

            }
        




        }



    }


}
