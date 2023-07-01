package Ex5_2;

class Person{
	private String talk;
	private String eat;  //�ʵ� ���� ����
	public Person() {     //������ ���� �� �ʱ�ȭ
		this.talk="���ϱ�";
		this.eat="�Ա�";
	}
	
	public void describe() {  //�ʵ� ���� ���
		System.out.print("Person: "+talk+" "+eat);
	}
	
}

class Student extends Person{ //Person �� ��ӹ���
	private String study;
	private String exam;
	public Student() {
		this.study="�����ϱ�";
		this.exam="���躸��";
	}
	public void describe() { //�޼ҵ� �������̵�
		super.describe();  //����Ŭ���� �ʵ� ���� ��� (���� ���ε�)
		System.out.print(" Student: "+study+" "+exam); // Student Ŭ���� �ʵ� ���� ���
	}
}
class StudentWorker extends Student{ 
	private String working;
	private String faxsend;
	public StudentWorker() {
		this.working="���ϱ�";
		this.faxsend="�ѽ�������";
	}
	
	public void describe() {
		super.describe();
		System.out.print(" StudentWorker: "+working+" "+faxsend);
	}
	
}

class Researcher extends Person{
	private String research;
	private String samplecatch;
	
	public Researcher() {
		this.research="�����ϱ�";
		this.samplecatch="����ä���ϱ�";
	}
	
	public void describe() {
		super.describe();
		System.out.print(" Researcher: "+research+" "+samplecatch);
	}
}

class Professor extends Researcher{
	private String teach;
	private String makeexam;
	public Professor() {
		this.teach="����ġ��";
		this.makeexam="���蹮�������";
	}
	
	public void describe() {
		super.describe();
		System.out.print(" Professor "+teach+" "+makeexam);
	}
}

public class PersonEx {
	static void describe(Person p) { // Person�� ��ӹ��� ��� ��ü���� ����ϴ� �Լ�
		p.describe();// p�� ����Ű�� ��ü�� �������̵��� describe ȣ��
		System.out.println("");
	}

	public static void main(String[] args) {
		
		describe(new Person());  //Person�� ������� ���
		describe(new Student());  // Student�� ������� ���
		describe(new StudentWorker());// StudentWorker�� ������� ���
		describe(new Researcher()); //Researcher�� ������� ���
		describe(new Professor()); //Professor�� ������� ���
		
	}

}