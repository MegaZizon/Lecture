package Ex7_3;
import java.util.*;

class Student{
	private String Stnum,name;
	private int attendscore,projectscore,middlescore,finalscore;
	private double sum;
	private String grade;
	private int count;
	
	public void set(String Stnum,String name,int attendscore, //필드값 초기화
			int projectscore, int middlescore, int finalscore) {
		
		this.Stnum=Stnum; this.name=name;
		this.attendscore=attendscore;
		this.projectscore=projectscore;
		this.middlescore=middlescore;
		this.finalscore=finalscore;
		this.sum=(attendscore*0.1)+(projectscore*0.3)		//각 비율들을 계산한 총점 구하기
				+(middlescore*0.3)+(finalscore*0.3);
	}
	public void PRT() {										//필드값 출력
		System.out.println("학번:"+Stnum); 
		System.out.println("이름:"+name); 
		System.out.println("출석점수:"+attendscore);
		System.out.println("실습과제:"+projectscore); 
		System.out.println("중간고사:"+middlescore); 
		System.out.println("기말고사:"+finalscore);
		System.out.printf("총점: %.1f\n",sum);
		if(sum>=90) 
			System.out.println("학점: A");
		else if(sum>=80) 
			System.out.println("학점: B");
		else if(sum>=70) 
			System.out.println("학점: C");
		else if(sum>=60) 
			System.out.println("학점: D");
		else 
			System.out.println("학점: F");
	}
	public String getStnum() {						//학번을 리턴
		return this.Stnum;
	}
	public double getgrade() {						//총점을 리턴
		return this.sum;
	}
	
	
}

public class ScoreManager {

	public static void main(String[] args) {
		String Stnum,name,Find;
		int attendscore,projectscore,middlescore,finalscore;
		int select,arsize=0;
		double sum;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> ar= new ArrayList<Student>();
		
		while(true) {
			System.out.print("성적 입력(1), 성적 조회(2), 성적 삭제(3), 종료(4) /수강생의 최고점수"
					+ " 최저점수 총점평균 출력(5)>>");
							//수강생들의 최고점수와 최저점수 총점평균을 계산하라고만 명시하셨길래 출력까지 
							//해야할 것 같아서 5번 항목에 넣었습니다.
			select=sc.nextInt();
			if(select==1) {			
				System.out.print("학번:"); Stnum=sc.next(); 
				System.out.print("이름:"); name=sc.next();
				System.out.print("출석점수:"); attendscore=sc.nextInt();
				System.out.print("실습과제:"); projectscore=sc.nextInt();
				System.out.print("중간고사:"); middlescore=sc.nextInt();
				System.out.print("기말고사:"); finalscore=sc.nextInt();
				
				sum=(attendscore*0.1)+(projectscore*0.3)+(middlescore*0.3) //총점 구하기
						+(finalscore*0.3);

				System.out.printf("총점: %.1f\n",sum);
				if(sum>=90) 						//총점에 따른 학점 구하기
					System.out.println("학점: A");
				else if(sum>=80) 
					System.out.println("학점: B");
				else if(sum>=70) 
					System.out.println("학점: C");
				else if(sum>=60) 
					System.out.println("학점: D");
				else 
					System.out.println("학점: F");
				
				ar.add(new Student());
				ar.get(arsize).set(Stnum, name, attendscore,	//입력값을 ArrayList 1번항목에 집어넣기
						projectscore, middlescore, finalscore);
				arsize++;
			}
			else if(select==2) {
				System.out.print("조회할 학생의 학번을 입력하세요:");	
				int i=0;
				Find=sc.next();	//학번 입력받기
				
				while(i!=arsize) { 							//입력받은 학번 ArrayList에서 찾기
					if(Find.equals(ar.get(i).getStnum())) { //student 클래스 에서 학번을 받아와 입력한값과 비교하기
						ar.get(i).PRT();					//입력값과 일치하면 그 학생의 정보를 출력한다
						break;
					}
					i++;
				}
			}
			else if(select==3) {
				System.out.print("삭제할 학생의 학번을 입력하세요:");	
				int i=0;
				Find=sc.next();
				
				while(i!=arsize) {							//입력받은 학번 ArrayList에서 찾기
					if(Find.equals(ar.get(i).getStnum())) {//student 클래스 에서 학번을 받아와 입력한값과 비교하기
						ar.remove(i);						//입력값과 일치하면 해당 ArrayList를 삭제한다
						arsize--;
						break;
					}
					i++;
				}
			}
			else if(select==4) {
				System.out.println("종료합니다...");	
				break;
			}
			else if(select==5) {
				double avg=0,min,max;
				min=ar.get(0).getgrade();		//min max값 0번인덱스로 초기화
				max=ar.get(0).getgrade();
				
				for(int i=0; i<ar.size(); i++) { //min max를 ArrayList-Student클래스의 총점값과 비교 조건이 만족하면 값 변경 
					if(ar.get(i).getgrade()<min) {
						min=ar.get(i).getgrade();
					}
					if(ar.get(i).getgrade()>max) {
						max=ar.get(i).getgrade();
					}
					avg+=ar.get(i).getgrade(); //ArrayList-student클래스의 총점을 더함 (후에 출력할때 arraylist크기로 나눔)
				}
				System.out.printf("최고점: %.1f 최저점: %.1f",max,min);
				System.out.printf("수강생들의 평균학점: %.1f\n",(avg)/ar.size());
				
			}
			
		}

	}

}
