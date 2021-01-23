package entities;

public class Aluguel {

	private String name, email;
	private int roomNumber;
			
	public Aluguel(String name, String email, int roomNumber) {
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
}
