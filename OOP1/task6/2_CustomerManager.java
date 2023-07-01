package Ex7_2;
import java.util.*;


class Customer{					//고객정보
	private String name;
	private int point;
	
	public Customer(String name,int point) {
		this.name=name;
		this.point=point;
	}
	public void PRT() {			//정해진 키값의 고객 정보 출력
		System.out.println("고객명:"+this.name+" 보유포인트:"+this.point);
	}
	public int getpoint() {		//포인트값 리턴
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

			System.out.print("(1)고객정보입력 (2)고객정보조회 (3)종료 (4)모든 고객정보출력 "); 
			// 모든 고객정보도 출력하는건지 아니면 키값에 맞는 고객정보를 출력하는건지 명시되어있지 않아서 2번(키값에맞는 고객정보 출력)
			// 4번(모든고객정보 출력) 둘다 구현하였습니다.
			
			select=sc.nextInt();   //메뉴선택
			
			if(select==1) {
				System.out.print("전화번호, 이름, 포인트 순으로 입력: ");
				phonenum=sc.next();
				name=sc.next();
				point=sc.nextInt();
				
				if(hm.containsKey(phonenum)) { 	//고객목록에 있는 전화번호 (키)를 입력시 덮어씌우고 포인트 누적값 더함
					Customer cm=hm.get(phonenum);
					rsvpoint=cm.getpoint();								//포인트 누적값 저장
					hm.put(phonenum, new Customer(name,point+rsvpoint));//포인트 누적값 더함
				}
				else{
					hm.put(phonenum, new Customer(name,point));			//중복되지 않으면 그냥 저장
				}
			}
			if(select==2) {
				System.out.print("찾는 고객의 전화번호를 입력하세요: ");			//키값에 맞추어 고객정보 출력
				Customer cm=hm.get(sc.next());
				cm.PRT();			
			}
			if(select==3) {	//종료
				System.out.println("종료합니다...");	
				break;
			}
			if(select==4) {	//모든 고객정보 출력
				Set<String> keys=hm.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()) {
					String key=it.next();
					Customer cm=hm.get(key);
					System.out.print("전화번호: "+key+" ");
					cm.PRT();	
				}
			}
			
		}
	}
}


