package com.gufran.shadi.controllers;

import com.gufran.shadi.dao.UserAccountDao;
import com.gufran.shadi.dao.UserAccountDaoImpl;
import com.gufran.shadi.model.Interest;
import com.gufran.shadi.model.UserAccount;

public class UserAccountController {
	public void registerUser() {
		UserAccountDao dao = new UserAccountDaoImpl();
		UserAccount userAccount = new UserAccount();
		//----------user1----------------
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
		//userAccount.setInterest(interest);
		System.out.println(dao.findById(1));
		//---------user2---------------------
	
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
		//userAccount.setInterest(interest);
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
		//userAccount.setInterest(interest);
		System.out.println(dao.findById(1));
		//---------user2---------------------
	
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
		//userAccount.setInterest(interest);
		System.out.println(dao.findById(2)); 
	}
	
	
	public void findMatchingUsers() {
		UserAccountDao dao = new UserAccountDaoImpl();
		createUsers(dao);
		System.out.println(dao.findMatches(22, "mumbai"));
	}

	
	  private void createUsers(UserAccountDao dao) {
	  System.out.println("Match Found"); UserAccount userAccount = new
	  UserAccount();
	  
	  userAccount.setId(1); userAccount.setAge(22);
	  userAccount.setUserName("Suraj"); userAccount.setCity("mumbai");
	  userAccount.setEmail("suraj.nishad675@gmail.com");
	  userAccount.setCountry("india"); userAccount.setGender("m");
	  userAccount.setPassword("password");
	  userAccount.setPhoneNumber("98724-12101");
	  
	  Interest interest = new Interest(); interest.setId(1);
	  interest.setLikes("playing games"); interest.setHobbies("coding");
	  
	  dao.save(userAccount); //userAccount.setInterest(interest);
	  //System.out.println(dao.findById(1)); //---------user2---------------------
	  
	  userAccount.setId(2); userAccount.setAge(22);
	  userAccount.setUserName("Jasmine"); userAccount.setCity("mumbai");
	  userAccount.setEmail("jasmine.khanna654@gmail.com");
	  userAccount.setCountry("india"); userAccount.setGender("f");
	  userAccount.setPassword("password");
	  userAccount.setPhoneNumber("98666-98777");
	  
	  Interest interest2 = new Interest(); interest2.setId(2);
	  interest2.setLikes("cooking"); interest2.setHobbies("reading");
	  
	  dao.save(userAccount); //userAccount.setInterest(interest); //
	  System.out.println(dao.findById(2)); }
	 
	
	public static void main(String[] args) {
		UserAccountController controller = new UserAccountController();
		//controller.registerUser();
		//controller.findAllUsers();
		controller.findMatchingUsers();

	}
}
