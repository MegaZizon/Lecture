package Tranning1;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x1, y1, x2, y2, x3, y3, x4, y4, minx, miny, maxx,maxy;
		System.out.println("ù��° ���� �Է��ϼ���.");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���.");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		x3=x1; x4=x2; y3=y2; y4=y1;  //�װ��� �� ����.
		
		minx=x1; miny=y1; maxx=x2; maxy=y2;// ���ϴ� ���� ���� �� ã�� ���� ���簢���� ������ �� �� ����
		
		if(minx>x2) // ���ϴ� x��ǥ ����
			minx=x2;
		else if(minx>x3)
			minx=x3;
		else if(minx>x4)
			minx=x4;
		
		if(miny>y2) // ���ϴ� y��ǥ ����
			miny=y2;
		else if(miny>y3)
			miny=y3;
		else if(miny>y4)
			miny=y4;
		
		if(maxx<x2) // ���� x��ǥ ����
			maxx=x2;
		else if(maxx<x3)
			maxx=x3;
		else if(maxx<x4)
			maxx=x4;
		
		if(maxy<y2) // ���� y��ǥ ����
			maxy=y2;
		else if(maxy<y3)
			maxy=y3;
		else if(maxy<y4)
			maxy=y4;	
		
		x3=minx; //�»�� x��ǥ ����
		y3=maxy; //�»�� y��ǥ ����
		x4=maxx; //���ϴ� x��ǥ ����
		y4=miny; //���ϴ� y��ǥ ����
	
		if(minx>=100 && miny>=100 && minx<=200 && miny<=200) //���ϴ� �𼭸��� ���簢���ȿ� ���°�?
			System.out.println("�� ���簢���� ��Ĩ�ϴ�.");
		else if(maxx>=100 && maxy>=100 && maxx<=200 && maxy<=200) //���� �𼭸��� ���簢���ȿ� ���°�?
			System.out.println("�� ���簢���� ��Ĩ�ϴ�.");
		else if(x3>=100&& y3>=100 && x3<=200&& y3<=200) //�»�� �𼭸��� ���簢���ȿ� ���°�?
			System.out.println("�� ���簢���� ��Ĩ�ϴ�.");      
		else if(x4>=100&& y4>=100 && x4<=200&& y4<=200)  //���ϴ� �𼭸��� ���簢���ȿ� ���°�?
			System.out.println("�� ���簢���� ��Ĩ�ϴ�.");
		else if(miny<=100 && y3>=200&&minx>=100&&minx<=200) //���� ���� ��ġ�°�?
			System.out.println("�� ���簢���� ��Ĩ�ϴ�.");
		else if(maxy>=200 && y2<=100&&maxx>=100&&maxx<=200) //������ ���� ��ġ�°�?
			System.out.println("�� ���簢���� ��Ĩ�ϴ�.");
		else if(minx<=100&&x4>=200&&miny>=100&&miny<=200) //�Ʒ� ���� ��ġ�°�?
			System.out.println("�� ���簢���� ��Ĩ�ϴ�.");
		else if(x3<=100&&maxx>=200&&maxy>=100&&maxy<=200) //�� ���� ��ġ�°�?
			System.out.println("�� ���簢���� ��Ĩ�ϴ�.");
		else if(minx<=100 && miny<=100 && maxx>=200 && maxy>=200) // ���簢���� (100,100) (200,200)���� Ŀ�� �����ؼ� ��ġ�°�?
				System.out.println("�� ���簢���� ��Ĩ�ϴ�.");		
		else
			System.out.println("�� ���簢���� ��ġ�� �ʽ��ϴ�.");
		
		scanner.close();
	}

}
