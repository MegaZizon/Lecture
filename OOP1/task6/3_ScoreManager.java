package Ex7_3;
import java.util.*;

class Student{
	private String Stnum,name;
	private int attendscore,projectscore,middlescore,finalscore;
	private double sum;
	private String grade;
	private int count;
	
	public void set(String Stnum,String name,int attendscore, //�ʵ尪 �ʱ�ȭ
			int projectscore, int middlescore, int finalscore) {
		
		this.Stnum=Stnum; this.name=name;
		this.attendscore=attendscore;
		this.projectscore=projectscore;
		this.middlescore=middlescore;
		this.finalscore=finalscore;
		this.sum=(attendscore*0.1)+(projectscore*0.3)		//�� �������� ����� ���� ���ϱ�
				+(middlescore*0.3)+(finalscore*0.3);
	}
	public void PRT() {										//�ʵ尪 ���
		System.out.println("�й�:"+Stnum); 
		System.out.println("�̸�:"+name); 
		System.out.println("�⼮����:"+attendscore);
		System.out.println("�ǽ�����:"+projectscore); 
		System.out.println("�߰����:"+middlescore); 
		System.out.println("�⸻���:"+finalscore);
		System.out.printf("����: %.1f\n",sum);
		if(sum>=90) 
			System.out.println("����: A");
		else if(sum>=80) 
			System.out.println("����: B");
		else if(sum>=70) 
			System.out.println("����: C");
		else if(sum>=60) 
			System.out.println("����: D");
		else 
			System.out.println("����: F");
	}
	public String getStnum() {						//�й��� ����
		return this.Stnum;
	}
	public double getgrade() {						//������ ����
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
			System.out.print("���� �Է�(1), ���� ��ȸ(2), ���� ����(3), ����(4) /�������� �ְ�����"
					+ " �������� ������� ���(5)>>");
							//���������� �ְ������� �������� ��������� ����϶�� ����ϼ̱淡 ��±��� 
							//�ؾ��� �� ���Ƽ� 5�� �׸� �־����ϴ�.
			select=sc.nextInt();
			if(select==1) {			
				System.out.print("�й�:"); Stnum=sc.next(); 
				System.out.print("�̸�:"); name=sc.next();
				System.out.print("�⼮����:"); attendscore=sc.nextInt();
				System.out.print("�ǽ�����:"); projectscore=sc.nextInt();
				System.out.print("�߰����:"); middlescore=sc.nextInt();
				System.out.print("�⸻���:"); finalscore=sc.nextInt();
				
				sum=(attendscore*0.1)+(projectscore*0.3)+(middlescore*0.3) //���� ���ϱ�
						+(finalscore*0.3);

				System.out.printf("����: %.1f\n",sum);
				if(sum>=90) 						//������ ���� ���� ���ϱ�
					System.out.println("����: A");
				else if(sum>=80) 
					System.out.println("����: B");
				else if(sum>=70) 
					System.out.println("����: C");
				else if(sum>=60) 
					System.out.println("����: D");
				else 
					System.out.println("����: F");
				
				ar.add(new Student());
				ar.get(arsize).set(Stnum, name, attendscore,	//�Է°��� ArrayList 1���׸� ����ֱ�
						projectscore, middlescore, finalscore);
				arsize++;
			}
			else if(select==2) {
				System.out.print("��ȸ�� �л��� �й��� �Է��ϼ���:");	
				int i=0;
				Find=sc.next();	//�й� �Է¹ޱ�
				
				while(i!=arsize) { 							//�Է¹��� �й� ArrayList���� ã��
					if(Find.equals(ar.get(i).getStnum())) { //student Ŭ���� ���� �й��� �޾ƿ� �Է��Ѱ��� ���ϱ�
						ar.get(i).PRT();					//�Է°��� ��ġ�ϸ� �� �л��� ������ ����Ѵ�
						break;
					}
					i++;
				}
			}
			else if(select==3) {
				System.out.print("������ �л��� �й��� �Է��ϼ���:");	
				int i=0;
				Find=sc.next();
				
				while(i!=arsize) {							//�Է¹��� �й� ArrayList���� ã��
					if(Find.equals(ar.get(i).getStnum())) {//student Ŭ���� ���� �й��� �޾ƿ� �Է��Ѱ��� ���ϱ�
						ar.remove(i);						//�Է°��� ��ġ�ϸ� �ش� ArrayList�� �����Ѵ�
						arsize--;
						break;
					}
					i++;
				}
			}
			else if(select==4) {
				System.out.println("�����մϴ�...");	
				break;
			}
			else if(select==5) {
				double avg=0,min,max;
				min=ar.get(0).getgrade();		//min max�� 0���ε����� �ʱ�ȭ
				max=ar.get(0).getgrade();
				
				for(int i=0; i<ar.size(); i++) { //min max�� ArrayList-StudentŬ������ �������� �� ������ �����ϸ� �� ���� 
					if(ar.get(i).getgrade()<min) {
						min=ar.get(i).getgrade();
					}
					if(ar.get(i).getgrade()>max) {
						max=ar.get(i).getgrade();
					}
					avg+=ar.get(i).getgrade(); //ArrayList-studentŬ������ ������ ���� (�Ŀ� ����Ҷ� arraylistũ��� ����)
				}
				System.out.printf("�ְ���: %.1f ������: %.1f",max,min);
				System.out.printf("���������� �������: %.1f\n",(avg)/ar.size());
				
			}
			
		}

	}

}
