//1. System.arrayCopy()를 이용하여 2개의 배열을 연결하여 배열을 생성하고 
// 그 내용을 출력하시오. 단, 연결되는 각 배열은 키보드 입력을 받아 생성하시오.
// 배열의 내용 출력은 Arrays.toString() 활용.package Tranning2;
package Tranning2;
import java.util.Scanner;
import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {

	    String str;
	    
        Scanner scanner = new Scanner(System.in);
        String[] array1;
        System.out.print("공백(SpaceBar)으로 구분하여 첫번째 배열을 입력하시오."
       + "\n입력예시)hello world 123\n위는[hello, world, 123] 3개의 배열로 저장됨\n:");
        str = scanner.nextLine(); 
        array1 = str.split(" ");   //스페이스바로 구분하기
        
	    String[] array2;
        
        System.out.print("두번째 배열을 입력하시오:");
        str = scanner.nextLine(); 
        array2 = str.split(" "); 
        
        String[] a1a2 = new String[array1.length+array2.length]; //합칠 배열 a1a2생성
        System.arraycopy(array1, 0, a1a2, 0, array1.length);
        System.arraycopy(array2, 0, a1a2, array1.length, array2.length);
        
        System.out.println("첫번째 배열: " + Arrays.toString(array1));
        System.out.println("두번째 배열: " + Arrays.toString(array2));
        System.out.println("연결된 배열: " + Arrays.toString(a1a2));

        scanner.close();
    }
}

