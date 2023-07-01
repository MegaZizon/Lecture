package Ex_6_2;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int human;
		int computer;
		String result;
		String Human="사용자";
		String Computer="컴퓨터";
		
		while(true) {
			System.out.print("게임하기(1), 끝내기(2)  >>");
			choice=sc.nextInt();
			
			if(choice==2)
				break;
			
			human=(int)(Math.random()*6+1)+(int)(Math.random()*6+1); //1~6사이의 값 2개를 더한 값을 human에 저장
			computer=(int)(Math.random()*6+1)+(int)(Math.random()*6+1);
			System.out.println("사용자"+human+":컴퓨터"+computer);
			
			result=(human>computer)?Human:Computer;  //승자판별식
			System.out.println(result+"가 이겼습니다.");
		}
		System.out.println("게임을 종료합니다...");
		
		sc.close();
	}

}
