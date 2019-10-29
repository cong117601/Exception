package userdefinedException;
//�û������� 
public class UserSever {
 public User login(String Userid,String psw) throws MyException {
	 if(!"admin".equals(Userid)) {
		 throw new MyException("�û����������");
	 }
	 if(!"1234".equals(psw)) {
		 throw new MyException("�����������");
	 }
	User user= new User("admin","1234",22);
	return user;
 }
}
