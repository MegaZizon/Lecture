package Ex_6_1;

class MyPoint{
	private int x,y;
	public MyPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString() { //toString 재정의
		return "x="+x+", y="+y;
	}
	public boolean equals(Object obj) { //equals 재정의
		MyPoint p = (MyPoint)obj; //obj를 Point 타입으로 다운캐스팅
		if( (x == p.x)&&(y==p.y)) //현 객체의 x,y값과 매개변수로 받은 객체의 x,y값이 같다면
			return true;
		else return false;
	}
}

public class Point {

	public static void main(String[] args) {
		MyPoint a = new MyPoint(3,20);
		MyPoint b = new MyPoint(3,20);
		MyPoint c = new MyPoint(5,10);
		
		System.out.println(a); //a.toString()과 같음 
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));		
	}
}
