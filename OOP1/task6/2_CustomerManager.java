package Ex7_2;
import java.util.*;


class Customer{					//������
	private String name;
	private int point;
	
	public Customer(String name,int point) {
		this.name=name;
		this.point=point;
	}
	public void PRT() {			//������ Ű���� �� ���� ���
		System.out.println("����:"+this.name+" ��������Ʈ:"+this.point);
	}
	public int getpoint() {		//����Ʈ�� ����
		return point;
	}
	
}

public class CustomerManager {

	public static void main(String[] args) {
		HashMap<String,Customer> hm=new HashMap<String,Customer>();
		int select,point,rsvpoint;
		String phonenum,name;
		
		Scanner sc=new Scanner(System.in);
		while(true) {

			System.out.print("(1)�������Է� (2)��������ȸ (3)���� (4)��� ��������� "); 
			// ��� �������� ����ϴ°��� �ƴϸ� Ű���� �´� �������� ����ϴ°��� ��õǾ����� �ʾƼ� 2��(Ű�����´� ������ ���)
			// 4��(�������� ���) �Ѵ� �����Ͽ����ϴ�.
			
			select=sc.nextInt();   //�޴�����
			
			if(select==1) {
				System.out.print("��ȭ��ȣ, �̸�, ����Ʈ ������ �Է�: ");
				phonenum=sc.next();
				name=sc.next();
				point=sc.nextInt();
				
				if(hm.containsKey(phonenum)) { 	//����Ͽ� �ִ� ��ȭ��ȣ (Ű)�� �Է½� ������ ����Ʈ ������ ����
					Customer cm=hm.get(phonenum);
					rsvpoint=cm.getpoint();								//����Ʈ ������ ����
					hm.put(phonenum, new Customer(name,point+rsvpoint));//����Ʈ ������ ����
				}
				else{
					hm.put(phonenum, new Customer(name,point));			//�ߺ����� ������ �׳� ����
				}
			}
			if(select==2) {
				System.out.print("ã�� ���� ��ȭ��ȣ�� �Է��ϼ���: ");			//Ű���� ���߾� ������ ���
				Customer cm=hm.get(sc.next());
				cm.PRT();			
			}
			if(select==3) {	//����
				System.out.println("�����մϴ�...");	
				break;
			}
			if(select==4) {	//��� ������ ���
				Set<String> keys=hm.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()) {
					String key=it.next();
					Customer cm=hm.get(key);
					System.out.print("��ȭ��ȣ: "+key+" ");
					cm.PRT();	
				}
			}
			
		}
	}
}


