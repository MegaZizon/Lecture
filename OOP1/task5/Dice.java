package Ex_6_2;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int human;
		int computer;
		String result;
		String Human="�����";
		String Computer="��ǻ��";
		
		while(true) {
			System.out.print("�����ϱ�(1), ������(2)  >>");
			choice=sc.nextInt();
			
			if(choice==2)
				break;
			
			human=(int)(Math.random()*6+1)+(int)(Math.random()*6+1); //1~6������ �� 2���� ���� ���� human�� ����
			computer=(int)(Math.random()*6+1)+(int)(Math.random()*6+1);
			System.out.println("�����"+human+":��ǻ��"+computer);
			
			result=(human>computer)?Human:Computer;  //�����Ǻ���
			System.out.println(result+"�� �̰���ϴ�.");
		}
		System.out.println("������ �����մϴ�...");
		
		sc.close();
	}

}
