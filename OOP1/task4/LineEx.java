package Ex5_3;

class Line {
	private int x1,y1,x2,y2; 
	
	public int getx1() {  //첫번째점의 x좌표 얻기
		return x1;
	}
	public int getx2() {  //첫번째점의 y좌표 얻기
		return x2;
	}
	public int gety1() {  //두번째점의 x좌표 얻기
		return y1;
	}
	public int gety2() {  //두번째점의 y좌표 얻기
		return y2;
	}
	
	public void deleteLine() {  //선(두 점) 삭제하기
		this.x1=0;
		this.x2=0;
		this.y1=0;
		this.y2=0;
		System.out.println("선을 삭제했습니다");
	}
	
	public void drawLine() {  //선(두 점) 출력하기
		System.out.printf("시작점(%d,%d) 끝점(%d,%d)\n",x1,y1,x2,y2);
	}
	
	public void setpoint(int x1,int y1,int x2,int y2) { // 점 위치 설정하기
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
}

public class LineEx extends Line {
	
	private String color,thick;
	
	
	public void setcolor(String color) { //색깔 설정하기
		this.color=color;
	}
	
	public void setthick(String thick) {  //굵기 설정하기
		this.thick=thick;
	}
	
	public void showLine(){  //선의 모든 정보 출력하기
		System.out.printf("시작점(%d,%d) 끝점(%d,%d)",getx1(),gety1(),getx2(),gety2());
		System.out.print("선색:"+color+" 선굵기:"+thick);
	}
	
	public static void main(String[] args) {

		LineEx L=new LineEx();
		
		L.setpoint(1,1,2,2);  //선 위치(1,1) (2,2)로 설정
		L.drawLine();         //출력
		L.deleteLine(); 	  //삭제
		L.drawLine();         //삭제된것 확인

		L.setcolor("BLUE");   //색 설정
		L.setthick("23");     //굵기 설정
		L.setpoint(4,4,5,5);  //선 위치(4,4) (5,5)로 설정
		L.showLine();         //선의 모든정보 출력
		
	}

}
