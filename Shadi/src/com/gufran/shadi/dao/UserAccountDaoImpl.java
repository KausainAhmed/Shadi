package com.gufran.shadi.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gufran.shadi.model.UserAccount;

public class UserAccountDaoImpl implements UserAccountDao {
	Map<Integer, UserAccount> userAccount = new HashMap<>();

	@Override
	public void save(UserAccount ua) {
		userAccount.put(ua.getId(), ua);
	}

	@Override
	public UserAccount findById(int id) {
		return userAccount.get(id);
	}

	@Override
	public List<UserAccount> findAll() {
		return new ArrayList<UserAccount>(userAccount.values());
	}

	@Override
	public List<UserAccount> findMatches(int age, String city) {
		Collection<UserAccount> accounts = userAccount.values();
		ArrayList<UserAccount> matches = new ArrayList<>();
		for (UserAccount userAccount : accounts) {
			if (userAccount.getAge() == age && userAccount.getCity().equals(city)) {
				matches.add(userAccount);
			}
		}
		return matches;
	}

	@Override
	public void delete(int id) {
		userAccount.remove(id);
	}

}
