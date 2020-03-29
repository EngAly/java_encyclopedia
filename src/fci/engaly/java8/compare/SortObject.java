package fci.engaly.java8.compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fci.engaly.models.User;
import fci.engaly.utils.UserOperations;

public class SortObject {
	static List<User> usersList = UserOperations.getUsers();

	public static void main(String[] args) {

//		sort users by first name using anonymous class you can brief it with lambda expression
		Comparator<User> usersSorted = new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				return u1.getFname().compareTo(u2.getFname());
			}
		};

		
//		sort users by first name using lambda expression
		Comparator<User> usersSorted1 = (u1, u2) -> u1.getFname().compareTo(u2.getFname());
		
//		 give Collections either anonymous class instance or lambda expression
		
//		Collections using anonymous class
		Collections.sort(usersList, usersSorted);
		
//		Collections using lambda expression
		Collections.sort(usersList, usersSorted1);
		
//		get new state after arrange
		printUsers();
	}

	/**
	 * show all users 
	 */
	private static void printUsers() {
		for (User user : usersList)
			System.out.println(user.toString());

	}
}
