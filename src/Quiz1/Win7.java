package Quiz1;

import java.io.IOException;
import java.util.Scanner;

public class Win7  {
	Scanner input = new Scanner(System.in);
	private int num;
	private String func;
	
	public void start() {
		System.out.println("==== ȯ �� �� �� �� ====");
		while (true) {
			System.out.println("1.���\t2.off");
			System.out.print("�Է� >>> ");
			num = input.nextInt();
			switch (num) {
			case 1:
				numberOne();
				break;
			case 2:
				System.out.println("�ý����� �����մϴ�.");;
				System.exit(1);
			}
		}
	}

	public void numberOne() {
		System.out.println("[��� ������ ���]");
		System.out.println("1 : �޸���");
		System.out.println("2 : ����");
		System.out.print("����� ��� �Է�: ");
		func = input.next();
		switch (func) {
		case "�޸���":
			note();
			break;
		case "����":
			calc();
			break;
		default:
			System.out.println("���� ����Դϴ�");
			break;
		}
	}

	private void note() {
		ProcessBuilder pro = new ProcessBuilder("notepad");
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void calc() {
		ProcessBuilder pro = new ProcessBuilder("calc");
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}