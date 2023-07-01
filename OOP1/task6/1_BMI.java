package Ex7_1;
import java.util.*;

public class BMI {
	public static void main(String[] args) {//실습문제에서 vector를 사용하라 명시해서 vector를 사용했습니다.
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		while(count!=10) {
			System.out.print((count+2000)+"년의 키와 몸무게를 입력하세요");
			v.add(sc.nextInt());
			v.add(sc.nextInt());
			count++;
		}
		
		double n=(double)(v.get(1))/v.get(0);//기준 bmi지수 초기화(2000년)
		count=0;
		int year=2000;
		
		while(count!=20) {
			if( ( (double)v.get(count+1)/v.get(count) )>=n) {
				n=(double)v.get(count+1)/v.get(count); //가장 큰 bmi지수 초기화
				year=2000+count/2;              	   //해당년도 입력
			}
			count+=2;
		}
		System.out.printf("BMI지수가 가장 높은 해:%d",year);

	}

 

}