package userdefinedException;
//�û���
public class User {
 private String userid;
 private String psw;
 private int age;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPsw() {
	return psw;
}
public void setPsw(String psw) {
	this.psw = psw;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public User(String userid, String psw, int age) {
	super();
	this.userid = userid;
	this.psw = psw;
	this.age = age;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", psw=" + psw + ", age=" + age + "]";
}
public User() {
	super();
}
 
}
