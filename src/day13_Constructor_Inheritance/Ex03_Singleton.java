package day13_Constructor_Inheritance;

import java.util.Calendar;

class Singleton01{
	public int num;
}
public class Ex03_Singleton {

	public static void main(String[] args) {
		//new�� ������� �ʾƵ� �����ڸ� ���� �� �ֱ� ��.
		//Calendar cal = Calendar.getInstance();
		
		Singleton01 si = new Singleton01();
		Singleton01 si02 = new Singleton01();
		//Singleton01 si02 = si �� �ϳ��� ������ ���� �̿��ϴ� ���̴�.(�̰� Singleton�̴�)
		si.num =123;
		si02.num =12344;
		System.out.println("si.num: "+si.num);
		System.out.println("si02.num: "+si02.num);
		
		System.out.println("si: "+si);
		System.out.println("si02: "+si02);

	}

}
