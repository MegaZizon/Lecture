package Exercise4_Qestion;
import java.util.Scanner;

class Cat{
	private String Name,Age,Model;
	public Cat(String Name,String Age,String Model) {
		this.Name=Name;
		this.Age=Age;
		this.Model=Model;
	}
	public void prt_cat() { //����Լ�
		System.out.println("�̸�:"+Name+" ����:"+Age+" ǰ��:"+Model);
	}
}

public class CatArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cat cat[]=new Cat[2]; //2��¥�� ��ü �迭
		String name,age,model;
		System.out.print("ù��° ������� �̸��� �Է��ϼ���.");
		name = sc.next();
		System.out.print("ù��° ������� ���̸� �Է��ϼ���.");
		age = sc.next();
		System.out.print("ù��° ������� ǰ���� �Է��ϼ���.");
		model = sc.next();
		cat[0]=new Cat(name,age,model);
		System.out.print("\n�ι�° ������� �̸��� �Է��ϼ���.");
		name = sc.next();
		System.out.print("�ι�° ������� ���̸� �Է��ϼ���.");
		age = sc.next();
		System.out.print("�ι�° ������� ǰ���� �Է��ϼ���.");
		model = sc.next();
		cat[1]=new Cat(name,age,model);
		System.out.print("\n");
		
		int i;
		for(i=0; i<2; i++) {
			System.out.println((i+1)+"��° �����");
			cat[i].prt_cat();
		}
		sc.close();

	}

}
