package Exercise4_Qestion;
import java.util.Scanner;

class Rect{
	private int width,height;
	public Rect(int width, int height) {
		this.width =width;
		this.height = height;
	}
	public int getArea() {return width*height;}
}
public class Exercise4_Qestion_3  {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		int sum=0;
		System.out.print("�簢���� ���� �Է�");
		int count= s.nextInt();
		Rect []arr=new Rect[count];
		
		for(i=0; i<count; i++) {
			System.out.printf((i+1)+"��° �簢���� �ʺ�� ���� �Է�");
			int a=s.nextInt();
			int b=s.nextInt();
			arr[i]=new Rect(a,b);
		}
		System.out.print("�����Ͽ����ϴ�...\n");
		
		for(i=0; i<count; i++) {
			sum+=arr[i].getArea();
		}
		float Avg = (float)(sum)/(float)(count);
		System.out.printf("�簢���� ��ü ����%d ",sum);
		System.out.println("\n�簢�� 1���� ��� ���̴� "+Avg);
		s.close();
	}

}