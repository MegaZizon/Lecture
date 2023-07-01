//3. 주어진 정수 배열에서 최댓값과 최솟값을 찾는 프로그램을 작성하시오. 
//단, 배열의 크기는 10개이 며 값은 배열 선언 시 임의의 값으로 초기화함. 
//프로그램 실행 시 배열의 값을 먼저 출력 후 최댓값 과 최솟값을 출력하도록 함

package Tranning2;
import java.util.Random;
import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int i,max,min;
		int []array1= new int[10];
		
		for(i=0; i<10; i++) {
			array1[i]=random.nextInt();
		}
		
		max=array1[0];
		min=array1[0];
		for(i=0; i<10; i++) {
			if(array1[i]>max)
				max=array1[i];
			if(array1[i]<min)
				min=array1[i];
		}
		System.out.println("임의의 정수10개:" + Arrays.toString(array1));
		System.out.println("최댓값:" + max +" 최솟값:"+ min);
		
	}
}