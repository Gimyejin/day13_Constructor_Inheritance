package day13_Constructor_Inheritance;
class Calc01{
	public Calc01(String s) {
		System.out.println("calc �θ� ������ "+s);
	}
	public void display() {
		System.out.println("���� �θ� ��ű�");
	}
}
class Computer01 extends Calc01{
	//����� �ް��ִ�?�׷� �ϴ� �θ� �����ڸ� ã�ư��� ���� �θ�Ŭ������ ������ �ٽ� ���ƿͼ� 
	//�ڽ� Ŭ������ �ذ���
	public Computer01() {
		super("�� ����");
		System.out.println("com �ڽ� ������");
	}
	public void print() {
		System.out.println("���� ��ǻ��");
	}
	public void display() {
		System.out.println("���� �ڽ� ��ű�");
	}
	/*
	 * public void display() { System.out.println("���� ��ű�"); }
	 */
}
public class Ex05_Inheritance {

	public static void main(String[] args) {
		/*
		 ���
		 - extends�� ���� �����
		 - ���ο� ����� �߰��Ѵ�
		 
		 �θ𿡰� ���� �ٶ� super�� ����Ѵ�.
		 */
		//Calc01 ca = new Calc01();
		//ca.display();
		
		Computer01 cp = new Computer01();
		cp.print();
		cp.display();
	}

}
