package day13_Constructor_Inheritance;

class Singleton04 {
	// new��� �������� ������ ���Ƶ�
	private static Singleton04 si;

	private Singleton04() {
		System.out.println("�⺻ ������ ����");
	}

	// �̰ɷ� ��ü�� ���ð���
	public static Singleton04 getInstance() {
		System.out.println("si: " + si);
		if(si == null)si = new Singleton04();// ���ο��� new������ ���� ������
		return si;
	}
}

public class Ex04_Singleton {
	public static void main(String[] args) {
		// Calendar cal = Calendar.getInstance();ó��
		Singleton04 si01 = Singleton04.getInstance();
		System.out.println("si01: " + si01);
		
		//������ ������� �����ڷ� ������
		Singleton04 si02 = Singleton04.getInstance();
		System.out.println("si02: " + si02);
	}

}
