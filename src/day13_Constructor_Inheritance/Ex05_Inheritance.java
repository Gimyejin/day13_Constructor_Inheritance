package day13_Constructor_Inheritance;
class Calc01{
	public Calc01(String s) {
		System.out.println("calc 부모 생성자 "+s);
	}
	public void display() {
		System.out.println("나는 부모 계신기");
	}
}
class Computer01 extends Calc01{
	//상속을 받고있다?그럼 일단 부모 생성자를 찾아가고 나서 부모클래스가 끝나면 다시 돌아와서 
	//자식 클래스를 해결함
	public Computer01() {
		super("값 전달");
		System.out.println("com 자식 생성자");
	}
	public void print() {
		System.out.println("나는 컴퓨터");
	}
	public void display() {
		System.out.println("나는 자식 계신기");
	}
	/*
	 * public void display() { System.out.println("나는 계신기"); }
	 */
}
public class Ex05_Inheritance {

	public static void main(String[] args) {
		/*
		 상속
		 - extends를 통해 만든다
		 - 새로운 기능을 추가한다
		 
		 부모에게 값을 줄때 super를 사용한다.
		 */
		//Calc01 ca = new Calc01();
		//ca.display();
		
		Computer01 cp = new Computer01();
		cp.print();
		cp.display();
	}

}
