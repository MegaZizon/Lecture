package Ch9_3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Call extends JFrame{
	
	JButton bt[] = new JButton[15];		 //버튼 15개 생성
	JLabel Number=new JLabel();
	JLabel Calling=new JLabel();
	JLabel cancel=new JLabel();

	
	public Call() {
		super("전화걸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); 				//사용자정의 레이아웃
		Font ft=new Font("맑은고딕",Font.BOLD, 15);

		Number.setFont(ft);      		//번호의 폰트사이즈
		Number.setSize(300,33);			//번호레이블의 크기
		Number.setLocation(0,0);		//번호레이블의 위치
		Number.setBackground(Color.white);//번호레이블 배경색상
		Number.setOpaque(true);			//번호레이블 불투명도

		Calling.setFont(ft);
		Calling.setForeground(new Color(204,204,204));
		Calling.setSize(300,33);
		Calling.setLocation(0,33);
		Calling.setBackground(Color.white);
		Calling.setOpaque(true);

		cancel.setFont(ft);
		cancel.setForeground(new Color(204,204,204));
		cancel.setSize(300,33);
		cancel.setLocation(0,66);
		cancel.setBackground(Color.white);
		cancel.setOpaque(true);
		
		c.add(Number);	//컨텐트팬에 레이블 추가
		c.add(Calling);
		c.add(cancel);
		
		int row=0;
		int col=0;
		for(int i=0; i<15; i++) {	//버튼 위치 컨테이너에 정렬하기
			
			bt[i] = new JButton(""+Integer.toString(i-2)); //0~9 버튼 이름 지정
			bt[i].setSize(100,50);	
			bt[i].setLocation(col,row+100);
			bt[i].addActionListener(new AcEvent());		//각 버튼에 액티브이벤트리스너 추가
			if((i+1)%3==0) {  	//행 변경
				col=0;
				row+=50;
			}				
			else {				//열 위치변경
				col+=100;
			}
			c.add(bt[i]);
			
		}
		bt[0].setText("통화");
		bt[1].setText("지움");
		bt[2].setText("종료");
		bt[12].setText("*");
		bt[13].setText("0");
		bt[14].setText("#");
		
		setSize(315,390);
		setVisible(true);
	}
	
	public class AcEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {//버튼이 눌려졌을때 발생하는 이벤트
			JButton jb=(JButton)e.getSource();
			String S=jb.getText();		//S에 눌려진 버튼의 텍스트 값 저장
			String Nb=Number.getText(); //넘버 레이블에있는 텍스트값 Nb에 저장
			
			if(S.equals("통화")) {		//눌려진 버튼의 문자열이 통화라면
				Calling.setText("전화를 겁니다...") ; //Calling레이블에 출력
			}
			else if(S.equals("종료")) {	//종료라면
				cancel.setText("전화를 끊습니다.");   //Cancel 레이블에 출력
			}
			
			else if(S.equals("지움")) {			 //지움이라면
				Nb=Nb.substring(0,Nb.length()-1);//Nb에있는 문자열중 가장 뒤의 문자열 제거
				Number.setText(Nb);				//제거 후 Number레이블에 다시 출력
			}
			else {								//번호라면
				Number.setText(Nb+""+S);		//ㅣNumber레이블 뒤에 방금입력된 버튼의 문자열 추가
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		new Call();
	}

}
