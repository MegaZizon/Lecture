package Exercise4_Qestion;
import java.util.Scanner;

class People{
	private String Name,Job,Age,Gender,Blood;
	
	public People(String Name,String Job,String Age,String Gender,String Blood) {
		this.Name = Name;
		this.Job = Job;
		this.Age = Age;
		this.Gender = Gender;
		this.Blood = Blood;
	}
	public void print_info(int count) {	
		System.out.println("이름:"+Name+" 직업:"+Job+" 나이:"+Age+" 성별:"+Gender+" 혈액형:"+Blood);
	}
}

public class Exercise4_Qestion_1 {

	public static void main(String[] args) {
		int count=0,i;
		String a,b,c,d,e;
		Scanner s=new Scanner(System.in);
		System.out.print("등록할 사람의 수를 입력하세요");
		count=s.nextInt();
		People []p=new People[count];
		for(i=0; i<count; i++) {
			System.out.println("");
			System.out.print((i+1)+"번째 사람의 이름을 입력하세요");
			a=s.next();
			System.out.print((i+1)+"번째 사람의 직업을 입력하세요");
			b=s.next();
			System.out.print((i+1)+"번째 사람의 나이를 입력하세요");
			c=s.next();
			System.out.print((i+1)+"번째 사람의 성별을 입력하세요");
			d=s.next();
			System.out.print((i+1)+"번째 사람의 혈액형을 입력하세요");
			e=s.next();
			p[i]=new People(a,b,c,d,e);
		}
		for(i=0; i<count; i++) {
			System.out.println((i+1)+"번째 사람");
			p[i].print_info(count);
		}
		s.close();

	}

}
