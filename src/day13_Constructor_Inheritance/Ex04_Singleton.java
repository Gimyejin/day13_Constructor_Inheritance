package day13_Constructor_Inheritance;

class Singleton04 {
	// new라는 연산자의 접근을 막아둠
	private static Singleton04 si;

	private Singleton04() {
		System.out.println("기본 생성자 실행");
	}

	// 이걸로 객체를 얻어올것임
	public static Singleton04 getInstance() {
		System.out.println("si: " + si);
		if(si == null)si = new Singleton04();// 내부에서 new생성자 만들어서 접근함
		return si;
	}
}

public class Ex04_Singleton {
	public static void main(String[] args) {
		// Calendar cal = Calendar.getInstance();처럼
		Singleton04 si01 = Singleton04.getInstance();
		System.out.println("si01: " + si01);
		
		//기존에 만들었던 생성자로 돌려줌
		Singleton04 si02 = Singleton04.getInstance();
		System.out.println("si02: " + si02);
	}

}
