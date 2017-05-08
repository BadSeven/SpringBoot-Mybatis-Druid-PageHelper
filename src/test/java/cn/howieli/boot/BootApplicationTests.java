package cn.howieli.boot;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.howieli.boot.dao.UserDao;
import cn.howieli.boot.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {
	@Autowired
	private UserDao userDao;

	//@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void testAddUser() {
		User user = new User();
		user.setId(0);
		user.setName("李昊");
		userDao.addUser(user);
		user.setId(1);
		user.setName("howieli");
		userDao.addUser(user);
	}
	
	//@Test
	public void testUpdateUser() {
		User user = new User();
		user.setId(1);
		user.setName("测试修改");
		userDao.updateUser(user);
	}
	
	//@Test
	public void testDeleteUser() {
		userDao.deleteUserById(1);
	}
	
	//@Test
	public void testSelectUser() {
		List<User> users = userDao.getUsers();
		for (User u : users) {
			System.out.println(u);
		}
	}

}
