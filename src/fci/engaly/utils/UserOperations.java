package fci.engaly.utils;

import java.util.Arrays;
import java.util.List;

import fci.engaly.models.User;

public class UserOperations {

	private static List<User> user;
	public static List<User> getUsers() {
		user = Arrays.asList(new User(1, "ali", "badouin"), new User(1, "ahmed", "badouin"),
				new User(1, "mohamed", "badouin"), new User(1, "amira", "mohamed"), new User(1, "hoda", "soliman"));
		return user;
	}
}