package flightreservationsystem;

public abstract class Person {

	public String name;
	public String address;
	public String email;
	public String phone;

    public Person(String name, String address, String email, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

}