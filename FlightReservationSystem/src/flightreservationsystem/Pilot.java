package flightreservationsystem;


import flightreservationsystem.Person;
import java.util.List;

public class Pilot extends Person {

    public Pilot(String name, String address, String email, String phone) {
        super(name, address, email, phone);
    }
    

	public List<FlightInstance> getFlights() {
		// TODO - implement Pilot.getFlights
		throw new UnsupportedOperationException();
	}

}