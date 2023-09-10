package com.gufran.shadi.controllers;

import java.util.Scanner;

import com.gufran.shadi.dao.UserAccountDao;
import com.gufran.shadi.dao.UserAccountDaoImpl;
import com.gufran.shadi.model.Interest;
import com.gufran.shadi.model.UserAccount;

public class ScannerController {
	public void registerUser() {
		UserAccountDao dao = new UserAccountDaoImpl();
		UserAccount userAccount = new UserAccount();
		Scanner sc1 = new Scanner(System.in);
		// ----------user1----------------
		System.out.println("Enter id for user 1");
		userAccount.setId(sc1.nextInt());
		System.out.println("Enter age for user1");
		userAccount.setAge(sc1.nextInt());
		System.out.println("Enter username for user 1");
		userAccount.setUserName(sc1.next());
		System.out.println("Enter city for user 1");
		userAccount.setCity(sc1.next());
		System.out.println("Enter e-mail for user 1");
		userAccount.setEmail(sc1.next());
		System.out.println("Enter country for user 1");
		userAccount.setCountry(sc1.next());
		System.out.println("Enter gender for user 1 (m/f)");
		userAccount.setGender(sc1.next());
		System.out.println("Enter password for user 1");
		userAccount.setPassword(sc1.next());
		System.out.println("Enter phone-number for user 1");
		userAccount.setPhoneNumber(sc1.next());

		Interest interest = new Interest();
		System.out.println("Enter id for which you want to declare interests");
		interest.setId(sc1.nextInt());
		System.out.println("Enter likes");
		interest.setLikes(sc1.next());
		System.out.println("Enter hobbies");
		interest.setHobbies(sc1.next());

		dao.save(userAccount);
		// userAccount.setInterest(interest);
		System.out.println(dao.findById(1));
		// ---------user2---------------------

		userAccount.setId(2);
		userAccount.setAge(22);
		userAccount.setUserName("Jasmine");
		userAccount.setCity("mumbai");
		userAccount.setEmail("jasmine.khanna654@gmail.com");
		userAccount.setCountry("india");
		userAccount.setGender("f");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("98666-98777");

		Interest interest2 = new Interest();
		interest2.setId(2);
		interest2.setLikes("cooking");
		interest2.setHobbies("reading");

		dao.save(userAccount);
		// userAccount.setInterest(interest);
		System.out.println(dao.findById(2));
	}

	public void findAllUsers() {
		UserAccountDao dao = new UserAccountDaoImpl();
		UserAccount userAccount = new UserAccount();

		userAccount.setId(1);
		userAccount.setAge(22);
		userAccount.setUserName("Suraj");
		userAccount.setCity("mumbai");
		userAccount.setEmail("suraj.nishad675@gmail.com");
		userAccount.setCountry("india");
		userAccount.setGender("m");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("98724-12101");

		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("playing games");
		interest.setHobbies("coding");

		dao.save(userAccount);
		// userAccount.setInterest(interest);
		System.out.println(dao.findById(1));
		// ---------user2---------------------

		userAccount.setId(2);
		userAccount.setAge(22);
		userAccount.setUserName("Jasmine");
		userAccount.setCity("mumbai");
		userAccount.setEmail("jasmine.khanna654@gmail.com");
		userAccount.setCountry("india");
		userAccount.setGender("f");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("98666-98777");

		Interest interest2 = new Interest();
		interest2.setId(2);
		interest2.setLikes("cooking");
		interest2.setHobbies("reading");

		dao.save(userAccount);
		// userAccount.setInterest(interest);
		System.out.println(dao.findById(2));
	}

	public void findMatchingUsers() {
		UserAccountDao dao = new UserAccountDaoImpl();
		createUsers(dao);
		System.out.println(dao.findMatches(22, "mumbai"));
	}

	private void createUsers(UserAccountDao dao) {
		System.out.println("Match Found");
		UserAccount userAccount = new UserAccount();

		userAccount.setId(1);
		userAccount.setAge(22);
		userAccount.setUserName("Suraj");
		userAccount.setCity("mumbai");
		userAccount.setEmail("suraj.nishad675@gmail.com");
		userAccount.setCountry("india");
		userAccount.setGender("m");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("98724-12101");

		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("playing games");
		interest.setHobbies("coding");

		dao.save(userAccount); // userAccount.setInterest(interest);
		// System.out.println(dao.findById(1)); //---------user2---------------------

		userAccount.setId(2);
		userAccount.setAge(22);
		userAccount.setUserName("Jasmine");
		userAccount.setCity("mumbai");
		userAccount.setEmail("jasmine.khanna654@gmail.com");
		userAccount.setCountry("india");
		userAccount.setGender("f");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("98666-98777");

		Interest interest2 = new Interest();
		interest2.setId(2);
		interest2.setLikes("cooking");
		interest2.setHobbies("reading");

		dao.save(userAccount); // userAccount.setInterest(interest); //
		System.out.println(dao.findById(2));
	}

	public static void main(String[] args) {
		ScannerController controller = new ScannerController();
		controller.registerUser();
		// controller.findAllUsers();
		// controller.findMatchingUsers();

	}
}
