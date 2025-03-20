package flightreservationsystem;


import flightreservationsystem.Person;
import java.util.List;

public class Crew extends Person {

    public Crew(String name, String address, String email, String phone) {
        super(name, address, email, phone);
    }
    

    
    public List<FlightInstance> getFlights() {
		// TODO - implement Crew.getFlights
		throw new UnsupportedOperationException();
	}

}