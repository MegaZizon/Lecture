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
		System.out.print("사각형의 개수 입력");
		int count= s.nextInt();
		Rect []arr=new Rect[count];
		
		for(i=0; i<count; i++) {
			System.out.printf((i+1)+"번째 사각형의 너비와 높이 입력");
			int a=s.nextInt();
			int b=s.nextInt();
			arr[i]=new Rect(a,b);
		}
		System.out.print("저장하였습니다...\n");
		
		for(i=0; i<count; i++) {
			sum+=arr[i].getArea();
		}
		float Avg = (float)(sum)/(float)(count);
		System.out.printf("사각형의 전체 합은%d ",sum);
		System.out.println("\n사각형 1개의 평균 넓이는 "+Avg);
		s.close();
	}

}