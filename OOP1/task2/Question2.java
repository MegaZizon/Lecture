//2. 10개의 임의의 정수를 입력 받아 int 배열에 저장한 후  
//중복된 값을 찾아 출력하는 프로그램을 작성하시오. 프로그램 실행 시  
//입력된 값을 먼저 출력 후 중복된 값을 출력하도록 함
package Tranning2;
import java.util.Scanner;
import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		int []jungsu = new int[10];
		int count=0,i=0,j;
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("10개의 정수 배열 입력:");
	    while(count!=10) {
        	jungsu[count] = scanner.nextInt(); 
        	count++;
        }
	    System.out.println("입력된 값: " + Arrays.toString(jungsu));
	    
	    int []arraya = new int[10];
	    int k;
	    int cnt=0;
	    int a=0;
	    int b=0;

		System.out.print("중복된 값: [");
		
	    for(i=0; i<10; i++) {
	    	for(j=i; j<10; j++) {
	    		if(i==j)
	    			continue;
	    		for(k=0; k<10; k++) {
	    			if(arraya[k]==jungsu[i])
	    				a=1;
	    		}
	    		
		    	if(a!=1&&jungsu[i]==jungsu[j]) {
		    		arraya[cnt]=jungsu[i];
		    		System.out.print(jungsu[i]+"  ");
		    		cnt++;
		    	}
		    	if(a==1&&jungsu[i]==jungsu[j]&&jungsu[i]==0&&b==0) {
		    		System.out.print(jungsu[i]+"  ");
		    		b=1;
		    	}
		    }
	    	a=0;
	    }
	    System.out.print("]");
	}
}



