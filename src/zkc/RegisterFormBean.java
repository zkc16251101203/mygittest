package zkc;
import java.util.*;
public class RegisterFormBean {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPassword2() {
	return password2;
}
public void setPassword2(String password2) {
	this.password2 = password2;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Map<String, String> getErrors() {
	return errors;
}
public void setErrors(Map<String, String> errors) {
	this.errors = errors;
}
private String password;
private String password2;
private String email;
private Map<String,String> errors=new HashMap<String,String>();
public boolean validate() {
	boolean flag=true;
	if(name==null||name.trim().equals("")) {
		errors.put("name", "ÇëÊäÈëÐÕÃû.");
		flag=false;
	}
	if(password==null||password.trim().equals("")) {
		errors.put("password","ÇëÊäÈëÃÜÂë.");
		flag=false;
	}
	else if(password.length()>12||password.length()<6) {
		errors.put("password", "ÇëÊäÈë6-12¸ö×Ö·û");
		flag=false;
	}
	if(password!=null&&!password.equals(password2)) {
		errors.put("password2", "Á½´ÎÊäÈëµÄÃÜÂë²»Æ¥Åä");
		flag=false;
	}
	if(email==null||email.trim().equals("")) {
		errors.put("email", "ÇëÊäÈëÓÊÏä.");
		flag=false;
	}
	else if(!email.matches("^[a-zA-z0-0_-]+@[a-zA-z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")) {
		errors.put("email", "ÓÊÏä¸ñÊ½´íÎó");
		flag=false;
	}
	
	return flag;
	
}
public void setErrorMsg(String err,String errMsg) {
	if((err!=null)&&(errMsg!=null)){
		errors.put(err, errMsg);
	}
}
public Map<String,String> getError() {
	return errors;
}
}

