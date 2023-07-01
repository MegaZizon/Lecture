package Ex5_3;

class Line {
	private int x1,y1,x2,y2; 
	
	public int getx1() {  //ù��°���� x��ǥ ���
		return x1;
	}
	public int getx2() {  //ù��°���� y��ǥ ���
		return x2;
	}
	public int gety1() {  //�ι�°���� x��ǥ ���
		return y1;
	}
	public int gety2() {  //�ι�°���� y��ǥ ���
		return y2;
	}
	
	public void deleteLine() {  //��(�� ��) �����ϱ�
		this.x1=0;
		this.x2=0;
		this.y1=0;
		this.y2=0;
		System.out.println("���� �����߽��ϴ�");
	}
	
	public void drawLine() {  //��(�� ��) ����ϱ�
		System.out.printf("������(%d,%d) ����(%d,%d)\n",x1,y1,x2,y2);
	}
	
	public void setpoint(int x1,int y1,int x2,int y2) { // �� ��ġ �����ϱ�
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
}

public class LineEx extends Line {
	
	private String color,thick;
	
	
	public void setcolor(String color) { //���� �����ϱ�
		this.color=color;
	}
	
	public void setthick(String thick) {  //���� �����ϱ�
		this.thick=thick;
	}
	
	public void showLine(){  //���� ��� ���� ����ϱ�
		System.out.printf("������(%d,%d) ����(%d,%d)",getx1(),gety1(),getx2(),gety2());
		System.out.print("����:"+color+" ������:"+thick);
	}
	
	public static void main(String[] args) {

		LineEx L=new LineEx();
		
		L.setpoint(1,1,2,2);  //�� ��ġ(1,1) (2,2)�� ����
		L.drawLine();         //���
		L.deleteLine(); 	  //����
		L.drawLine();         //�����Ȱ� Ȯ��

		L.setcolor("BLUE");   //�� ����
		L.setthick("23");     //���� ����
		L.setpoint(4,4,5,5);  //�� ��ġ(4,4) (5,5)�� ����
		L.showLine();         //���� ������� ���
		
	}

}
