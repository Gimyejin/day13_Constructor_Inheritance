package day13_Constructor_Inheritance;
class Calc06{
	public int n =123456;
	public String ss= "부모 문자열";
	private String s="private 변수";
	protected String sss = "protected 변수";
	
	public Calc06(String s) {
		System.out.println(s +" 부모생성자");
	}
	public void test() {
		System.out.println("부모 test 실행");
	}
}
class Computer06 extends Calc06{
	//extends class1, class2 같은 다중상속 안됨
	public int n = 7777;
	public Computer06(String s) {
		super(s);
		System.out.println(s+": 자식 생성자");
		super.test();//내것이 아니라 부모의 test를 실행시킴
		this.test();//내 test
		System.out.println("this.n:"+ n);
		System.out.println("super.n:"+ super.n);
		System.out.println("super.ss:"+ super.ss); 
		//private는 상속으로도 불가
		//System.out.println("super private s:"+ super.s); 
		
		//protected는 상속은 가능
		System.out.println("super protected sss: "+super.sss);
		
	}
	public void test() {
		System.out.println("자식 test 실행");
	}
	
}
public class Ex06_Inheritance {
	public static void main(String[] args) {
		Computer06 com = new Computer06("전달");
	}

}
