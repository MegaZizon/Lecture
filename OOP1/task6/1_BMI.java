package Ex7_1;
import java.util.*;

public class BMI {
	public static void main(String[] args) {//�ǽ��������� vector�� ����϶� ����ؼ� vector�� ����߽��ϴ�.
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		while(count!=10) {
			System.out.print((count+2000)+"���� Ű�� �����Ը� �Է��ϼ���");
			v.add(sc.nextInt());
			v.add(sc.nextInt());
			count++;
		}
		
		double n=(double)(v.get(1))/v.get(0);//���� bmi���� �ʱ�ȭ(2000��)
		count=0;
		int year=2000;
		
		while(count!=20) {
			if( ( (double)v.get(count+1)/v.get(count) )>=n) {
				n=(double)v.get(count+1)/v.get(count); //���� ū bmi���� �ʱ�ȭ
				year=2000+count/2;              	   //�ش�⵵ �Է�
			}
			count+=2;
		}
		System.out.printf("BMI������ ���� ���� ��:%d",year);

	}

 

}