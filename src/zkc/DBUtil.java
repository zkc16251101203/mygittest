package zkc;
import java.util.*;
import zkc.UserBean;
public class DBUtil {
private static DBUtil instance=new DBUtil();
private HashMap<String,UserBean> users =new HashMap<String,UserBean>();
private DBUtil() {
	UserBean user1=new UserBean();
	user1.setName("Jack");
	user1.setPassword("12345678");
	user1.setEmail("jack@it315.org");
	users.put("Jack", user1);
	UserBean user2=new UserBean();
	user2.setName("ZKC");
	user2.setPassword("123456");
	user2.setEmail("jack@it316.org");
	users.put("ZKC", user2);
}
public static DBUtil getInstance() {
	return instance;
}
public UserBean getUser(String userName) {
	UserBean user=(UserBean)users.get(userName);
	return user;
}
public boolean insertUser(UserBean user) {
	if(user==null) {
	return false;
	}
	String userName=user.getName();
	if(users.get(userName)!=null){
		return false;
	}
	users.put(userName, user);
	return true;
}
}
