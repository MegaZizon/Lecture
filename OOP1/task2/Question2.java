//2. 10���� ������ ������ �Է� �޾� int �迭�� ������ ��  
//�ߺ��� ���� ã�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���α׷� ���� ��  
//�Էµ� ���� ���� ��� �� �ߺ��� ���� ����ϵ��� ��
package Tranning2;
import java.util.Scanner;
import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		int []jungsu = new int[10];
		int count=0,i=0,j;
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("10���� ���� �迭 �Է�:");
	    while(count!=10) {
        	jungsu[count] = scanner.nextInt(); 
        	count++;
        }
	    System.out.println("�Էµ� ��: " + Arrays.toString(jungsu));
	    
	    int []arraya = new int[10];
	    int k;
	    int cnt=0;
	    int a=0;
	    int b=0;

		System.out.print("�ߺ��� ��: [");
		
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



