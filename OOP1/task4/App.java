package Ex5_1;
import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	abstract protected int calc(); //추상 메소드 선언
	protected void input() { // 두 정수를 입력받는 메소드
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>>");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void run() { 
		input(); //정수를 입력받는다
		int res = calc(); //입력받은 정수를 오버라이딩해 연산한 값을 res에 전달
		System.out.println("계산된 값은 "+res);
	}
}

class Adder extends Calculator{
	public int calc() {
		return a+b; //Calculator 를 상속받는 Adder클래스에서 a+b의 값을 res에 전달
	}
}

class Subtracter extends Calculator{
	public int calc() {
		return a-b; //Calculator 를 상속받는 Subtracter클래스에서 a-b의 값을 res에 전달
	}
}
class Multiplier extends Calculator{
	public int calc() {
		return a*b; //Calculator 를 상속받는 Multiplier클래스에서 a*b의 값을 res에 전달
	}
}
class Divider extends Calculator{
	public int calc() {
		return a/b; //Calculator 를 상속받는 Divider클래스에서 a/b의 값을 res에 전달
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
