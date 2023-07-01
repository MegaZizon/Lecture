package Exercise4_Qestion;
import java.util.Scanner;

class Cat{
	private String Name,Age,Model;
	public Cat(String Name,String Age,String Model) {
		this.Name=Name;
		this.Age=Age;
		this.Model=Model;
	}
	public void prt_cat() { //멤버함수
		System.out.println("이름:"+Name+" 나이:"+Age+" 품종:"+Model);
	}
}

public class CatArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cat cat[]=new Cat[2]; //2개짜리 객체 배열
		String name,age,model;
		System.out.print("첫번째 고양이의 이름을 입력하세요.");
		name = sc.next();
		System.out.print("첫번째 고양이의 나이를 입력하세요.");
		age = sc.next();
		System.out.print("첫번째 고양이의 품종을 입력하세요.");
		model = sc.next();
		cat[0]=new Cat(name,age,model);
		System.out.print("\n두번째 고양이의 이름을 입력하세요.");
		name = sc.next();
		System.out.print("두번째 고양이의 나이를 입력하세요.");
		age = sc.next();
		System.out.print("두번째 고양이의 품종을 입력하세요.");
		model = sc.next();
		cat[1]=new Cat(name,age,model);
		System.out.print("\n");
		
		int i;
		for(i=0; i<2; i++) {
			System.out.println((i+1)+"번째 고양이");
			cat[i].prt_cat();
		}
		sc.close();

	}

}
