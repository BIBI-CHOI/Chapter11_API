package system;

public class ClassExample {

	public static void main(String[] args) {
//		ù ��° ���
//		Class clazz = Car.class;
		
//		�� ��° ���
//		Class clazz = Class.forName("object.Member");
		
//		�� ��° ���
		Car c1 = new Car();
		Class clazz = c1.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage());
		

	}

}
