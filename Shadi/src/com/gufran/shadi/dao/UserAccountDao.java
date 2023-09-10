package com.gufran.shadi.dao;
import java.util.List;
import com.gufran.shadi.model.UserAccount;

public interface UserAccountDao{
	void save(UserAccount account);
UserAccount findById(int id);
List<UserAccount>findAll();
List<UserAccount>findMatches(int age,String city);
void delete(int id);
}