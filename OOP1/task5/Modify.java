package Ex_6_3;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Modify {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s= sc.nextLine();
			StringTokenizer st = new StringTokenizer(s," "); //�������� ��ū����
			
			if(s.equals("exit")) {
				System.out.print("�����մϴ�...");  //exit �Է� �� ����
				break;
			}
			
			while(st.hasMoreTokens()) { //��ū�� ������ �ݺ�
				String token = st.nextToken();
				
				while(true) {
					StringBuffer sb = new StringBuffer(token); 
					int index = (int)(Math.random()*token.length()); //��ū���� �ٲ� ���� �ε��� �������� ã��
					int i=(int)(Math.random()*26);
					char c = (char)('a'+i); //���ĺ� a-z�� ���������Ѱ��� c�� ����
					
					if(token.charAt(index)!=c) { //��ū�� �������� �� �Ͱ� ���� �ʴٸ� ��ü �� ����
						
						sb.replace(index, index+1, Character.toString(c)); //�������� �ε���(1��)�� char ���� c�� ����
						token=sb.toString(); //��ڽ� �ؼ� ��ū�� ����
						break;
					}
				}
				System.out.print(token+" "); //��ū ���
			}
			System.out.println();
		}
		sc.close();
	}

}
