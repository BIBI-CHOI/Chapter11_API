package string;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subjext = "�ڹ� ���α׷���";
		
		int location = subjext.indexOf("���α׷���");
		System.out.println(location);
		
		if(subjext.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}

	}

}
