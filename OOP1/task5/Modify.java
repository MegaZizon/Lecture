package Ex_6_3;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Modify {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s= sc.nextLine();
			StringTokenizer st = new StringTokenizer(s," "); //공백으로 토큰구분
			
			if(s.equals("exit")) {
				System.out.print("종료합니다...");  //exit 입력 시 종료
				break;
			}
			
			while(st.hasMoreTokens()) { //토큰의 끝까지 반복
				String token = st.nextToken();
				
				while(true) {
					StringBuffer sb = new StringBuffer(token); 
					int index = (int)(Math.random()*token.length()); //토큰에서 바꿀 문자 인덱스 랜덤으로 찾기
					int i=(int)(Math.random()*26);
					char c = (char)('a'+i); //알파벳 a-z중 랜덤선택한것을 c에 대입
					
					if(token.charAt(index)!=c) { //토큰이 랜덤선택 한 것과 같지 않다면 대체 후 종료
						
						sb.replace(index, index+1, Character.toString(c)); //랜덤선택 인덱스(1개)만 char 변수 c로 변경
						token=sb.toString(); //언박싱 해서 토큰에 저장
						break;
					}
				}
				System.out.print(token+" "); //토큰 출력
			}
			System.out.println();
		}
		sc.close();
	}

}
