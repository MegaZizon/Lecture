package Ex5_2;

class Person{
	private String talk;
	private String eat;  //필드 변수 생성
	public Person() {     //생성자 선언 및 초기화
		this.talk="말하기";
		this.eat="먹기";
	}
	
	public void describe() {  //필드 변수 출력
		System.out.print("Person: "+talk+" "+eat);
	}
	
}

class Student extends Person{ //Person 을 상속받음
	private String study;
	private String exam;
	public Student() {
		this.study="공부하기";
		this.exam="시험보기";
	}
	public void describe() { //메소드 오버라이딩
		super.describe();  //슈퍼클래스 필드 변수 출력 (정적 바인딩)
		System.out.print(" Student: "+study+" "+exam); // Student 클래스 필드 변수 출력
	}
}
class StudentWorker extends Student{ 
	private String working;
	private String faxsend;
	public StudentWorker() {
		this.working="일하기";
		this.faxsend="팩스보내기";
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
		this.research="연구하기";
		this.samplecatch="샘플채취하기";
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
		this.teach="가르치기";
		this.makeexam="시험문제만들기";
	}
	
	public void describe() {
		super.describe();
		System.out.print(" Professor "+teach+" "+makeexam);
	}
}

public class PersonEx {
	static void describe(Person p) { // Person을 상속받은 모든 객체들을 출력하는 함수
		p.describe();// p가 가리키는 객체에 오버라이딩한 describe 호출
		System.out.println("");
	}

	public static void main(String[] args) {
		
		describe(new Person());  //Person의 모든정보 출력
		describe(new Student());  // Student의 모든정보 출력
		describe(new StudentWorker());// StudentWorker의 모든정보 출력
		describe(new Researcher()); //Researcher의 모든정보 출력
		describe(new Professor()); //Professor의 모든정보 출력
		
	}

}