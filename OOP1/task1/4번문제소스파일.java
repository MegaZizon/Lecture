package Tranning1;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("�����ڸ� ���� ������ �Է��Ͻÿ�");
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

