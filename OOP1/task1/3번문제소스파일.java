package Tranning1;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��(1~12)�� �Է��Ͻÿ�:");
		int month = scanner.nextInt();
		
		if(month==3 || month==4 || month==5)		
			System.out.print("���Դϴ�.");
		else if(month==6 || month==7 || month==8)		
			System.out.print("�����Դϴ�.");
		else if(month==9 || month==10 || month==11)		
			System.out.print("�����Դϴ�.");
		else if(month==12 || month==1 || month==2)		
			System.out.print("�ܿ��Դϴ�.");
		else
			System.out.print("�߸��� �Է��Դϴ�.");
		scanner.close();
	}

}
