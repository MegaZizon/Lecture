//3. �־��� ���� �迭���� �ִ񰪰� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�. 
//��, �迭�� ũ��� 10���� �� ���� �迭 ���� �� ������ ������ �ʱ�ȭ��. 
//���α׷� ���� �� �迭�� ���� ���� ��� �� �ִ� �� �ּڰ��� ����ϵ��� ��

package Tranning2;
import java.util.Random;
import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int i,max,min;
		int []array1= new int[10];
		
		for(i=0; i<10; i++) {
			array1[i]=random.nextInt();
		}
		
		max=array1[0];
		min=array1[0];
		for(i=0; i<10; i++) {
			if(array1[i]>max)
				max=array1[i];
			if(array1[i]<min)
				min=array1[i];
		}
		System.out.println("������ ����10��:" + Arrays.toString(array1));
		System.out.println("�ִ�:" + max +" �ּڰ�:"+ min);
		
	}
}