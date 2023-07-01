package Tranning1;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count=0;
		System.out.println("원금, 이율, 적금할 기간(년)을 입력하세요 ex(100만원, 5%이율, 10년이라면,입력값=<1000000 0.05 10>)");
		double money = scanner.nextDouble();
		double rate = scanner.nextDouble();
		int year = scanner.nextInt();
		while(year!=count){
			money=money*(1+rate);
			count++;
		}
		System.out.println(year+"년후 원리금 합계:"+(int)money+"원");
		scanner.close();
	}

}
