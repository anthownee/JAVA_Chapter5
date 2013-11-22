
public class ClassExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubscriberInfo obj1;
		obj1 = new SubscriberInfo("이우형", "kaywon", "0000");

		obj1.setPhoneNo("010-0000-5930");
		obj1.setAddress("서울시 동작구 상도2동");
		
		SubscriberInfo obj2
		= new SubscriberInfo("형진", "id","pw","010-0100-0000","수원시");
		
		//System.out.println(obj1.name + obj1.id + obj1.password + obj1.phoneNo + obj1.address);
		System.out.println("이름 : " + obj1.name);
		System.out.println("아이디 : " + obj1.id);
		System.out.println("비밀번호 : " + obj1.password);
		System.out.println("전화번호 : " + obj1.phoneNo);
		System.out.println("주소 : " + obj1.address);
		System.out.println("친구이름 : " + obj2.name);
		System.out.println("친구아이디 : " + obj2.id);
		System.out.println("친구비밀번호 : " + obj2.password);
		System.out.println("친구전화번호 : " + obj2.phoneNo);
		System.out.println("친구주소 : " + obj2.address);
	}
	}
