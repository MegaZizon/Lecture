package Tranning1;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x1, y1, x2, y2, x3, y3, x4, y4, minx, miny, maxx,maxy;
		System.out.println("첫번째 점을 입력하세요.");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		System.out.println("두번째 점을 입력하세요.");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		x3=x1; x4=x2; y3=y2; y4=y1;  //네개의 점 설정.
		
		minx=x1; miny=y1; maxx=x2; maxy=y2;// 좌하단 점과 우상단 점 찾기 위한 직사각형의 나머지 두 점 설정
		
		if(minx>x2) // 좌하단 x좌표 설정
			minx=x2;
		else if(minx>x3)
			minx=x3;
		else if(minx>x4)
			minx=x4;
		
		if(miny>y2) // 좌하단 y좌표 설정
			miny=y2;
		else if(miny>y3)
			miny=y3;
		else if(miny>y4)
			miny=y4;
		
		if(maxx<x2) // 우상단 x좌표 설정
			maxx=x2;
		else if(maxx<x3)
			maxx=x3;
		else if(maxx<x4)
			maxx=x4;
		
		if(maxy<y2) // 우상단 y좌표 설정
			maxy=y2;
		else if(maxy<y3)
			maxy=y3;
		else if(maxy<y4)
			maxy=y4;	
		
		x3=minx; //좌상단 x좌표 설정
		y3=maxy; //좌상단 y좌표 설정
		x4=maxx; //우하단 x좌표 설정
		y4=miny; //우하단 y좌표 설정
	
		if(minx>=100 && miny>=100 && minx<=200 && miny<=200) //좌하단 모서리가 직사각형안에 들어가는가?
			System.out.println("두 직사각형이 겹칩니다.");
		else if(maxx>=100 && maxy>=100 && maxx<=200 && maxy<=200) //우상단 모서리가 직사각형안에 들어가는가?
			System.out.println("두 직사각형이 겹칩니다.");
		else if(x3>=100&& y3>=100 && x3<=200&& y3<=200) //좌상단 모서리가 직사각형안에 들어가는가?
			System.out.println("두 직사각형이 겹칩니다.");      
		else if(x4>=100&& y4>=100 && x4<=200&& y4<=200)  //우하단 모서리가 직사각형안에 들어가는가?
			System.out.println("두 직사각형이 겹칩니다.");
		else if(miny<=100 && y3>=200&&minx>=100&&minx<=200) //왼쪽 선이 겹치는가?
			System.out.println("두 직사각형이 겹칩니다.");
		else if(maxy>=200 && y2<=100&&maxx>=100&&maxx<=200) //오른쪽 선이 겹치는가?
			System.out.println("두 직사각형이 겹칩니다.");
		else if(minx<=100&&x4>=200&&miny>=100&&miny<=200) //아래 선이 겹치는가?
			System.out.println("두 직사각형이 겹칩니다.");
		else if(x3<=100&&maxx>=200&&maxy>=100&&maxy<=200) //위 선이 겹치는가?
			System.out.println("두 직사각형이 겹칩니다.");
		else if(minx<=100 && miny<=100 && maxx>=200 && maxy>=200) // 직사각형이 (100,100) (200,200)보다 커서 포함해서 겹치는가?
				System.out.println("두 직사각형이 겹칩니다.");		
		else
			System.out.println("두 직사각형이 겹치지 않습니다.");
		
		scanner.close();
	}

}
