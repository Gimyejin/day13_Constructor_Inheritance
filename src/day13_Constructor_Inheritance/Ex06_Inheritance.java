package day13_Constructor_Inheritance;
class Calc06{
	public int n =123456;
	public String ss= "�θ� ���ڿ�";
	private String s="private ����";
	protected String sss = "protected ����";
	
	public Calc06(String s) {
		System.out.println(s +" �θ������");
	}
	public void test() {
		System.out.println("�θ� test ����");
	}
}
class Computer06 extends Calc06{
	//extends class1, class2 ���� ���߻�� �ȵ�
	public int n = 7777;
	public Computer06(String s) {
		super(s);
		System.out.println(s+": �ڽ� ������");
		super.test();//������ �ƴ϶� �θ��� test�� �����Ŵ
		this.test();//�� test
		System.out.println("this.n:"+ n);
		System.out.println("super.n:"+ super.n);
		System.out.println("super.ss:"+ super.ss); 
		//private�� ������ε� �Ұ�
		//System.out.println("super private s:"+ super.s); 
		
		//protected�� ����� ����
		System.out.println("super protected sss: "+super.sss);
		
	}
	public void test() {
		System.out.println("�ڽ� test ����");
	}
	
}
public class Ex06_Inheritance {
	public static void main(String[] args) {
		Computer06 com = new Computer06("����");
	}

}
