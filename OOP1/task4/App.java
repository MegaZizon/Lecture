package Ex5_1;
import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	abstract protected int calc(); //�߻� �޼ҵ� ����
	protected void input() { // �� ������ �Է¹޴� �޼ҵ�
		Scanner sc=new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void run() { 
		input(); //������ �Է¹޴´�
		int res = calc(); //�Է¹��� ������ �������̵��� ������ ���� res�� ����
		System.out.println("���� ���� "+res);
	}
}

class Adder extends Calculator{
	public int calc() {
		return a+b; //Calculator �� ��ӹ޴� AdderŬ�������� a+b�� ���� res�� ����
	}
}

class Subtracter extends Calculator{
	public int calc() {
		return a-b; //Calculator �� ��ӹ޴� SubtracterŬ�������� a-b�� ���� res�� ����
	}
}
class Multiplier extends Calculator{
	public int calc() {
		return a*b; //Calculator �� ��ӹ޴� MultiplierŬ�������� a*b�� ���� res�� ����
	}
}
class Divider extends Calculator{
	public int calc() {
		return a/b; //Calculator �� ��ӹ޴� DividerŬ�������� a/b�� ���� res�� ����
	}
}


public class App {

	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		Multiplier multiplier = new Multiplier();
		Divider divider = new Divider();
		
		adder.run();
		sub.run();
		multiplier.run();
		divider.run();
		
	}

}
