package Ch9_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gambling extends JFrame{
	
	JLabel Fir=new JLabel("     0");
	JLabel Sec=new JLabel("     0");
	JLabel Trd=new JLabel("     0");
	JLabel Txt=new JLabel("시작합니다.");
	
	public Gambling(){
		
		super("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();		
		JButton btn = new JButton("돌려돌려돌림판"); //빠칭코를 돌리는 버튼
		Font ft=new Font("맑은고딕",Font.ITALIC, 30);
		c.setLayout(null);
		
		Fir.setSize(100,50); //각 레이블 크기 설정
		Sec.setSize(100,50);
		Trd.setSize(100,50);
		Txt.setSize(150,50);
		btn.setSize(180,50);
		
		Fir.setFont(ft); // 각 레이블  폰트 설정
		Sec.setFont(ft);
		Trd.setFont(ft);
		Txt.setFont(new Font("맑은고딕",Font.BOLD,20));
		btn.setFont(new Font("맑은고딕",Font.BOLD,20));
		
		Fir.setLocation(30,50); // 각 레이블 위치 설정
		Sec.setLocation(190,50);
		Trd.setLocation(350,50);
		Txt.setLocation(30,150);
		btn.setLocation(200,150);
		
		Fir.setOpaque(true); //각 레이블 불투명도 설정
		Sec.setOpaque(true);
		Trd.setOpaque(true);
		
		Fir.setBackground(new Color(102,000,102)); //각 레이블 배경색 설정
		Sec.setBackground(new Color(102,000,102));
		Trd.setBackground(new Color(102,000,102));
		Fir.setForeground(Color.yellow);
		Sec.setForeground(Color.yellow);
		Trd.setForeground(Color.yellow);
		
		c.add(Fir); c.add(Sec); c.add(Trd); //컨텐트펜에 부착
		c.add(Txt); c.add(btn);
		
		btn.addActionListener(new dolimpan()); //버튼을 누를시 이벤트 발생
		
		setSize(500,300);
		setVisible(true);
	}
	
	public class dolimpan implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			String x=Integer.toString((int)(Math.random()*5));//랜덤한 정수값 스트링으로 변환 후 x에 담기
			String y=Integer.toString((int)(Math.random()*5));
			String z=Integer.toString((int)(Math.random()*5));
			Fir.setText("     "+x);//레이블에 출력
			Sec.setText("     "+y);
			Trd.setText("     "+z);
			
			//레이블 배경색 랜덤하게 변경
			Fir.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
			Sec.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
			Trd.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
												
			if(x.equals(y)&&x.equals(z)) { //x=y=z라면
				Txt.setText("축하합니다!!");  //txt레이블에 축하합니다 출력
			}
			else {						
				Txt.setText("아쉽군요");
			}
		}
	}

	public static void main(String[] args) {
		new Gambling();
	}

}
