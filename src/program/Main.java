package program;

import java.util.Scanner;

import entities.Aluguel;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluguel[] vect = new Aluguel[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			int a = i + 1;
			System.out.println("Rent #" + a + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			vect[roomNumber] = new Aluguel(name, email, roomNumber);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getRoomNumber() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		sc.close();
	}

}
