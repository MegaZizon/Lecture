package Tranning1;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("여섯자리 양의 정수를 입력하시오");
		int a = scanner.nextInt();
		int b, c=100000;
		while(c!=0) {
			b=a/c;
			a=a-(b*c);
			c=c/10;
			System.out.print(b+" ");
		}
		
		scanner.close();
	}
}

