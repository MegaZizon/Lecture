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
		System.out.println("�̸�:"+Name+" ����:"+Job+" ����:"+Age+" ����:"+Gender+" ������:"+Blood);
	}
}

public class Exercise4_Qestion_1 {

	public static void main(String[] args) {
		int count=0,i;
		String a,b,c,d,e;
		Scanner s=new Scanner(System.in);
		System.out.print("����� ����� ���� �Է��ϼ���");
		count=s.nextInt();
		People []p=new People[count];
		for(i=0; i<count; i++) {
			System.out.println("");
			System.out.print((i+1)+"��° ����� �̸��� �Է��ϼ���");
			a=s.next();
			System.out.print((i+1)+"��° ����� ������ �Է��ϼ���");
			b=s.next();
			System.out.print((i+1)+"��° ����� ���̸� �Է��ϼ���");
			c=s.next();
			System.out.print((i+1)+"��° ����� ������ �Է��ϼ���");
			d=s.next();
			System.out.print((i+1)+"��° ����� �������� �Է��ϼ���");
			e=s.next();
			p[i]=new People(a,b,c,d,e);
		}
		for(i=0; i<count; i++) {
			System.out.println((i+1)+"��° ���");
			p[i].print_info(count);
		}
		s.close();

	}

}
