
public class ClassExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubscriberInfo obj1;
		obj1 = new SubscriberInfo("�̿���", "kaywon", "0000");

		obj1.setPhoneNo("010-0000-5930");
		obj1.setAddress("����� ���۱� ��2��");
		
		SubscriberInfo obj2
		= new SubscriberInfo("����", "id","pw","010-0100-0000","������");
		
		//System.out.println(obj1.name + obj1.id + obj1.password + obj1.phoneNo + obj1.address);
		System.out.println("�̸� : " + obj1.name);
		System.out.println("���̵� : " + obj1.id);
		System.out.println("��й�ȣ : " + obj1.password);
		System.out.println("��ȭ��ȣ : " + obj1.phoneNo);
		System.out.println("�ּ� : " + obj1.address);
		System.out.println("ģ���̸� : " + obj2.name);
		System.out.println("ģ�����̵� : " + obj2.id);
		System.out.println("ģ����й�ȣ : " + obj2.password);
		System.out.println("ģ����ȭ��ȣ : " + obj2.phoneNo);
		System.out.println("ģ���ּ� : " + obj2.address);
	}
	}
