package Ex_6_1;

class MyPoint{
	private int x,y;
	public MyPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString() { //toString ������
		return "x="+x+", y="+y;
	}
	public boolean equals(Object obj) { //equals ������
		MyPoint p = (MyPoint)obj; //obj�� Point Ÿ������ �ٿ�ĳ����
		if( (x == p.x)&&(y==p.y)) //�� ��ü�� x,y���� �Ű������� ���� ��ü�� x,y���� ���ٸ�
			return true;
		else return false;
	}
}

public class Point {

	public static void main(String[] args) {
		MyPoint a = new MyPoint(3,20);
		MyPoint b = new MyPoint(3,20);
		MyPoint c = new MyPoint(5,10);
		
		System.out.println(a); //a.toString()�� ���� 
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));		
	}
}
