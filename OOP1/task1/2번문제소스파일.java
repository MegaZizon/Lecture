package Tranning1;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count=0;
		System.out.println("����, ����, ������ �Ⱓ(��)�� �Է��ϼ��� ex(100����, 5%����, 10���̶��,�Է°�=<1000000 0.05 10>)");
		double money = scanner.nextDouble();
		double rate = scanner.nextDouble();
		int year = scanner.nextInt();
		while(year!=count){
			money=money*(1+rate);
			count++;
		}
		System.out.println(year+"���� ������ �հ�:"+(int)money+"��");
		scanner.close();
	}

}
